package com.tanda.shop.model.dto;

import com.tanda.shop.util.ProductType;

import javax.validation.constraints.NotNull;

/**
 * Created by Thushani on 10/13/2020.
 */
public class ProductDto {
    @NotNull(message = "product type may not be null")
    private ProductType productType;
    private Double price;
    private String description;
    private long product_Id;

    public long getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
