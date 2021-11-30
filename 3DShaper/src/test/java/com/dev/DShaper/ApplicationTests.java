package com.dev.DShaper;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dev.DShaper.services.BussinessService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	BussinessService bs ;
	@Test
	void contextLoads() {
	}
	 @Test
	    public void testGetBussinessModel() {
		 	
	        
		 	String expected = "Hello World!";
	        
	        
			String result = bs.getBussinessModel().getValue();

	        assertEquals(expected, result);
	    }
}
