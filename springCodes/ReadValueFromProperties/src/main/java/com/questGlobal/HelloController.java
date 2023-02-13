package com.questGlobal;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${my.greetings : notpresent}") //: default value
	private String getMessage;

	@Value("${my.list.values}")
	private List<String> listValues;

	@Value("#{${databValues}}")
	private Map<String,String> dbValues;

	@GetMapping("/hello")
	public String sayHi() {
		System.out.println(listValues);
		System.out.println("***************");
		System.out.println(dbValues);
		return getMessage;
	}
}
