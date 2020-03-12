package io.mhl.service;

import io.mhl.po.Address;

import java.util.List;

public interface AddressService {
    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    void delete(Integer addressId);

}
