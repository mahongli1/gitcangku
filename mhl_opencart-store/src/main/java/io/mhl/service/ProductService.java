package io.mhl.service;

import io.mhl.dto.out.ProductShowOutDTO;

public interface ProductService {
    ProductShowOutDTO getById(Integer productId);
}
