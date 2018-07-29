package com.flower.flower.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="f_product")
@NoArgsConstructor
@AllArgsConstructor
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int product_id;
    String owner_id;
    double rate_of_retrun;
    double rate_of_retrun_per_year;
    String risk;
    String interest;
    String period_return;
    String least_investment_amount;
    String start_date;
    boolean if_end;
}
