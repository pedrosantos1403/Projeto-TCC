package com.pedro.tcc.Controller;

import com.pedro.tcc.Model.OrderResponse;
import io.micronaut.http.HttpResponse;

public class OrderControllerImpl implements OrderApi {

    // TODO: Build the request object in the swagger file

    @Override
    public HttpResponse<OrderResponse> getOrder(Integer id, String socialId) {
        return null;
    }

}
