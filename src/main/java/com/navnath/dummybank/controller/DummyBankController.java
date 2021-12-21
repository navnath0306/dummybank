package com.navnath.dummybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyBankController {
	
	@GetMapping("/dummyBank/testConnectivity")
	public String testConnectivity() {
		return "Dummy Bank is UP";
	}

}
