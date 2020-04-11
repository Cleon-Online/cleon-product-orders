package com.cleon.products.orders.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductsOrderApi
 * Inside the package - com.cleon.products.orders.api
 * Created Date: 4/11/2020
 * Created Time: 4:59 PM
 **/
@Tag(name = "product-orders", description = "The product order service API")
public interface ProductsOrderApi {

    @Operation(
            summary = "Find order By id",
            description = "Find the order for the given order id",
//            tags = {
//                    "product"
//            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful Operation"
//                            content = {
//                                    @Content(
//                                            schema = @Schema(implementation = ProductDto.class)
//                                    )
//                            }
                    )
            }
    )
    @GetMapping(value = "/cleon/order/{oderId}",produces = {"application/json"})
    ResponseEntity<String> getProductOrderById(@PathVariable("oderId") String oderId);
}
