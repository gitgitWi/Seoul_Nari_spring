package org.mybatis.repls.dao;

import org.mybatis.repls.dto.Repls;

import java.util.List;

public interface ReplsDao {
    public List<Repls> list_repl (Repls repls);
    public void insert_repl (Repls repls);
    public Repls select_repl(String idx);
    public void modify_repl (Repls repls);
    public void delete_repl (String idx);
    public void good_repl (String idx);
}
