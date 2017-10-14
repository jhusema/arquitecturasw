package com.prestamosblockchain.transaction;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prestamosblockchain.transactions.dto.BondDto;
import com.prestamosblockchain.transactions.dto.TransactionDto;
import com.prestamosblockchain.transactions.services.BondService;
import com.prestamosblockchain.transactions.services.IBondService;
import com.prestamosblockchain.transactions.services.ITransactionService;
import com.prestamosblockchain.transactions.services.TransactionService;

@RestController
public class TransactionController implements IBondService, ITransactionService {
	/**
	 * Implementaci�n del servicio de bonos.
	 */
	private IBondService bondService;
	/**
	 * Implementacion del servicio de transacciones.
	 */
	private ITransactionService transactionService;

	/**
	 * Incializa los objetos sobre los cuales se delegar� los procesos
	 */
	public TransactionController() {
		this.bondService = new BondService();
		this.transactionService = new TransactionService();
	}

	@RequestMapping(method = RequestMethod.POST, path = "/transations")
	@Override
	public TransactionDto createTransaction(@RequestBody TransactionDto transaction) {
		return this.transactionService.createTransaction(transaction);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/transations/{transactionId}")
	@Override
	public TransactionDto getCreatedTransactionById(int transactionId) {
		return this.transactionService.getCreatedTransactionById(transactionId);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/transations")
	@Override
	public List<TransactionDto> getCreatedTransaction() {
		return this.transactionService.getCreatedTransaction();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/transations/user/{userId}")
	@Override
	public List<TransactionDto> getTransactionByUserId(String userId) {
		return this.transactionService.getTransactionByUserId(userId);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/bonds")
	@Override
	public BondDto createBondDto(@RequestBody BondDto bondDto) {
		return this.bondService.createBondDto(bondDto);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/bonds/{bondId}")
	@Override
	public BondDto getCreatedBondById(@PathVariable int bondId) {
		return this.bondService.getCreatedBondById(bondId);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/bonds")
	@Override
	public List<BondDto> getCreatedBonds() {
		return this.bondService.getCreatedBonds();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/bonds/loaner/{loanerId}")
	@Override
	public List<BondDto> getBondsByLoanerId(String loanerId) {
		return this.bondService.getBondsByLoanerId(loanerId);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/bonds/borrower/{borrowerId}")
	@Override
	public List<BondDto> getBondsByborrowerId(String borrowerId) {
		return this.bondService.getBondsByborrowerId(borrowerId);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/bonds")
	@Override
	public BondDto borrowBond(@RequestBody BondDto bondDto) {
		return this.bondService.borrowBond(bondDto);
	}
	//Pruebas Jean Paul Galeano
}
