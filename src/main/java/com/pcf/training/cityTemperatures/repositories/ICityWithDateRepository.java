package com.pcf.training.cityTemperatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcf.training.cityTemperatures.entities.CityWithDate;

@Repository
public interface ICityWithDateRepository extends JpaRepository<CityWithDate, Integer> {

	public CityWithDate findByCity(String city);
}
