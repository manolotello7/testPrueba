package com.zara.testPrueba.web;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.zara.testPrueba.dto.PricesRSDTO;
import com.zara.testPrueba.service.IPricesService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(PricesController.PATH)
public class PricesController {

	/**
	 * The constant PATH.
	 */
	public static final String PATH = "/api/v1/prices";

	/**
	 * The constant PATH.
	 */
	public static final String PATH_CONSULT = "/consult";

	/**
	 * The prices service.
	 */
	private IPricesService pricesService;

	/**
	 * Ger prices by name
	 *
	 * @param value the value
	 * @return List prices
	 */
	@GetMapping(value = PricesController.PATH_CONSULT)
	@ResponseStatus(value = HttpStatus.OK)
	@ApiOperation(value = "Obtener prices", notes = "Servicio para devolver todos los  prices")
	public ResponseEntity<PricesRSDTO> findPrice(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date, @RequestParam Integer product_id, 
			@RequestParam Integer brand_id) {
		try {
			return ResponseEntity.ok((pricesService.findByDateProductIdBrandIdBetweenOrderPriorityDesc(date, product_id, brand_id)));
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
