package com.flower.flower.dao;

import com.flower.flower.bean.investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentDAO extends JpaRepository<investment,Integer> {
}
