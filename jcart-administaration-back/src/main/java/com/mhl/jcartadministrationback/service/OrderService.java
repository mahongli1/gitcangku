package com.mhl.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.mhl.jcartadministrationback.dto.out.OrderListOutDTO;
import com.mhl.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.mhl.jcartadministrationback.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}

