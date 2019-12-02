package com.paperflybd.com.ret;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {


    @GET("/todos/")
    Call<String> getData();


}
