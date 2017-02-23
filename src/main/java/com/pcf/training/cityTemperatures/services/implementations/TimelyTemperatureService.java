package com.pcf.training.cityTemperatures.services.implementations;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcf.training.cityTemperatures.entities.TimelyTemperature;
import com.pcf.training.cityTemperatures.repositories.ITimelyTemperatureRepository;
import com.pcf.training.cityTemperatures.services.interfaces.ITimelyTemperatureService;

/**
 * Service implementation for {@link TimelyTemperature}
 * 
 * @author apatel5
 *
 */
@Service
@Transactional
public class TimelyTemperatureService implements ITimelyTemperatureService {

	@Autowired
	public ITimelyTemperatureRepository timelyTemperatureRepository;

	@Override
	public TimelyTemperature create(TimelyTemperature timelyTemperature) {

		timelyTemperature = timelyTemperatureRepository.save(timelyTemperature);

		return timelyTemperature;
	}

	@Override
	public TimelyTemperature read(Integer id) {

		TimelyTemperature timelyTemperature = timelyTemperatureRepository.findOne(id);

		return timelyTemperature;
	}

	@Override
	public List<TimelyTemperature> readAll() {

		return timelyTemperatureRepository.findAll();
	}

	@Override
	public TimelyTemperature update(TimelyTemperature timelyTemperature) {

		timelyTemperature = timelyTemperatureRepository.save(timelyTemperature);

		return timelyTemperature;
	}

	@Override
	public boolean delete(Integer id) {

		timelyTemperatureRepository.delete(id);

		TimelyTemperature timelyTemperature = timelyTemperatureRepository.findOne(id);

		if (timelyTemperature == null) {

			return true;
		}

		return false;
	}

}
