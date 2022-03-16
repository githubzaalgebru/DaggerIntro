package com.algebra.daggerintro

import javax.inject.Inject

class Utils @Inject constructor( ) {

    private val PI : Double = 3.14

    fun timesPi( num : Int ) : Double {
        return num * PI
    }

    fun add( num1 : Int, num2 : Int ) : Int {
        return num1 + num2
    }

    fun times( num1 : Int, num2 : Int ) : Int {
        return num1 * num2
    }

    fun PiValue( ) : Double {
        return PI
    }

}