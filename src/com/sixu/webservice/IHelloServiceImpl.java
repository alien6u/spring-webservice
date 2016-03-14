package com.sixu.webservice;

public class IHelloServiceImpl implements IHelloService{

	@Override
	public String sayHi(String uname) {
		return "hello" + uname;
	}

}
