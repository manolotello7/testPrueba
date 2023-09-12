package com.zara.testPrueba.service;

import java.time.LocalDateTime;

import com.zara.testPrueba.dto.PricesRSDTO;

/**
 * The interface precis service.
 */
public interface IPricesService {

	/**
	 * Find prives by date, product_id, brand_id between order desc by code string.
	 *
	 * @param date the date
	 * @param product_id the product_id
	 * @param brand_id the brand_id
	 * @return the PricesResponse
	 */
	public PricesRSDTO findByDateProductIdBrandIdBetweenOrderPriorityDesc(LocalDateTime date, Integer product_id, Integer brand_id);
}
