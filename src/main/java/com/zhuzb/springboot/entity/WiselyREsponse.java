package com.zhuzb.springboot.entity;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/27
 * Time：11:28
 */
public class WiselyREsponse {

    private String responseMessage;

    public WiselyREsponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
