package org.mybatis.shops.dao;

import org.mybatis.shops.dto.Naris;

import java.util.List;

public interface NarisDao {
    public List<Naris> list_nari (Naris naris);
    public void insert_nari (Naris naris);
    public Naris select_nari (String idx);
    public void modify_nari (Naris naris);
    public void delete_nari (String idx);
    public void hitUp (String idx);
    public void good_nari (String idx);
}
