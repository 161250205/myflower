package com.flower.flower.dao;

import com.flower.flower.bean.financier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FinancierDAO extends JpaRepository<financier,String> {
}
