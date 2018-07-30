package com.flower.flower.service;

import com.flower.flower.ResultMessage;
import com.flower.flower.bean.user;

public interface UserBL {
    public ResultMessage login(String id, String password);
    public ResultMessage regist(String id,String password,String type,String phone);
    public user get_user_info(String id);
    public ResultMessage recharge(String id,double amount);
    public ResultMessage withdraw_deposit(String id,double amount,String type,String target);
}
