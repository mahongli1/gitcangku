package com.mhl.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.mhl.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.mhl.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.mhl.jcartadministrationback.dto.out.ProductListOutDTO;
import com.mhl.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/26 17:19
 */
public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
