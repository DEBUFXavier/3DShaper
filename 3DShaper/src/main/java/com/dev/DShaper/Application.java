package com.dev.DShaper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.dev.DShaper.model.BussinessModel;
import com.dev.DShaper.services.BussinessService;

/**
 * 
 * @author xdebuf
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application implements CommandLineRunner {
	
	//todo delete
	@Autowired
	private BussinessService bs;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		BussinessModel bm= bs.getBussinessModel();
		System.out.println(bm);
	}

}
