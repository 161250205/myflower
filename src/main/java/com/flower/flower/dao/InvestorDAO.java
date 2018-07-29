package com.flower.flower.dao;

import com.flower.flower.bean.investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorDAO extends JpaRepository<investor,String> {
}
