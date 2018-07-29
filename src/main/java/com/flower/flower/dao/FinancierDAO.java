package com.flower.flower.dao;

import com.flower.flower.bean.financier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancierDAO extends JpaRepository<financier,String> {
}
