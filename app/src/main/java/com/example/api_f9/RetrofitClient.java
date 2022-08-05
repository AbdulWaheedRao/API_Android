package com.example.api_f9;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit instance;
    public static final String BASE_URL="https://jsonplaceholder.typicode.com";
    public static Retrofit getInstance(){
        if (instance==null){
            instance=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
