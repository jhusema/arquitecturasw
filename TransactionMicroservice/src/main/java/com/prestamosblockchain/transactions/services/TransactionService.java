package com.prestamosblockchain.transactions.services;

import java.util.List;

import com.prestamosblockchain.transactions.dto.TransactionDto;

/**
 * Implementación del servicio de transacciones.
 * 
 * @author JM
 *
 */
public class TransactionService implements ITransactionService {

	@Override
	public TransactionDto createTransaction(TransactionDto transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionDto getCreatedTransactionById(int id) {
		TransactionDto transactionDto = new TransactionDto();
		
		return transactionDto;
	}

	@Override
	public List<TransactionDto> getCreatedTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionDto> getTransactionByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
