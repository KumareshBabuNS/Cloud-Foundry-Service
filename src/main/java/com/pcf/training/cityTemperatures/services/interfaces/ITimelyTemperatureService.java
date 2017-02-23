package com.pcf.training.cityTemperatures.services.interfaces;

import java.util.List;

import com.pcf.training.cityTemperatures.entities.TimelyTemperature;

/**
 * Service interface for {@link TimelyTemperature}
 * 
 * @author apatel5
 *
 */
public interface ITimelyTemperatureService {

	/**
	 * Method to create {@link TimelyTemperature} record in database
	 * 
	 * @author apatel5
	 * @param {@link
	 * 			TimelyTemperature}
	 * @return {@link TimelyTemperature}
	 */
	public TimelyTemperature create(TimelyTemperature timelyTemperature);

	/**
	 * Method to read a record of {@link TimelyTemperature} from database by Id
	 * 
	 * @author apatel5
	 * @param Integer
	 *            id
	 * @return {@link TimelyTemperature} if found, else null
	 */
	public TimelyTemperature read(Integer id);

	/**
	 * Method to read all the records of {@link TimelyTemperature} from the
	 * database
	 * 
	 * @author apatel5
	 * @return List<TimelyTemperature>
	 */
	public List<TimelyTemperature> readAll();

	/**
	 * Method to update a record of {@link TimelyTemperature} in the database
	 * 
	 * @author apatel5
	 * @param {@link
	 * 			TimelyTemperature}
	 * @return {@link TimelyTemperature}
	 */
	public TimelyTemperature update(TimelyTemperature timelyTemperature);

	/**
	 * Method to delete a record of {@link TimelyTemperature} by Id
	 * 
	 * @author apatel5
	 * @param Integer
	 *            id
	 * @return boolean true if successfully deleted else false
	 */
	public boolean delete(Integer id);
}
