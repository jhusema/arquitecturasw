package com.prestamosblockchain.transaction;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.prestamosblockchain.transaction.repository.BondsRepository;
import com.prestamosblockchain.transaction.repository.TransactionRepositoy;
import com.prestamosblockchain.transactions.dto.BondDto;
import com.prestamosblockchain.transactions.dto.BondsStatus;
import com.prestamosblockchain.transactions.dto.TransactionDto;
import com.prestamosblockchain.transactions.dto.TransactionTypes;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public void initDataBaseDummyData(BondsRepository bondsRepository, TransactionRepositoy transactionRepositoy) {
		BondDto dummyBond1 = new BondDto();
		dummyBond1.setAmount(new BigDecimal(123.4));
		dummyBond1.setBorrowerId("1");
		dummyBond1.setCreationDate(new Date());
		dummyBond1.setInstallments(3);
		dummyBond1.setStatus(BondsStatus.CREATED);
		dummyBond1 = bondsRepository.save(dummyBond1);
		TransactionDto dummyTransaction1 = new TransactionDto();
		dummyTransaction1.setAmount(new BigDecimal(123.4));
		dummyTransaction1.setBondId(dummyBond1.getId());
		dummyTransaction1.setHash("asdfasefad");
		dummyTransaction1.setPreviusTransactionId(0);
		dummyTransaction1.setType(TransactionTypes.LOAN);
		dummyTransaction1.setUserId("1");
	}
}
