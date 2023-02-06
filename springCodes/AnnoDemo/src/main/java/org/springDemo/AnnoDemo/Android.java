package org.springDemo.AnnoDemo;
//mobile processor 

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Android implements MobileProcessor{

	public void process() {
		System.out.println("my cpu name is android");
		
	}

}
//basically, every phone needs a processor 