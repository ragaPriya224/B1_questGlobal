package com.questGlobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	DbSettings dbSettings;
	
	@GetMapping("/greeting")
	public String sayHi() {
System.out.println(dbSettings.getPort());
System.out.println(dbSettings.getConnection());
		return dbSettings.getHost();
	}
}
