package com.edaascioglu.siniflarvefonksiyonlar

class Superkahraman (var isim:String,var yas:Int,var meslek:String){
//(Primary Constructor)

       var sacininRengi="Sarı"

        fun testFonksiyonu(){
        println("test")
    }

    //Getter
    fun sacRenginiAl():String{
        return this.sacininRengi
    }
    //Setter
    /*
    fun sacRenginiDegistir(){
    this.sacininRengi="Yeşil"
    }
     */
    //Access Levels-Erişebilirlik Seviyeleri
    //private-protected-internal-public
    /*
    //Propert

    var isim=""
    var yas =0
    var meslek=""

    //Constructor

    constructor(isim:String,yas:Int,meslek:String){
    this.isim=isim
    this.yas=yas
    this.meslek=meslek
    println("constructor çağırıldı")
     */



}