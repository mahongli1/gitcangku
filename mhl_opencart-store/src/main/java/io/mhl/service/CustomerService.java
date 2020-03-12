package io.mhl.service;

import io.mhl.dto.in.CustomerRegisterInDTO;
import io.mhl.po.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}

