package com.example.myapplication

data class EstacioRequest(

    val id:Int,
    val nom: String? = null,
    val ubicacio: String? = null,
    val latitud: Double? = null,
    val longitud: Double? = null

)
