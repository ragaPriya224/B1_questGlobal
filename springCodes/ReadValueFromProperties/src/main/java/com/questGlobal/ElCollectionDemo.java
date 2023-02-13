package com.questGlobal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElCollectionDemo {
	

	
	@Value("#{accountHolder.accountHolderMap['xyz']}") //40k
	private Integer xyzBalance;
	
	@Value("#{accountHolder.accountHolderMap['spidy']}") //40k
	private Integer spidyBalance;
	
	@Value("#{accountHolder.holderList[1]}") //spidy
	private String secondHolder;
	
	
	@Value("#{accountHolder.holderList.size()}") //4
	private Integer holderListSize;
	
	@Value("#{10 / 2 }") //5
	private int div;
	
	
	@Value("#{10 div 2}") //5
	private double divide;
	
	@Value("#{10 % 2}") //0
	private double mod;
	
	@Value("#{10 mod 2}") //0
	private int modulus;
	
	@Value("#{'string1 ' + 'string2'}")  //String1 String2
	private String addString;
	// explore power, brackets,
	
	
//	logical and relational
	
	@Value("#{10 == 10 }")  //true
	private boolean isEqual;
	
	@Value("#{10 eq 10 }")  //true
	private boolean checkEqual;
	
	@Value("#{10 != 10 }")  //false
	private boolean isNotEqual;
	
	@Value("#{10 ne 10 }")  //false
	private boolean checkNotEqual;
	
	@Value("#{10 lt 10 }")  //false
	private boolean lt;
	
	@Value("#{10  ge 10 }")  //false
	private boolean greaterthanEqualTo;
	
	@Value("#{10 le 10 }")  //false
	private boolean lessEqualTo;
	
	@Value("#{10 < 5 and 5 > 10}") 
	private boolean and;
	
	//check or, ||
	
	@Value("#{!true}")   //false
	private boolean isNot;
	@Value("#{not true}")   //false
	private boolean checkNot;
	
	@Value("#{18 > 22 ? 'vote' :'no vote'}")   
	private String checkEligibility;
	
	@Value("#{x.property  != null ? x.property :'default'}")   
	private String ternary;
	
	@Value("#{'valid string' matches '[a-zA-z\\s]'}")  
	private boolean regex;
	

}
