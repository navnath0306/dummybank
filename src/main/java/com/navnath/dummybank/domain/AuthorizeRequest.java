package com.navnath.dummybank.domain;

public class AuthorizeRequest extends BankRequest{
	
	private String authType;

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}
	

}
