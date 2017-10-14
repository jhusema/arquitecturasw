package com.prestamosblockchain.transactions.dto;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Representa la informaci�n de una transacci�n
 * 
 * @author JM
 *
 */
@Entity
public class TransactionDto {

	/**
	 * Identificador de la transacci�n.
	 */
	private int id;
	/**
	 * Identifiaci�n del bono objeto de la transacci�n.
	 */
	private int bondId;
	/**
	 * Usuario que realiza la transacci�n.
	 */
	private String userId;
	/**
	 * Monto de la transacci�n
	 */
	private BigDecimal amount;
	/**
	 * Tipo de transacci�n
	 */
	private TransactionTypes type;
	/**
	 * Hash de validaci�n de la transacci�n.
	 */
	@JsonIgnore
	private String hash;
	/**
	 * Identificador de la transacci�n previa.
	 */
	private int previusTransactionId;

	/**
	 * Retorna el identificador de la transacci�n
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Asigna el identificador de la transacci�n.
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retorna el identificador del bono sobre el cual se realiza la transacci�n
	 * 
	 * @return
	 */
	public int getBondId() {
		return bondId;
	}

	/**
	 * Asigna el ID del bono sobre el cual se realiza la transacci�n.
	 * 
	 * @param bondId
	 */
	public void setBondId(int bondId) {
		this.bondId = bondId;
	}

	/**
	 * Retorna la identificaci�n del usuario que realiza la transacci�n.
	 * 
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Asigna el ID del usuario que realiza la transacci�n.
	 * 
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Retorna el monto de la transacci�n
	 * 
	 * @return
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Asigna el monto de la transacci�n
	 * 
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * Reporta el tipo de transacci�n
	 * 
	 * @return
	 */
	public TransactionTypes getType() {
		return type;
	}

	/**
	 * Asigna el tipo de transacci�n
	 * 
	 * @param type
	 */
	public void setType(TransactionTypes type) {
		this.type = type;
	}

	/**
	 * Retorna el hash de validaci�n de la transacci�n
	 * 
	 * @return
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * Asigna el Hash de validaci�n de la transacci�n
	 * 
	 * @param hash
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * Obtiene el ID de la transacci�n previa
	 * 
	 * @return
	 */
	public int getPreviusTransactionId() {
		return previusTransactionId;
	}

	/**
	 * Asigna el ID de la transacci�n previa
	 * 
	 * @param previusTransactionId
	 */
	public void setPreviusTransactionId(int previusTransactionId) {
		this.previusTransactionId = previusTransactionId;
	}

}
