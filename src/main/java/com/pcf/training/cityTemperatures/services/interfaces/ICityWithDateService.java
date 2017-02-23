package com.pcf.training.cityTemperatures.services.interfaces;

import java.util.List;

import com.pcf.training.cityTemperatures.entities.CityWithDate;

/**
 * Service interface for {@link CityWithDate}
 * 
 * @author apatel5
 *
 */
public interface ICityWithDateService {

	/**
	 * Method to create {@link CityWithDate} record in database
	 * 
	 * @author apatel5
	 * @param {@link
	 * 			CityWithDate}
	 * @return {@link CityWithDate}
	 */
	public CityWithDate create(CityWithDate cityWithDate);

	/**
	 * Method to read a record of {@link CityWithDate} from database by Id
	 * 
	 * @author apatel5
	 * @param Integer
	 *            id
	 * @return {@link CityWithDate} if found, else null
	 */
	public CityWithDate read(Integer id);

	/**
	 * Method to find a record of {@link CityWithDate} by city name from
	 * database
	 * 
	 * @author apatel5
	 * @param String
	 *            city
	 * @return {@link CityWithDate}
	 */
	public CityWithDate readByCity(String city);

	/**
	 * Method to read all the records of {@link CityWithDate} from the database
	 * 
	 * @author apatel5
	 * @return List<CityWithDate>
	 */
	public List<CityWithDate> readAll();

	/**
	 * Method to update a record of {@link CityWithDate} in the database
	 * 
	 * @author apatel5
	 * @param {@link
	 * 			CityWithDate}
	 * @return {@link CityWithDate}
	 */
	public CityWithDate update(CityWithDate cityWithDate);

	/**
	 * Method to delete a record of {@link CityWithDate} by Id
	 * 
	 * @author apatel5
	 * @param Integer
	 *            id
	 * @return boolean true if successfully deleted else false
	 */
	public boolean delete(Integer id);
}
