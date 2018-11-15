package com.example.kurt.layoutconstraint

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dashboardFrag = DashboardFrag()

        getSupportFragmentManager().apply {
            beginTransaction().apply {
                replace(R.id.container, dashboardFrag)
                commit()
            }
        }

    }
}
