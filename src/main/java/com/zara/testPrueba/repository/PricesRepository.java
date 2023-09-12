package com.zara.testPrueba.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zara.testPrueba.entity.Prices;

@Repository
public interface PricesRepository extends JpaRepository<Prices, Integer> {
	
	@Query("SELECT p FROM Prices p "
			+ "WHERE p.product_id = :product_id and p.brand_id = :brand_id and :date "
			+ "BETWEEN p.start_date and p.end_date "
			+ "ORDER BY p.priority desc")
	Prices findByDateProductIdBrandIdBetweenOrderPriorityDesc(LocalDateTime date, Integer product_id, Integer brand_id);

}