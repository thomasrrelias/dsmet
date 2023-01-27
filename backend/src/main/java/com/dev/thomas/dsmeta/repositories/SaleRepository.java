package com.dev.thomas.dsmeta.repositories;

import com.dev.thomas.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository <Sale, Long> {
}
