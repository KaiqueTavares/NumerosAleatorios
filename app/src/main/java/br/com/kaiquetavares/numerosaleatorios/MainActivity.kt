package br.com.kaiquetavares.numerosaleatorios

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ao clicar no ID setado no Activity_main.xml irei dar a função de click
        botao.setOnClickListener{
            // Abri as {} para que ele rode diretamente o meu codigo
            //Criei uma variavel gerador que recebe valores random
            val gerador = Random()
            //e nosso texto,
            label.text = gerador.nextInt(50).toString()
        }

    }
}
