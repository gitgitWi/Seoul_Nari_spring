package org.mybatis.shops.dto;

import java.io.Serializable;

public class Naris implements Serializable {

    /*
        <id column="idx" property = "idx" />
        <result column = "place_name" property = "shopName" />
        <result column = "price_per_person" property = "shopAvgPrice" />
        <result column = "place_address" property = "shopAddr" />
        <result column = "reg_date" property = "regDate" />
        <result column = "mod_date" property = "modDate" />
        <result column = "hit" property = "hit" />
        <result column = "good" property = "good" />
     */

    private String shopAvgPrice;
    private String shopAddr;
    private String regDate;
    private String modDate;
    private String hit;
    private String good;
    private String searchType;
    private String searchText;

    public Naris() {

    }

    public Naris(String idx, String shopName, String shopAvgPrice, String shopAddr, String regDate, String modDate, String hit, String good, String searchType, String searchText) {
        this.idx = idx;
        this.shopName = shopName;
        this.shopAvgPrice = shopAvgPrice;
        this.shopAddr = shopAddr;
        this.regDate = regDate;
        this.modDate = modDate;
        this.hit = hit;
        this.good = good;
        this.searchType = searchType;
        this.searchText = searchText;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAvgPrice() {
        return shopAvgPrice;
    }

    public void setShopAvgPrice(String shopAvgPrice) {
        this.shopAvgPrice = shopAvgPrice;
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr;
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

    private String idx;
    private String shopName;

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
}
