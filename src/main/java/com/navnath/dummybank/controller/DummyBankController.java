package com.navnath.dummybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navnath.dummybank.domain.Amount;
import com.navnath.dummybank.domain.AuthorizeRequest;
import com.navnath.dummybank.domain.AuthorizeResponse;
import com.navnath.dummybank.domain.ResponseDetails;

@RestController
public class DummyBankController {
	
	@GetMapping("/dummyBank/testConnectivity")
	public String testConnectivity() {
		return "Dummy Bank is UP";
	}
	
	@PostMapping("/dummyBank/authorize")
	public AuthorizeResponse authorize(@RequestBody AuthorizeRequest authorizeResquest) {
		AuthorizeResponse authorizeResponse = new AuthorizeResponse();
		authorizeResponse.setMessage("Response from dummy bank");
		authorizeResponse.setResponseCode(00l);
		authorizeResponse.setStatus("00");
		authorizeResponse.setTransactionId("123456");
		
		ResponseDetails responseDetails = new ResponseDetails();
		responseDetails.setAquirerDesc("Approved from acquirer");
		responseDetails.setAquirerResponseCode(123l);
		responseDetails.setAmount(new Amount(100l,"SEK"));
		
		authorizeResponse.setResponseDetails(null);
		return authorizeResponse;
		
	}

}
