package com.example.myapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _estacions = MutableLiveData<List<Estacio>>()
    val estacions: LiveData<List<Estacio>> = _estacions

    fun carregarDades(){
        viewModelScope.launch {
            try {
                val response = RetrofitClient.getApi().getEstacions()

                if (response.isSuccesful){
                    _estacions.value = response.body ?: emptyList()
                } else {
                    Log.e("Error de la api" ${e.response.code()}")
                }
            } catch (e: Exception){
                Log.e("Error de la api" ${e.message}")
            }
        }

    }



}