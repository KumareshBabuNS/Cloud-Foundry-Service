package com.pcf.training.cityTemperatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pcf.training.cityTemperatures.entities.TimelyTemperature;

@Repository
public interface ITimelyTemperatureRepository extends JpaRepository<TimelyTemperature, Integer> {

}
