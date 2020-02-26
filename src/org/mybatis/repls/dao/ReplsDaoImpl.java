package org.mybatis.repls.dao;

import org.mybatis.repls.dto.Repls;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ReplsDaoImpl extends SqlSessionDaoSupport implements ReplsDao {

    @Override
    @Resource(name="sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<Repls> list_repl(Repls repls) {
        return getSqlSession().selectList("org.mybatis.shops.dao.Mapper.list_repl", repls);
    }

    @Override
    public void insert_repl(Repls repls) {
        getSqlSession().selectList("org.mybatis.shops.dao.Mapper.insert_repl", repls);
    }

    @Override
    public void modify_repl(Repls repls) {
        getSqlSession().selectList("org.mybatis.shops.dao.Mapper.modify_repl", repls);
    }

    @Override
    public void delete_repl(String idx) {
        getSqlSession().selectList("org.mybatis.shops.dao.Mapper.delete_repl", idx);
    }

    @Override
    public void good_repl(String idx) {
        getSqlSession().selectList("org.mybatis.shops.dao.Mapper.good_repl", idx);
    }
}
