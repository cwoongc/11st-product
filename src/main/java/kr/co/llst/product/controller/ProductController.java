package kr.co.llst.product.controller;

import kr.co.llst.product.model.Product;
import kr.co.llst.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value="/product", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping(value="/{prdNo}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable long prdNo){

        Product product = productService.getProduct(prdNo);
        return product;
    }

}
