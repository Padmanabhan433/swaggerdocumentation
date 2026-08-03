package com.tns.SwaggerDocumentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tns.SwaggerDocumentation.dto.ProductRequest;
import com.tns.SwaggerDocumentation.dto.ProductResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
@Tag(
    name = "Product Controller",
    description = "APIs for managing products"
)
public class ProductController {

	@GetMapping
	@Operation(
	    summary = "Get all products",
	    description = "Returns a list of all available products."
	)
	@ApiResponses({
	    @ApiResponse(
	        responseCode = "200",
	        description = "Products retrieved successfully"
	    ),
	    @ApiResponse(
	        responseCode = "400",
	        description = "Invalid request"
	    ),
	    @ApiResponse(
	        responseCode = "404",
	        description = "Products not found"
	    ),
	    @ApiResponse(
	        responseCode = "500",
	        description = "Internal Server Error"
	    )
	})
    public String getAllProducts() {
        return "List of Products";
    }
	@PostMapping
	@Operation(
	    summary = "Create Product",
	    description = "Creates a new product."
	)
	@ApiResponses({
	    @ApiResponse(responseCode = "201", description = "Product Created Successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid Input"),
	    @ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	public ProductResponse createProduct(@Valid @RequestBody ProductRequest request) {

	    ProductResponse response = new ProductResponse();

	    response.setProductId(101);
	    response.setProductName(request.getProductName());
	    response.setPrice(request.getPrice());
	    response.setCategory(request.getCategory());

	    return response;
	}
}