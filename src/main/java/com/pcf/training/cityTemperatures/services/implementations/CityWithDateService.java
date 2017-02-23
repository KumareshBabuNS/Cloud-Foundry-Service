package com.pcf.training.cityTemperatures.services.implementations;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcf.training.cityTemperatures.entities.CityWithDate;
import com.pcf.training.cityTemperatures.repositories.ICityWithDateRepository;
import com.pcf.training.cityTemperatures.services.interfaces.ICityWithDateService;

/**
 * Service implementation for {@link CityWithDate}
 * 
 * @author apatel5
 *
 */
@Service
@Transactional
public class CityWithDateService implements ICityWithDateService {

	@Autowired
	public ICityWithDateRepository cityWithDateRepository;

	@Override
	public CityWithDate create(CityWithDate cityWithDate) {

		cityWithDate = cityWithDateRepository.save(cityWithDate);

		return cityWithDate;
	}

	@Override
	public CityWithDate read(Integer id) {

		CityWithDate cityWithDate = cityWithDateRepository.findOne(id);

		return cityWithDate;
	}

	@Override
	public CityWithDate readByCity(String city) {

		CityWithDate cityWithDate = cityWithDateRepository.findByCity(city);

		return cityWithDate;
	}

	@Override
	public List<CityWithDate> readAll() {

		return cityWithDateRepository.findAll();
	}

	@Override
	public CityWithDate update(CityWithDate cityWithDate) {

		cityWithDate = cityWithDateRepository.save(cityWithDate);

		return cityWithDate;
	}

	@Override
	public boolean delete(Integer id) {

		cityWithDateRepository.delete(id);

		CityWithDate cityWithDate = cityWithDateRepository.findOne(id);

		if (cityWithDate == null) {

			return true;
		}

		return false;
	}

}
