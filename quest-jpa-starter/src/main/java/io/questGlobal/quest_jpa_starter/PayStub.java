package io.questGlobal.quest_jpa_starter;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class PayStub {
	@Id
	@GeneratedValue
	private int id;
//	@Column(name="start")
	private Date payPeriodStart;
//	@Column(name="end")
	private Date payPeriodEnd;
	private float salary;
	
	@ManyToOne
	@JoinColumn(name="paystub_for")
	private Employee e;//many paystubs to 1employee
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPayPeriodStart() {
		return payPeriodStart;
	}
	public void setPayPeriodStart(Date payPeriodStart) {
		this.payPeriodStart = payPeriodStart;
	}
	public Date getPayPeriodEnd() {
		return payPeriodEnd;
	}
	public void setPayPeriodEnd(Date payPeriodEnd) {
		this.payPeriodEnd = payPeriodEnd;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "PayStub [id=" + id + ", payPeriodStart=" + payPeriodStart + ", payPeriodEnd=" + payPeriodEnd
				+ ", salary=" + salary + "]";
	}
	
	
}
