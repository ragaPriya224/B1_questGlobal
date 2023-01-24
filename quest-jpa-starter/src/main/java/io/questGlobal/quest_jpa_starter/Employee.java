package io.questGlobal.quest_jpa_starter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//@Table(name ="EMPLOYEE_DATA")
//, schema="emp_schema"
@Entity
@Table(name ="EMPLOYEE_DATA")
public class Employee {

	@Id
	//	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
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

	@OneToOne
	private AccessCard card;
	
	@OneToMany(mappedBy = "e")
	private List<PayStub> paystub ;
	
	@ManyToMany
	@JoinTable(name="email_group_subscrip_sample",
	joinColumns=@JoinColumn(name="EMPLOYEE_ID"),
		inverseJoinColumns= @JoinColumn(name="subscription_email_id")
			)
	private List<EmailGroup> emailGroups = new ArrayList();
	
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

	public AccessCard getCard() {
		return card;
	}
//	public void addPayStub(PayStub paystub) {
//		this.paystub.add(paystub);
//	}
	
	
	public List<PayStub> getPaystub() {
		return paystub;
	}
	public void setPaystub(List<PayStub> paystub) {
		this.paystub = paystub;
	}
	public void setCard(AccessCard card) {
		this.card = card;
	}
	public List<EmailGroup> getEmailGroups() {
		return emailGroups;
	}
	public void setEmailGroups(List<EmailGroup> emailGroups) {
		this.emailGroups = emailGroups;
	}
	
	public void addEmailSubscription(EmailGroup group) {
		this.emailGroups.add(group);
	}
	
	//	@Override
	//	public String toString() {
	//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", dob=" + dob + ", type="
	//				+ type + "]";
	//	}
	//	@Override
	//	public String toString() {
	//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", dob=" + dob + ", type="
	//				+ type + ", card=" + card + "]";
	//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", dob=" + dob + ", type="
				+ type + ", card=" + card + "]";
	}

}
