package com.mhl.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.mhl.jcartadministrationback.po.Return;

public interface ReturnService {
    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
