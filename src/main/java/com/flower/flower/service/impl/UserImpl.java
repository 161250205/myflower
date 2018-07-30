package com.flower.flower.service.impl;

import com.flower.flower.ResultMessage;
import com.flower.flower.bean.user;
import com.flower.flower.service.UserBL;

public class UserImpl implements UserBL {
    @Override
    public ResultMessage login(String id, String password) {
        return null;
    }

    @Override
    public ResultMessage regist(String id, String password, String type, String phone) {
        return null;
    }

    @Override
    public user get_user_info(String id) {
        return null;
    }

    @Override
    public ResultMessage recharge(String id, double amount) {
        return null;
    }

    @Override
    public ResultMessage withdraw_deposit(String id, double amount, String type, String target) {
        return null;
    }
}
