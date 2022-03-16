package com.algebra.daggerintro

import android.app.Application
import javax.inject.Inject

class ToastService @Inject constructor( val field : Application ) {

    fun getText( stringId : Int ) = field.getString( stringId )
}