package com.edaascioglu.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private var Any.text: String
    get() {}
    set() = Unit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun sinifCalismasi(textView: Any) {
            var superman =Superkahraman("Superman",50,"Gazeteci")
            textView.text="Yas:${superman.yas}"
            superman.testFonksiyonu()

            println(superman.sacRenginiAl())
        }
    }
        fun nullGuvenligi(){
            //Null,Nullability,Null Safety

            //Tanımlama ,Definening
            var benimString :String

            //Initialization
            benimString ="Atıl"

            var benimYasim : Int?=null
            println(benimYasim)

            //benimYasim=2
            //1
            if (benimYasim!=null){
                println(benimYasim*2)
            }
            else{
                println("null geldi")
            }
            //2
            //!!->null olmayacak,->null olabilir
            println(benimYasim!!.minus(2))

            //3
            //elvis operatörü

            //benimYasim =10
            val sonuc=benimYasim?.minus(2)?:10
            println(sonuc)

            //4
            //let

            benimYasim=5
            benimYasim?.let{
                println(it*5)
            }
        }


}