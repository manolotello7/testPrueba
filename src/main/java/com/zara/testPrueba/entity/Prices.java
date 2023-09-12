package com.zara.testPrueba.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * The type Superheroes.
 */
@Entity
@Table(name = "prices")
@Data
public class Prices implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The brand id.
	 */
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "La identificaci�n de la marca", name = "brand_id", example = "1", required = true)
	private Integer brand_id;

	/**
	 * The start date.
	 */
	@NotNull
	@ApiModelProperty(value = "Fecha inicio", name = "start_date", example = "2020-06-14-00.00.00", required = true)
	private LocalDateTime start_date;

	/**
	 * The end date.
	 */
	@NotNull
	@ApiModelProperty(value = "Fecha fin", name = "id", example = "1", required = true)
	private LocalDateTime end_date;

	/**
	 * The price list.
	 */
	@NotNull
	@ApiModelProperty(value = "Identificador de la tarifa de precios aplicable", name = "price_list", example = "1", required = true)
	private Integer price_list;

	/**
	 * The product id.
	 */
	@NotNull
	@ApiModelProperty(value = "Identificador c�digo de producto", name = "product_id", example = "1", required = true)
	private Integer product_id;
	
	/**
	 * The Pricing application disambiguator.
	 */
	@NotNull
	@ApiModelProperty(value = "Desambiguador de aplicaci�n de precios", name = "priority", example = "1", required = true)
	private Integer priority;

	/**
	 * The price of the product.
	 */
	@NotNull
	@ApiModelProperty(value = "Precio del producto", name = "price", example = "35.50", required = true)
	private Float price;

	/**
	 * The coin iso.
	 */
	@NotNull
	@ApiModelProperty(value = "Iso de la moneda.", name = "curr", example = "EUR", required = true)
	private String curr;

}
