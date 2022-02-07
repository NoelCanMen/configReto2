package com.nttdata.bootcam.eurekaserver.configserverReto.controles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controles {
	
	@Value("${some.value}")
	private int myValue;

	
	@GetMapping("/oSumar")
	public float operacionSumar(@PathVariable String num1,@PathVariable String num2) {
		
		
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
	
	@GetMapping("/oRestar")
	public float operacionRestar(@PathVariable String num1,@PathVariable String num2){
		
		
		return Integer.parseInt(num1)-Integer.parseInt(num2);
	}
	
	@GetMapping("/oMultiplicar")
	public float operacionMultiplicar(@PathVariable String num1,@PathVariable String num2) {
		
		
		return Integer.parseInt(num1)*Integer.parseInt(num2);
	}
	
	@GetMapping("/oDividir")
	public float operacionDividir(@PathVariable String num1,@PathVariable String num2) {
		
		
		return Integer.parseInt(num1)/Integer.parseInt(num2);
	}

}
