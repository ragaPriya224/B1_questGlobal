package io.questGlobal.quest_jpa_starter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccessCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date issuedDate;
	private boolean isActive;
	private String firmwareVersion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getFirmwareVersion() {
		return firmwareVersion;
	}
	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
	
	//1 access card for 1 employee
	//1 employee has one access card
	
	//card 1 belongs to emp1
	//card 2 belongs to emp2

}
