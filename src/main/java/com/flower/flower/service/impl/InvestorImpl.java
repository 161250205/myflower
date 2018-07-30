package com.flower.flower.service.impl;

import com.flower.flower.ResultMessage;
import com.flower.flower.bean.product;
import com.flower.flower.service.InvestorBL;

public class InvestorImpl implements InvestorBL {
    @Override
    public product search_product(String rate_of_retrun, String risk, String interest, String period_return, String least_investment_amount) {
        return null;
    }

    @Override
    public product get_product_info(String product_id) {
        return null;
    }

    @Override
    public ResultMessage invest_product(double amount, String money) {
        return null;
    }

    @Override
    public int get_investor_status(String product_id) {
        return 0;
    }
}
