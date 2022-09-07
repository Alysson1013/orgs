package com.ecenture.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ecenture.orgs.R
import com.ecenture.orgs.models.Produto
import com.ecenture.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

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
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste 1", descricao = "test desc 1", valor = BigDecimal("19.99")),
            Produto(nome = "teste 2", descricao = "test desc 2", valor = BigDecimal("29.99")),
            Produto(nome = "teste 3", descricao = "test desc 3", valor = BigDecimal("39.99")),
        ))

        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}