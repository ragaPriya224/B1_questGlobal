package org.springDemo.AnnoDemo;
//mobile processor 

import org.springframework.stereotype.Component;

@Component
public class Hitachi implements MobileProcessor{

	public void process() {
		System.out.println("my cpu name is hitachi");
		
	}

}
//basically, every phone needs a processor 