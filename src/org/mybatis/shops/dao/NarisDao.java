package org.mybatis.shops.dao;

import org.mybatis.shops.dto.Naris;

import java.util.List;

public interface NarisDao {

    public List<Naris> list(Naris naris);
    public void insert (Naris naris);
    public Naris select (String idx);
    public void update (Naris naris);
    public void delete (String idx);
}
