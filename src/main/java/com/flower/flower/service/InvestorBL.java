package com.flower.flower.service;

import com.flower.flower.ResultMessage;
import com.flower.flower.bean.product;

public interface InvestorBL {
    public product search_product(String rate_of_retrun, String risk, String interest, String period_return, String least_investment_amount);
    public product get_product_info(String product_id);
    public ResultMessage invest_product(double amount, String money);
    public int get_investor_status(String product_id);
}
