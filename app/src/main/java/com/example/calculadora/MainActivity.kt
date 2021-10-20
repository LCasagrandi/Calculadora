package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcButton.setOnClickListener{ calculate() }
    }


    fun calculate(){

        //armazena qual foi a operação selecionada
        val selectedCalcOp = binding.calcOptions.checkedRadioButtonId

        //armaneza os valores dos EditText nas variaveis, em string
        val calc_n1 = binding.calcNumber1.text.toString().toFloat()
        val calc_n2 = binding.calcNumber2.text.toString().toFloat()

        //funções da calculadora
        fun sum(calc_n1: Float, calc_n2: Float): Float { return calc_n1 + calc_n2}
        fun minus(calc_n1: Float, calc_n2: Float): Float { return calc_n1 - calc_n2}
        fun multiply(calc_n1: Float, calc_n2: Float): Float { return calc_n1 * calc_n2}
        fun divide(calc_n1: Float, calc_n2: Float): Float { return calc_n1 / calc_n2}

        //condição que faz o calculo baseado na opção selecionada
        val calculateResult = when (selectedCalcOp) {

            R.id.sum -> sum(calc_n1, calc_n2)
            R.id.minus -> minus(calc_n1, calc_n2)
            R.id.multiply -> multiply(calc_n1, calc_n2)
            else -> divide(calc_n1, calc_n2)
        }

        //armazena na propriedade text o resultado da operação
        binding.calcResult.text = calculateResult.toString()
    }
}