package com.rrtutors.cicd2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rrtutors.cicd2.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Log.v("MainActivity","MainActivity ");
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}