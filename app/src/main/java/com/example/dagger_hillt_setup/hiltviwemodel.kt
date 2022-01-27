package com.example.dagger_hillt_setup

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class hiltviwemodel @Inject constructor( @Named("string2") fromModule :String ) : ViewModel() {
    init {
        Log.d("viewmodelhilt", "injecting the viewmodel with string 2 dependancies resulting to ${fromModule}")
    }
}