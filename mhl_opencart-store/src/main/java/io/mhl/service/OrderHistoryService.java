package io.mhl.service;

import io.mhl.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);

}

