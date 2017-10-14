package com.prestamosblockchain.transactions.services;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.prestamosblockchain.transaction.repository.TransactionRepositoy;
import com.prestamosblockchain.transactions.dto.TransactionDto;

/**
 * Implementación del servicio de transacciones.
 * 
 * @author JM
 *
 */
public class TransactionService implements ITransactionService {

	private TransactionRepositoy transactionRepositoy;

	@Bean
	public void setTransactionRepositoy(TransactionRepositoy transactionRepositoy) {
		this.transactionRepositoy = transactionRepositoy;
	}

	@Override
	public TransactionDto createTransaction(TransactionDto transaction) {
		return this.transactionRepositoy.save(transaction);
	}

	@Override
	public TransactionDto getCreatedTransactionById(int id) {
		return (TransactionDto) this.transactionRepositoy.findById(id);
	}

	@Override
	public List<TransactionDto> getCreatedTransactions() {
		return this.transactionRepositoy.findAll();
	}

	@Override
	public List<TransactionDto> getTransactionByUserId(String userId) {
		return this.transactionRepositoy.findByUserId(userId);
	}

}
