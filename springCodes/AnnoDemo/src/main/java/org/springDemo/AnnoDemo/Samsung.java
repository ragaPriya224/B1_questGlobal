package org.springDemo.AnnoDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //non qualified and decapitalized
public class Samsung {
	
	@Autowired
	@Qualifier("hitachi")
	private MobileProcessor mobileProcessor;
	
	public MobileProcessor getMobileProcessor() {
		return mobileProcessor;
	}

	public void setMobileProcessor(MobileProcessor mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}

	public void config() {
		System.out.println("samsung is working");
		mobileProcessor.process();
	}
}
