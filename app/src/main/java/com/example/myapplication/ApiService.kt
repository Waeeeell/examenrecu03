package com.example.myapplication

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Body


interface ApiService {

    @GET ("/estacions/")
    suspend fun getEstacions(): Response<List<Estacio>>

    @POST ("/estacions/detall")
    suspend fun getEstacioDetall(@Body request: EstacioRequest): Response <Estacio>

    @GET ("/estacions/{id}/registres/avui")
    suspend fun getRegistreAvui(@Path("id") id: Int): Response<List<Registre>>


}