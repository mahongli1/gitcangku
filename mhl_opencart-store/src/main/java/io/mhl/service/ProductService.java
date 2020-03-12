package io.mhl.service;

import com.github.pagehelper.Page;
import io.mhl.dto.out.ProductListOutDTO;
import io.mhl.dto.out.ProductShowOutDTO;
import io.mhl.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
