package com.prestamosblockchain.transactions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.prestamosblockchain.transaction.TransactionDto;
import com.prestamosblockchain.transaction.TransactionRepository;

/**
 * Implementación del servicio de transacciones.
 * 
 * @author JM
 *
 */
@Service
public class TransactionService implements ITransactionService {

	
	private TransactionRepository transactionRepositoy;

	@Autowired
	public void setTransactionRepositoy(TransactionRepository transactionRepositoy) {
		this.transactionRepositoy = transactionRepositoy;
	}

	@Override
	public TransactionDto createTransaction(TransactionDto transaction) {
		return this.transactionRepositoy.save(transaction);
	}

	@Override
	public TransactionDto getCreatedTransactionById(int id) {
		return (TransactionDto) this.transactionRepositoy.findById(id).get(0);
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
