package com.wxj.pay;

import java.util.Map;

public interface Payservice {
    public void createNative(String out_trade_no,String price);
    public Map quneryStatus(String out_trade_no);
}
