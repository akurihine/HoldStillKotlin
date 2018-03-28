package com.arkady.holdstillkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arkady.holdstillkotlin.data.DataProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        examplePager.setData(DataProvider.getMockData())
    }
}
