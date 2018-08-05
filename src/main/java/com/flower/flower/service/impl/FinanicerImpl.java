package com.flower.flower.service.impl;

import com.flower.flower.ResultMessage;
import com.flower.flower.bean.product;
import com.flower.flower.service.FinanicerBL;

public class FinanicerImpl implements FinanicerBL {
    @Override
    public ResultMessage modify_financier_information() {
        return null;
    }

    @Override
    public ResultMessage release_product(String rate_of_retrun, String interest, String period_return, String least_investment_amount) {
        return ResultMessage.EMPTY;

    }

    @Override
    public ResultMessage end_product(String product_id) {
        return null;
    }

    @Override
    public product get_product_info(String product_id) {
        return null;
    }
}
