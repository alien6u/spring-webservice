package com.sixu.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloService {
		
	@WebMethod
	public String sayHi(String uname);
}
