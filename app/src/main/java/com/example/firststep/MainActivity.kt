package com.example.firststep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //устанавливает файл ресурсов activity_main.xml в качестве разметки активити главного экрана.
        setContentView(R.layout.activity_main)

    }


}

