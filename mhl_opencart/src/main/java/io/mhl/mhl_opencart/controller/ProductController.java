package io.mhl.mhl_opencart.controller;

import io.mhl.mhl_opencart.dto.in.ProductCreateInDTO;
import io.mhl.mhl_opencart.dto.in.ProductSearchInDTO;
import io.mhl.mhl_opencart.dto.in.ProductUpdateInDTO;
import io.mhl.mhl_opencart.dto.out.PageOutDTO;
import io.mhl.mhl_opencart.dto.out.ProductListOutDTO;
import io.mhl.mhl_opencart.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }


    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }


}
