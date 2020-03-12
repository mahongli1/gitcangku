package io.mhl.service;

import io.mhl.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getByReturnId(Integer returnId);

}
