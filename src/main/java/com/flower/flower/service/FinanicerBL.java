package com.flower.flower.service;

import com.flower.flower.ResultMessage;
import com.flower.flower.bean.product;

public interface FinanicerBL {
    public ResultMessage modify_financier_information(); //此方法因为甲方大佬尚未给出详细信息暂时空缺参数
    public ResultMessage release_product(String rate_of_retrun,String interest,String period_return,String least_investment_amount);
    public ResultMessage end_product(String product_id);
    public product get_product_info(String product_id);
}
