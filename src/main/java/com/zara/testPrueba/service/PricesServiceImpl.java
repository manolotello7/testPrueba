package com.zara.testPrueba.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zara.testPrueba.dto.PricesRSDTO;
import com.zara.testPrueba.entity.Prices;
import com.zara.testPrueba.repository.PricesRepository;

/**
 * Prices service implement.
 *
 */
@Service
public class PricesServiceImpl {
	
	/**
	 * Prices repository.
	 *
	 */
	@Autowired
	private PricesRepository pricesRepository;

	/**
	 * Find prives by date, product_id, brand_id between order desc by code string.
	 *
	 * @param date the date
	 * @param product_id the product_id
	 * @param brand_id the brand_id
	 * @return the PricesResponse
	 */
	public PricesRSDTO findByDateProductIdBrandIdBetweenOrderPriorityDesc(LocalDateTime date, Integer product_id, Integer brand_id) {
		Prices price = pricesRepository.findByDateProductIdBrandIdBetweenOrderPriorityDesc(date, product_id, brand_id);
		
		return PricesRSDTO.builder()
                .product_id(price.getProduct_id())
                .brand_id(price.getBrand_id())
                .price_list(price.getPrice_list())
                .start_date(price.getStart_date())
                .end_date(price.getEnd_date())
                .price(price.getPrice())
                .build();
	}

}
