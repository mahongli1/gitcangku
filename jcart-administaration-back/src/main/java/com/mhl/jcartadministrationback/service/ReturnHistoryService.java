package com.mhl.jcartadministrationback.service;

import com.mhl.jcartadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);

}


