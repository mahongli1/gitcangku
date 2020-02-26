package io.mhl.mhl_opencart.service;

import com.github.pagehelper.Page;
import io.mhl.mhl_opencart.dto.in.ProductCreateInDTO;
import io.mhl.mhl_opencart.dto.in.ProductUpdateInDTO;
import io.mhl.mhl_opencart.dto.out.ProductListOutDTO;
import io.mhl.mhl_opencart.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);




}
