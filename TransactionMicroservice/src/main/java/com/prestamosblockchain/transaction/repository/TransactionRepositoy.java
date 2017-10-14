package com.prestamosblockchain.transaction.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.prestamosblockchain.transactions.dto.TransactionDto;

public interface TransactionRepositoy extends CrudRepository<TransactionDto, Integer> {
	public List<TransactionDto> findById(int id);

	public List<TransactionDto> findByUserId(String userId);

	public List<TransactionDto> findAll();

	public TransactionDto save(TransactionDto transactionDto);
}
