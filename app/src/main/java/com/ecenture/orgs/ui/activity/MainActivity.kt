package com.ecenture.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ecenture.orgs.R
import com.ecenture.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //val nome: TextView = findViewById<TextView>(R.id.nome)
        //nome.text = "Cesta de frutas"
        //val descricao = findViewById<TextView>(R.id.descricao)
        //descricao.text = "Laranja, manga e maçã"
        //val valor = findViewById<TextView>(R.id.valor)
        //valor.text = "19.99"

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }

}