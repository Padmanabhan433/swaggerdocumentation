package com.tns.SwaggerDocumentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
	    name = "ProductRequest",
	    description = "DTO used to create a new product."
	)
public class ProductRequest {

    @Schema(
        description = "Product Name",
        example = "Samsung Galaxy S25"
    )
    @NotBlank(message = "Product name cannot be empty")
    private String productName;

    @Schema(
        description = "Product Price",
        example = "79999"
    )
    @NotNull(message = "Price is required")
    @Min(value = 1, message = "Price must be greater than zero")
    private Double price;

    @Schema(
        description = "Product Category",
        example = "Electronics"
    )
    @NotBlank(message = "Category cannot be empty")
    private String category;

    public ProductRequest() {
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