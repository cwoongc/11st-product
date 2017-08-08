package kr.co.llst.product.service;

import kr.co.llst.product.mapper.ProductMapper;
import kr.co.llst.product.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProduct(long prdNo) {

        Product product = productMapper.getProduct(prdNo);
        log.info(product.toString());

        return product;
    }
}
