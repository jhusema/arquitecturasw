/**
 * 
 */
package com.prestamosblockchain.transactions.services;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.prestamosblockchain.transaction.repository.BondsRepository;
import com.prestamosblockchain.transactions.dto.BondDto;

/**
 * Implementacion de los servicios de bonos.
 * 
 * @author JM
 *
 */
public class BondService implements IBondService {
	private BondsRepository bondsRepository;

	@Bean
	public void setBondsRepository(BondsRepository bondsRepository) {
		this.bondsRepository = bondsRepository;
	}

	@Override
	public BondDto createBondDto(BondDto bondDto) {
		return this.bondsRepository.save(bondDto);
	}

	@Override
	public BondDto getCreatedBondById(int bondId) {
		return (BondDto) this.bondsRepository.findById(bondId);
	}

	@Override
	public List<BondDto> getCreatedBonds() {
		return this.bondsRepository.findAll();
	}

	@Override
	public List<BondDto> getBondsByLoanerId(String loanerId) {
		return this.bondsRepository.findByMoneyLenderId(loanerId);
	}

	@Override
	public List<BondDto> getBondsByborrowerId(String borrowerId) {
		return this.bondsRepository.findByBorrowerId(borrowerId);
	}

	@Override
	public BondDto borrowBond(BondDto bondDto) {
		return this.bondsRepository.save(bondDto);
	}

}
