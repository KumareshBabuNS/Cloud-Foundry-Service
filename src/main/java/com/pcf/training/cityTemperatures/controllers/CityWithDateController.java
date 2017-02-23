package com.pcf.training.cityTemperatures.controllers;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pcf.training.cityTemperatures.entities.CityWithDate;
import com.pcf.training.cityTemperatures.entities.TimelyTemperature;
import com.pcf.training.cityTemperatures.services.interfaces.ICityWithDateService;
import com.pcf.training.cityTemperatures.services.interfaces.ITimelyTemperatureService;

/**
 * Controller for {@link CityWithDate} and {@link TimelyTemperature}
 * 
 * @author apatel5
 *
 */
@RestController
@RequestMapping(value = "/city")
public class CityWithDateController {

	@Autowired
	public ICityWithDateService cityWithDateService;

	@Autowired
	public ITimelyTemperatureService timelyTemperatureService;

	@RequestMapping(value = "/add", produces = "application/json", method = RequestMethod.POST)
	public CityWithDate add(@RequestBody CityWithDate cityWithDate) {

		cityWithDate = cityWithDateService.create(cityWithDate);

		return cityWithDate;
	}

	@RequestMapping(value = "/get", produces = "application/json", method = RequestMethod.GET)
	public CityWithDate get(@RequestParam Integer id) {

		CityWithDate cityWithDate = cityWithDateService.read(id);

		return cityWithDate;
	}

	@RequestMapping(value = "/getAll", produces = "application/json", method = RequestMethod.GET)
	public List<CityWithDate> getAll() {

		return cityWithDateService.readAll();
	}

	@RequestMapping(value = "/update", produces = "application/json", method = RequestMethod.POST)
	public CityWithDate update(@RequestBody CityWithDate cityWithDate) {

		cityWithDate = cityWithDateService.update(cityWithDate);

		return cityWithDate;
	}

	@RequestMapping(value = "/delete", produces = "application/json", method = RequestMethod.DELETE)
	public Boolean delete(@RequestParam Integer id) {

		boolean status = cityWithDateService.delete(id);

		return status;
	}

	@RequestMapping(value = "/getDummyObject", produces = "application/json", method = RequestMethod.GET)
	public CityWithDate getDummyObject() {

		CityWithDate cityWithDate = new CityWithDate();

		cityWithDate.setCity("Electricity");
		cityWithDate.setDate(new Date(System.currentTimeMillis()));

		TimelyTemperature timelyTemperature1 = new TimelyTemperature();
		timelyTemperature1.setTime(new Time(System.currentTimeMillis()));
		timelyTemperature1.setTemperature(10d);

		TimelyTemperature timelyTemperature2 = new TimelyTemperature();
		timelyTemperature2.setTime(new Time(System.currentTimeMillis()));
		timelyTemperature2.setTemperature(20d);

		List<TimelyTemperature> listOfTemperature = new ArrayList<TimelyTemperature>();
		listOfTemperature.add(timelyTemperature1);
		listOfTemperature.add(timelyTemperature2);

		cityWithDate.setTimelyTemperatures(listOfTemperature);

		return cityWithDate;
	}
}
