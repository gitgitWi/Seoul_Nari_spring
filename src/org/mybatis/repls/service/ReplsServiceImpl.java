package org.mybatis.repls.service;

import org.mybatis.repls.dao.ReplsDao;
import org.mybatis.repls.dto.Repls;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReplsServiceImpl implements ReplsService {

    @Resource
    private ReplsDao rd;

    @Override
    public List<Repls> list_repls(Repls repls) {
        return this.rd.list_repl(repls);
    }

    @Override
    @Transactional
    public void insert_repls(Repls repls) {
        this.rd.insert_repl(repls);
    }

    @Override
    public Repls select_repls(String idx) {
        return this.rd.select_repl(idx);
    }

    @Override
    @Transactional
    public void modify_repls(Repls repls) {
        this.rd.modify_repl(repls);
    }

    @Override
    @Transactional
    public void delete_repls(String idx) {
        this.rd.delete_repl(idx);
    }

    @Override
    @Transactional
    public void good_repls(String idx) {
        this.rd.good_repl(idx);
    }

}
