package com.cleon.products.orders.controllers;

import com.cleon.products.orders.api.ProductsOrderApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductOrderController
 * Inside the package - com.cleon.products.orders.controllers
 * Created Date: 4/11/2020
 * Created Time: 5:03 PM
 **/
@RestController
public class ProductOrderController implements ProductsOrderApi {

    @Override
    public ResponseEntity<String> getProductOrderById(String oderId) {
        return new ResponseEntity<>("Hello World!!!", HttpStatus.OK);
    }
}
