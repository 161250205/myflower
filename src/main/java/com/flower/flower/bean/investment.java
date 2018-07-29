package com.flower.flower.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="f_investment")
@NoArgsConstructor
@AllArgsConstructor
public class investment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int investment_id;
    String product_id;
    String owner_id;
    double start_amount;
    double total_amount;
    String start_date;
    String last_return_date;
}
