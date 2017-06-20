package com.example.calculadora.carsretrofit;

/**
 * Created by logonrm on 19/06/2017.
 */

public class APIUtils {
    public static final String BASE_URL = "http://10.3.1.28:3000";

    public static ICarroAPI getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(ICarroAPI.class);
    }
}


