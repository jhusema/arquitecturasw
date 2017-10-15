package com.prestamosblockchain.transactions.services;

import java.util.List;

import com.prestamosblockchain.transaction.BondDto;

/**
 * Interface con la definici�n de los servicio ofrecidos en el sistema para los
 * bonos.
 * 
 * @author JM
 *
 */
public interface IBondService {

	/**
	 * Realiza la creaci�n de un bono
	 * 
	 * @param bondDto
	 *            {@link BondDto}
	 * @return {@link BondDto} Retorna la informaci�n del bono creado
	 */
	public BondDto createBondDto(BondDto bondDto);

	/**
	 * Retorna un bono por su id
	 * 
	 * @param boundId
	 *            Identificador del bono
	 * @return {@link BondDto}
	 */
	public BondDto getCreatedBondById(int bondId);

	/**
	 * Retorna los bonos creados en el sistema
	 * 
	 * @return {@link BondDto}
	 */
	public List<BondDto> getCreatedBonds();

	/**
	 * Retorna los bonos por identificaci�n de prestamista
	 * 
	 * @param loanerId
	 *            Identificador del prestamista
	 * @return {@link BondDto}
	 */
	public List<BondDto> getBondsByLoanerId(String loanerId);

	/**
	 * Retorna los bonos por identificador del prestatario
	 * 
	 * @param borrowerId
	 *            Identificador del prestatario
	 * @return {@link BondDto}
	 */
	public List<BondDto> getBondsByborrowerId(String borrowerId);

	/**
	 * Acutaliza la informaci�n del bono para agregar el prestatario.
	 * 
	 * @param bondDto
	 *            {@link BondDto} Informaci�n del bono que debe incluir
	 *            informaci�n del prestatario.
	 * @return {@link BondDto} Informaci�n del bono actualizado.
	 */
	public BondDto borrowBond(BondDto bondDto);

}
