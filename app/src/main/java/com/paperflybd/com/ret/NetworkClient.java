package com.paperflybd.com.ret;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {


    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static Retrofit retrofit;

    public static Retrofit getRetrofitClient() {
        //If condition to ensure we don't create multiple retrofit instances in a single application
        if (retrofit == null) {
            //Defining the Retrofit using Builder
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) //This is the only mandatory call on Builder object.
                    .addConverterFactory(new ToStringConverterFactory()) // Convertor library used to convert response into POJO
                    .build();
        }
        return retrofit;
    }
}
