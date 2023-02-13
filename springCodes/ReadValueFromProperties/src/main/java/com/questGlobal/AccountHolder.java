package com.questGlobal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("accountHolder")
public class AccountHolder {
	
	private List<String> holderList = new LinkedList<>();
	
	private Map<String, Integer> accountHolderMap = new HashMap<>();
	
	AccountHolder(){
		holderList.add("xyz"); //0
		holderList.add("spidy"); //1
		holderList.add("abc");
		holderList.add("cap");
		accountHolderMap.put("xyz" ,40000);
		accountHolderMap.put("spidy",2050);
		accountHolderMap.put("abc",500);
		accountHolderMap.put("cap",1000);
	}
	public List<String> getHolderList() {
		return holderList;
	}
	public void setHolderList(List<String> holderList) {
		this.holderList = holderList;
	}
	public Map<String, Integer> getAccountHolderMap() {
		return accountHolderMap;
	}
	public void setAccountHolderMap(Map<String, Integer> accountHolderMap) {
		this.accountHolderMap = accountHolderMap;
	}
	

	
}
