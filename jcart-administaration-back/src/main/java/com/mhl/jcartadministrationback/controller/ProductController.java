package com.mhl.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import com.mhl.jcartadministrationback.dao.ProductDetailMapper;
import com.mhl.jcartadministrationback.service.ProductService;
import com.mhl.jcartadministrationback.dao.ProductMapper;
import com.mhl.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.mhl.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.mhl.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.mhl.jcartadministrationback.dto.out.PageOutDTO;
import com.mhl.jcartadministrationback.dto.out.ProductListOutDTO;
import com.mhl.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:16
 */
@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){

        Integer productId = productService.create(productCreateInDTO);

        return productId;
    }



    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);

    }


    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }



    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productMapper.batchDelete(productIds);
        productDetailMapper.batchDelete(productIds);
    }
}
