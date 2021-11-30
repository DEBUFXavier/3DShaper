/**
 * 
 */
package com.dev.DShaper.services;

import org.springframework.stereotype.Component;

import com.dev.DShaper.model.BussinessModel;

/**
 * @author xavier.debuf
 *
 */
@Component
public class BussinessService {
  
	public BussinessModel getBussinessModel() {
		BussinessModel bm = new BussinessModel();
		return bm;
		
	}
	
}
