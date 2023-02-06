package com.quest.global;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{


	public void drive() {
		System.out.println("car is Starting ");
	}
}
//small letter -> default name -> car