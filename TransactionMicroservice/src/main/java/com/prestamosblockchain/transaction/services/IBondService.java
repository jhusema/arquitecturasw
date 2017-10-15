package com.prestamosblockchain.transaction.services;

import java.util.List;

import com.prestamosblockchain.transaction.BondDto;

/**
 * Interface con la definición de los servicio ofrecidos en el sistema para los
 * bonos.
 * 
 * @author JM
 *
 */
public interface IBondService {

	/**
	 * Realiza la creación de un bono
	 * 
	 * @param bondDto
	 *            {@link BondDto}
	 * @return {@link BondDto} Retorna la información del bono creado
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
	 * Retorna los bonos por identificación de prestamista
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
	 * Acutaliza la información del bono para agregar el prestatario.
	 * 
	 * @param bondDto
	 *            {@link BondDto} Información del bono que debe incluir
	 *            información del prestatario.
	 * @return {@link BondDto} Información del bono actualizado.
	 */
	public BondDto borrowBond(BondDto bondDto);

}
