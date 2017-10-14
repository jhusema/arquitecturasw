package com.prestamosblockchain.transactions.services;

import java.util.List;

import com.prestamosblockchain.transactions.dto.TransactionDto;

/**
 * Interface con la definici�n de los servicios del objeto transacci�n
 * 
 * @author JM
 *
 */
public interface ITransactionService {
	/**
	 * Realiza la creaci�n de una transacci�n en la base de datos.
	 * 
	 * @param transaction
	 *            {@link TransactionDto}
	 * @return {@link TransactionDto} retorna la informaci�n de la transacci�n
	 *         creada.
	 */
	public TransactionDto createTransaction(TransactionDto transaction);

	/**
	 * Retorna la informaci�n de una transacci�n realizada.
	 * 
	 * @param transactionId
	 *            Identificador de la transacci�n
	 * @return {@link TransactionDto}
	 */
	public TransactionDto getCreatedTransactionById(int transactionId);

	/**
	 * Retorna todas las transacciones creadas en el sistema.
	 * 
	 * @return {@link TransactionDto}
	 */
	public List<TransactionDto> getCreatedTransaction();

	/**
	 * Retorna las transacciones creadas por un usuario.
	 * 
	 * @param userId
	 * @return {@link TransactionDto}
	 */
	public List<TransactionDto> getTransactionByUserId(String userId);

}
