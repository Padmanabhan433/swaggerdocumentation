package com.tns.SwaggerDocumentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
	    name = "ProductResponse",
	    description = "DTO returned after product operations."
	)
public class ProductResponse {

    @Schema(
        description = "Unique Product ID",
        example = "101"
    )
    private Integer productId;

    @Schema(
        description = "Product Name",
        example = "Samsung Galaxy S25"
    )
    private String productName;

    @Schema(
        description = "Product Price",
        example = "79999"
    )
    private Double price;

    @Schema(
        description = "Product Category",
        example = "Electronics"
    )
    private String category;

    public ProductResponse() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}