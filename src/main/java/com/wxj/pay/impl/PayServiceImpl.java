package com.wxj.pay.impl;

import com.wxj.pay.Payservice;

import java.util.Map;

public class PayServiceImpl implements Payservice {
    @Override
    public void createNative(String out_trade_no, String price) {
        System.out.println("预下单");
    }

    @Override
    public Map quneryStatus(String out_trade_no) {
        System.out.println("查询交易状态");
        return null;
    }
}
