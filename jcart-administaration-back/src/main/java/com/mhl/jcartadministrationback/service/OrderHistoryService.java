package com.mhl.jcartadministrationback.service;

import com.mhl.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}

