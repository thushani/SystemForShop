package com.tanda.shop.model.dto;
import com.tanda.shop.util.orderStatus;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class OrderDto {
    private String name;
    @NotNull(message = "Coffee id may not be null")
    private Long productId;
    @NotNull(message = "user id may not be null")
    private Long userId;
    private orderStatus status = orderStatus.PENDING;
    private String paymentType;
    @NotEmpty(message = "quantity may not be empty")
    private int quantity = 1;
    @ApiModelProperty(readOnly = true)
    private Long orderId;

    public orderStatus getStatus() {
        return status;
    }

    public void setStatus(orderStatus status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
