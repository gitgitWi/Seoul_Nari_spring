package org.mybatis.shops.service;

import org.mybatis.shops.dao.NarisDao;
import org.mybatis.shops.dto.Naris;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NarisServiceImpl implements NarisService {

    @Resource
    private NarisDao nd;


    @Override
    public List<Naris> list_naris(Naris naris) {
        return this.nd.list_nari(naris);
    }

    @Override
    @Transactional
    public void insert_naris(Naris naris) {
        this.nd.insert_nari(naris);
    }

    @Override
    public Naris select_naris(String idx) {
        return this.nd.select_nari(idx);
    }

    @Override
    @Transactional
    public void modify_naris(Naris naris) {
        this.nd.modify_nari(naris);
    }

    @Override
    @Transactional
    public void delete_naris(String idx) {
        this.nd.delete_nari(idx);
    }

    @Override
    @Transactional
    public void hitUps(String idx) {
        this.nd.hitUp(idx);
    }

    @Override
    @Transactional
    public void good_naris(String idx) {
        this.nd.good_nari(idx);
    }
}
