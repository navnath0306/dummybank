package com.navnath.dummybank.domain;

public class ResponseDetails {

	private Long aquirerResponseCode;
	private String aquirerDesc;
	private Amount amount;
	public Long getAquirerResponseCode() {
		return aquirerResponseCode;
	}
	public void setAquirerResponseCode(Long aquirerResponseCode) {
		this.aquirerResponseCode = aquirerResponseCode;
	}
	public String getAquirerDesc() {
		return aquirerDesc;
	}
	public void setAquirerDesc(String aquirerDesc) {
		this.aquirerDesc = aquirerDesc;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	
	
	
}
