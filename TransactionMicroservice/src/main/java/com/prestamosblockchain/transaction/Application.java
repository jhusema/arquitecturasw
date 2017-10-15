package com.prestamosblockchain.transaction;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prestamosblockchain.transaction.dto.BondsStatus;
import com.prestamosblockchain.transaction.dto.TransactionTypes;

@EntityScan
@EnableJpaRepositories
@ComponentScan(basePackages={"com.prestamosblockchain.transaction", "com.prestamosblockchain.transactions.services"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner initDataBaseDummyData(BondsRepository bondsRepository, TransactionRepository transactionRepository) {
		return (args) -> {
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
			dummyTransaction1 = transactionRepository.save(dummyTransaction1);
		};
	}
}
