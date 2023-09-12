package com.zara.testPrueba.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PricesRSDTO {

	/**
	 * The product id.
	 */
	@ApiModelProperty(value = "Identificador c�digo de producto", name = "product_id", example = "1", required = true)
	private Integer product_id;

	/**
	 * The brand id.
	 */
	@ApiModelProperty(value = "La identificaci�n de la marca", name = "brand_id", example = "1", required = true)
	private Integer brand_id;

	/**
	 * The price list.
	 */
	@ApiModelProperty(value = "Identificador de la tarifa de precios aplicable", name = "price_list", example = "1", required = true)
	private Integer price_list;
	
	/**
	 * The start date.
	 */
	@ApiModelProperty(value = "Fecha inicio", name = "start_date", example = "2020-06-14-00.00.00", required = true)
	private LocalDateTime start_date;

	/**
	 * The end date.
	 */
	@ApiModelProperty(value = "Fecha fin", name = "end_date", example = "1", required = true)
	private LocalDateTime end_date;

	/**
	 * The price of the product.
	 */
	@ApiModelProperty(value = "Precio del producto", name = "price", example = "35.50", required = true)
	private Float price;

}
