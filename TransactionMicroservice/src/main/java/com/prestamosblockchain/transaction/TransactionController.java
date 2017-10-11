package com.prestamosblockchain.transaction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prestamosblockchain.transactions.dto.BondDto;
@RestController
public class TransactionController {

	@RequestMapping("/test")
	public BondDto test(@RequestParam(value="name", defaultValue="World") String name){
		BondDto bondDto = new BondDto();
		bondDto.setData("Hello :) "+name);
		return bondDto;
	}
}
