package com.anwesh.uiprojects.linkedplusiconview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.plusiconview.PlusIconView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PlusIconView.create(this)
    }
}
