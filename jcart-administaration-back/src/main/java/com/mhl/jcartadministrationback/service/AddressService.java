package com.mhl.jcartadministrationback.service;

import com.mhl.jcartadministrationback.po.Address;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
