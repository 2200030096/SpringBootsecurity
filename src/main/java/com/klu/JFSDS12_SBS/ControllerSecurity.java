package com.klu.JFSDS12_SBS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSecurity {
    
	   @GetMapping("/")
	   public String method()
	   {
		   return "Welcome to SB";
	   }
}
