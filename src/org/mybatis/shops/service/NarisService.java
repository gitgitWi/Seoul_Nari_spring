package org.mybatis.shops.service;

import org.mybatis.shops.dto.Naris;

import java.util.List;

public interface NarisService {

    public List<Naris> list_naris (Naris naris);
    public void insert_naris (Naris naris);
    public Naris select_naris (String idx);
    public void modify_naris (Naris naris);
    public void delete_naris (String idx);
    public void hitUps (String idx);
    public void good_naris (String idx);
}
