package com.example.dagger_hillt_setup


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("string1")
    lateinit var textString : String;

    @Inject
    @Named("string2")
    lateinit var textString2 :String;

    private val viewmodel:hiltviwemodel by viewModels();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        viewmodel
        Log.d("MainActivity", "test string from hiltAppModule is $textString");
        Log.d("MainActivity", "test string from hiltAppModule is $textString2");
    }
}