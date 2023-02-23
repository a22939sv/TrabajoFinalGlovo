package com.sanvalero.trabajofinalglovo.util;

import com.sanvalero.trabajofinalglovo.entities.Restaurante;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("restaurante")
    Call<Restaurante> getRestaurantes();
}
