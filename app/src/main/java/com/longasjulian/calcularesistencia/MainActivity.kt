package com.longasjulian.calcularesistencia

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*
import java.time.chrono.JapaneseEra.values

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Spinner 2
        val Color1: Spinner = findViewById(R.id.Color1_SP)
        ArrayAdapter.createFromResource(
            this,
            R.array.Colores1,
            R.layout.spinner_item_prueba
        ).also {adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_item_prueba)
            Color1.adapter = adapter
        }



        //Spinner 2
        val Color2: Spinner = findViewById(R.id.Color2_SP)
        ArrayAdapter.createFromResource(
            this,
            R.array.Colores,
            R.layout.spinner_item_prueba
        ).also {adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_item_prueba)
            Color2.adapter = adapter
        }

        //Spinner 3
        val Color3: Spinner = findViewById(R.id.Color3_SP)
        ArrayAdapter.createFromResource(
            this,
            R.array.Colores2,
            R.layout.spinner_item_prueba
        ).also {adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_item_prueba)
            Color3.adapter = adapter
        }

        //Oprimir el botón

        Calcular_BT.setOnClickListener {
            var Color_1    = Color1_SP.selectedItem.toString()
            var Color_2    = Color2_SP.selectedItem.toString()
            var Color_3    = Color3_SP.selectedItem.toString()

            val cafe     = "Café"
            val Rojo     = "Rojo"
            val Naranja  = "Naranja"
            val Amarillo = "Amarillo"
            val Verde    = "Verde"
            val Azul     = "Azul"
            val Morado   = "Morado"
            val Gris     = "Gris"
            val Blanco   = "Blanco"
            val Negro    = "Negro"
            val Oro      = "Oro"
            val Plata    = "Plata"

            var Resultado = 0.0

            // Color 1
            if (Color_1.equals(cafe)){
                Color_1_TV.setBackgroundResource(R.color.saddlebrown)
                Resultado = Resultado + 1
            }
            else if(Color_1.equals(Rojo)){
                Color_1_TV.setBackgroundResource(R.color.red)
                Resultado = Resultado + 2
            }
            else if(Color_1.equals(Naranja)){
                Color_1_TV.setBackgroundResource(R.color.orange)
                Resultado = Resultado + 3
            }
            else if(Color_1.equals(Amarillo)){
                Color_1_TV.setBackgroundResource(R.color.yellow)
                Resultado = Resultado + 4
            }
            else if(Color_1.equals(Verde)){
                Color_1_TV.setBackgroundResource(R.color.green)
                Resultado = Resultado + 5
            }
            else if(Color_1.equals(Azul)){
                Color_1_TV.setBackgroundResource(R.color.blue)
                Resultado = Resultado + 6
            }
            else if(Color_1.equals(Morado)){
                Color_1_TV.setBackgroundResource(R.color.purple)
                Resultado = Resultado + 7
            }
            else if(Color_1.equals(Gris)){
                Color_1_TV.setBackgroundResource(R.color.gray)
                Resultado = Resultado + 8
            }
            else if(Color_1.equals(Blanco)){
                Color_1_TV.setBackgroundResource(R.color.white)
                Resultado = Resultado + 9
            }

            // Color 2
            if (Color_2.equals(cafe)){
                Color_1_TV.setBackgroundResource(R.color.saddlebrown)
                Resultado = Resultado*10 + 1
            }
            else if(Color_2.equals(Rojo)){
                Color_2_TV.setBackgroundResource(R.color.red)
                Resultado = Resultado*10 + 2
            }
            else if(Color_2.equals(Naranja)){
                Color_2_TV.setBackgroundResource(R.color.orange)
                Resultado = Resultado*10 + 3
            }
            else if(Color_2.equals(Amarillo)){
                Color_2_TV.setBackgroundResource(R.color.yellow)
                Resultado = Resultado*10 + 4
            }
            else if(Color_2.equals(Verde)){
                Color_2_TV.setBackgroundResource(R.color.green)
                Resultado = Resultado*10 + 5
            }
            else if(Color_2.equals(Azul)){
                Color_2_TV.setBackgroundResource(R.color.blue)
                Resultado = Resultado*10 + 6
            }
            else if(Color_2.equals(Morado)){
                Color_2_TV.setBackgroundResource(R.color.purple)
                Resultado = Resultado*10 + 7
            }
            else if(Color_2.equals(Gris)){
                Color_2_TV.setBackgroundResource(R.color.gray)
                Resultado = Resultado*10 + 8
            }
            else if(Color_2.equals(Blanco)){
                Color_2_TV.setBackgroundResource(R.color.white)
                Resultado = Resultado*10 + 9
            }
            else if(Color_2.equals(Negro)){
                Color_2_TV.setBackgroundResource(R.color.black)
                Resultado = Resultado*10 + 0
            }

            //Resultado=Resultado * 0.1

            // Color 2
            if (Color_3.equals(cafe)){
                Color_3_TV.setBackgroundResource(R.color.saddlebrown)
                Resultado = Resultado * Math.pow(10.0, 1.0)
            }
            else if(Color_3.equals(Rojo)){
                Color_3_TV.setBackgroundResource(R.color.red)
                Resultado = Resultado * Math.pow(10.0, 2.0)
            }
            else if(Color_3.equals(Naranja)){
                Color_3_TV.setBackgroundResource(R.color.orange)
                Resultado = Resultado * Math.pow(10.0, 3.0)
            }
            else if(Color_3.equals(Amarillo)){
                Color_3_TV.setBackgroundResource(R.color.yellow)
                Resultado = Resultado * Math.pow(10.0, 4.0)
            }
            else if(Color_3.equals(Verde)){
                Color_3_TV.setBackgroundResource(R.color.green)
                Resultado = Resultado * Math.pow(10.0, 5.0)
            }
            else if(Color_3.equals(Azul)){
                Color_3_TV.setBackgroundResource(R.color.blue)
                Resultado = Resultado * Math.pow(10.0, 6.0)
            }
            else if(Color_3.equals(Morado)){
                Color_3_TV.setBackgroundResource(R.color.purple)
                Resultado = Resultado * Math.pow(10.0, 7.0)
            }
            else if(Color_3.equals(Negro)){
                Color_3_TV.setBackgroundResource(R.color.black)
            }
            else if(Color_3.equals(Oro)){
                Color_3_TV.setBackgroundResource(R.color.gold)
                Resultado = Resultado * 0.1
            }
            else if(Color_3.equals(Plata)){
                Color_3_TV.setBackgroundResource(R.color.silver)
                Resultado = Resultado * 0.01
            }

            Resultado_TV.text = Resultado.toString()

            if (Resultado >= Math.pow(10.0,7.0))
                Resultado_TV.text = ((Resultado / Math.pow(10.0,6.0)).toInt()).toString() + " M ohms"
            else {
                if (Resultado >= Math.pow(10.0, 6.0))
                    Resultado_TV.text = ((Resultado / Math.pow(10.0, 6.0)).toInt()).toString() + " M ohms"
                else{
                    if (Resultado >= Math.pow(10.0,3.0))
                        Resultado_TV.text = ((Resultado / Math.pow(10.0,3.0)).toInt()).toString() + " K ohms"
                    else{
                        if (Resultado > 1)
                            Resultado_TV.text = Resultado.toInt().toString() + " ohms"
                        else
                            Resultado_TV.text = Resultado.toString() + " ohms"

                    }
                }
            }
        }

    }

}