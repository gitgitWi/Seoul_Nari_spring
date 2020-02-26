package org.mybatis.shops.dao;

import org.mybatis.shops.dto.Naris;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class NarisDaoImpl extends SqlSessionDaoSupport implements NarisDao {

    @Override
    @Resource(name="sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<Naris> list_nari(Naris naris) {
        return getSqlSession().selectList("org.mybatis.shops.dao.Mapper.list_nari", naris);
    }

    @Override
    public void insert_nari(Naris naris) {
        getSqlSession().insert("org.mybatis.shops.dao.Mapper.insert_nari", naris);
    }

    @Override
    public Naris select_nari(String idx) {
        return getSqlSession().selectOne("org.mybatis.shops.dao.Mapper.select_nari", idx);
    }

    @Override
    public void modify_nari(Naris naris) {
        getSqlSession().update("org.mybatis.shops.dao.Mapper.modify_nari", naris);
    }

    @Override
    public void delete_nari(String idx) {
        getSqlSession().delete("org.mybatis.shops.dao.Mapper.delete_nari", idx);
    }

    @Override
    public void hitUp(String idx) {
        getSqlSession().update("org.mybatis.shops.dao.Mapper.hitUp", idx);
    }

    @Override
    public void good_nari(String idx) {
        getSqlSession().update("org.mybatis.shops.dao.Mapper.good_nari", idx);
    }
}
