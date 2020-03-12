package io.mhl.service;

import com.github.pagehelper.Page;
import io.mhl.dto.in.OrderCheckoutInDTO;
import io.mhl.dto.out.OrderShowOutDTO;
import io.mhl.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
