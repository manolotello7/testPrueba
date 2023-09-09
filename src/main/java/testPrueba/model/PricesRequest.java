package testPrueba.model;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public class PricesRequest {

	/**
	 * The start date.
	 */
	@ApiModelProperty(value = "Fecha inicio", name = "start_date", example = "2020-06-14-00.00.00", required = true)
	private LocalDateTime start_date;
	
	/**
	 * The end date.
	 */
	@ApiModelProperty(value = "Fecha fin", name = "id", example = "1", required = true)
	private LocalDateTime end_date;
	
	/**
	 * The product id.
	 */
	@ApiModelProperty(value = "Identificador código de producto", name = "product_id", example = "1", required = true)
	private Integer product_id;
	
	/**
	 * The brand id.
	 */
	@ApiModelProperty(value = "La identificación de la marca", name = "brand_id", example = "1", required = true)
	private Integer brand_id;
	
	
}
