package org.sam.hib;  
  
import javax.persistence.*;  
//table per hierarchy
@Entity  
@DiscriminatorValue("regularemployee")  
public class Regular_Employee extends Employee{ //regular employe is child 
      
@Column(name="salary")    
private float salary;  
  
@Column(name="bonus")     
private int bonus;

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}  
}  