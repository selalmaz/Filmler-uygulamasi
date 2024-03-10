package com.example.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.data.repo.FilmlerRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel: ViewModel() {
    var frepo = FilmlerRepo()

    var filmllerListesi = MutableLiveData<List<Filmler>>()
    init {
        filmleriYukle()
    }


    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            filmllerListesi.value=frepo.filmleriYukle()
        }

    }





}