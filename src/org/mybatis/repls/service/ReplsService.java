package org.mybatis.repls.service;

import org.mybatis.repls.dto.Repls;

import java.util.List;

public interface ReplsService {
    public List<Repls> list_repls (Repls repls);
    public void insert_repls (Repls repls);
    public void modify_repls (Repls repls);
    public void delete_repls (String idx);
    public void good_repls (String idx);
}
