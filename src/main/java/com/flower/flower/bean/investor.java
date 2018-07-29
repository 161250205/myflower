package com.flower.flower.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class investor extends user{

    double expect_rate_of_retrun_per_year;
    String risk_preference;
    String term_of_investment;
    String investment_scale;
}
