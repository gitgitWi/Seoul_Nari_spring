package org.mybatis.repls.dto;

import java.io.Serializable;

public class Repls implements Serializable {

//    <id column="idx" property = "idx" />
//        <result column = "place_num" property = "shopNum" />
//        <result column = "ip" property = "ip" />
//        <result column = "reply" property = "reply" />
//        <result column = "reg_date" property = "regDate" />
//        <result column = "mod_date" property = "modDate" />
//        <result column = "good" property = "good" />

    private String idx;
    private String shopNum;
    private String ip;
    private String reply;
    private String regDate;
    private String modDate;
    private String good;

    public Repls() {

    }

    public Repls(String idx, String shopNum, String ip, String reply, String regDate, String modDate, String good) {
        this.idx = idx;
        this.shopNum = shopNum;
        this.ip = ip;
        this.reply = reply;
        this.regDate = regDate;
        this.modDate = modDate;
        this.good = good;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }
}
