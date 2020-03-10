package com.mhl.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.dto.out.OrderListOutDTO;
import com.mhl.jcartadministrationback.po.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
//    custom

    Page<OrderListOutDTO> search(@Param("orderId") Long orderId,
                                 @Param("status") Byte status,
                                 @Param("totalPrice") Double totalPrice,
                                 @Param("customerName") String customerName,
                                 @Param("startTime") Date startTime,
                                 @Param("endTime") Date endTime);

}