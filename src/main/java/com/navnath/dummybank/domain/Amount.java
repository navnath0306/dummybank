package com.navnath.dummybank.domain;

public class Amount {
	private Long amount;
	private String currency;
	
	public Amount(Long amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
