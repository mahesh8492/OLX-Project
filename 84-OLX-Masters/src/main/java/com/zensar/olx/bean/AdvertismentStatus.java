package com.zensar.olx.bean;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="olx_adv_status")
public class AdvertismentStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String status;
	public AdvertismentStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public AdvertismentStatus() {
		super();
	}
	public AdvertismentStatus(String status) {
		super();
		this.status = status;
	}
	public AdvertismentStatus(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdvertismentStatus [id=" + id + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdvertismentStatus other = (AdvertismentStatus) obj;
		return id == other.id;
	}
	
}
