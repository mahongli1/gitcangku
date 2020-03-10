package com.mhl.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.po.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorService {
    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    Administrator getByEmail(String email);

    Integer create(Administrator administrator);

    void update(Administrator administrator);

    void delete(Integer administratorId);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);

}

