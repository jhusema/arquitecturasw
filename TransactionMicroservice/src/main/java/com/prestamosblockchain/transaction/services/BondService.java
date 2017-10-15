/**
 * 
 */
package com.prestamosblockchain.transaction.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamosblockchain.transaction.BondDto;
import com.prestamosblockchain.transaction.BondsRepository;

/**
 * Implementacion de los servicios de bonos.
 * 
 * @author JM
 *
 */
@Service
public class BondService implements IBondService {
	private BondsRepository bondsRepository;

	@Autowired
	public void setBondsRepository(BondsRepository bondsRepository) {
		this.bondsRepository = bondsRepository;
	}

	@Override
	public BondDto createBondDto(BondDto bondDto) {
		return this.bondsRepository.save(bondDto);
	}

	@Override
	public BondDto getCreatedBondById(int bondId) {
		return (BondDto) this.bondsRepository.findById(bondId).get(0);
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
