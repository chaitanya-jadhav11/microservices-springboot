package com.chaitanya.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallbackMethod() {
		return "Ueer service is taking longer than expected, Plz try after sometimes";
	}

	@GetMapping("/departmentServiceFallBack")
	public String deparmentServiceFallbackMethod() {
		return "Deparment service is taking longer than expected, Plz try after sometimes";
	}
}
