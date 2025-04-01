package com.pedro.tcc.Controller;

import com.pedro.tcc.Model.InlineResponse200;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.reactivex.rxjava3.core.Single;

import javax.validation.constraints.NotNull;

@Controller
public class OrderController implements OrderApi{

    @Override
    public Single<HttpResponse<InlineResponse200>> getOrder(Integer id, @NotNull String socialId) {
        return OrderApi.super.getOrder(id, socialId);
    }

}
