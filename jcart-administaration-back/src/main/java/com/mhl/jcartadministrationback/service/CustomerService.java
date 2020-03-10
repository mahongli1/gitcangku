package com.mhl.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.dto.in.CustomerSearchInDTO;
import com.mhl.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import com.mhl.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}



