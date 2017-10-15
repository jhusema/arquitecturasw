package com.prestamosblockchain.transactions.services;

import java.util.List;

import com.prestamosblockchain.transaction.TransactionDto;

/**
 * Interface con la definición de los servicios del objeto transacción
 * 
 * @author JM
 *
 */
public interface ITransactionService {
	/**
	 * Realiza la creación de una transacción en la base de datos.
	 * 
	 * @param transaction
	 *            {@link TransactionDto}
	 * @return {@link TransactionDto} retorna la información de la transacción
	 *         creada.
	 */
	public TransactionDto createTransaction(TransactionDto transaction);

	/**
	 * Retorna la información de una transacción realizada.
	 * 
	 * @param transactionId
	 *            Identificador de la transacción
	 * @return {@link TransactionDto}
	 */
	public TransactionDto getCreatedTransactionById(int transactionId);

	/**
	 * Retorna todas las transacciones creadas en el sistema.
	 * 
	 * @return {@link TransactionDto}
	 */
	public List<TransactionDto> getCreatedTransactions();

	/**
	 * Retorna las transacciones creadas por un usuario.
	 * 
	 * @param userId
	 * @return {@link TransactionDto}
	 */
	public List<TransactionDto> getTransactionByUserId(String userId);

}
