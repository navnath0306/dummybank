package com.navnath.dummybank.domain;

public enum AuthType {
	
	AUTHORIZE("Authorize"),
	PREAUTHORIZE("PreAuthorize"),
	FINALAUTHORIZE("FinalAuthorize");
	
	private String authType; 

	AuthType(String authType) {
		this.authType = authType;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}
	
	

}
