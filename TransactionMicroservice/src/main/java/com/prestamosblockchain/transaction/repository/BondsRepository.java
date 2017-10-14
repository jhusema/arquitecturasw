package com.prestamosblockchain.transaction.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prestamosblockchain.transactions.dto.BondDto;

public interface BondsRepository extends CrudRepository<BondDto, Integer> {
	public List<BondDto> findById(int id);

	public List<BondDto> findByMoneyLenderId(String moneyLenderId);

	public List<BondDto> findByBorrowerId(String borrowerId);

	public List<BondDto> findAll();

	public BondDto save(BondDto bondDto);
}
