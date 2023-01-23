package io.questGlobal.quest_jpa_starter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//@Table(name ="EMPLOYEE_DATA")
//, schema="emp_schema"
@Entity
@Table(name ="EMPLOYEE_DATA")
public class Employee {
	
	@Id
	private int id;
	@Column(name = "employee_name")
	private String name;

	private int age;
//	@Column(unique = true,length=10,nullable = true,updatable=false)
	@Column(updatable=false)
	private String ssn;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	@Enumerated(EnumType.STRING)//default behaviour
	private EmployeeType type;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public EmployeeType getType() {
		return type;
	}
	public void setType(EmployeeType type) {
		this.type = type;
	}

}
