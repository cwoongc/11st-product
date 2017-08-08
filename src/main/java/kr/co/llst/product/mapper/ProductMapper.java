package kr.co.llst.product.mapper;

import kr.co.llst.product.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {

    Product getProduct(@Param("prdNo") long prdNo);

}
