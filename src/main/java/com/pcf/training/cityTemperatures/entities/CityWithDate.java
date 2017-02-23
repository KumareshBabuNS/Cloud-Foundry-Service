package com.pcf.training.cityTemperatures.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CityWithDate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6359733402881139493L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private Date date;

	@Column
	private String city;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "temp_id", referencedColumnName = "id")
	private List<TimelyTemperature> timelyTemperatures;

	public CityWithDate() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<TimelyTemperature> getTimelyTemperatures() {
		return timelyTemperatures;
	}

	public void setTimelyTemperatures(List<TimelyTemperature> timelyTemperatures) {
		this.timelyTemperatures = timelyTemperatures;
	}
}
