package com.ecenture.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View(this)

        setContentView(view)
    }

}