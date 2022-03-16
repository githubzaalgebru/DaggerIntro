package com.algebra.daggerintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity( ) {

    @Inject
    lateinit var utils : Utils

    @Inject
    lateinit var toastService : ToastService

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        AndroidInjection.inject( this )

        setupListeners( )
    }

    private fun setupListeners( ) {
        bAdd.setOnClickListener {
            val firstNumber  = Integer.parseInt( etNumOne.text.toString( ) )
            val secondNumber = Integer.parseInt( etNumTwo.text.toString( ) )
            val sum          = utils.add( firstNumber, secondNumber )
            Toast
                .makeText( this, "$sum", Toast.LENGTH_SHORT )
                .show( )
        }
        bTimes.setOnClickListener {
            val firstNumber  = Integer.parseInt( etNumOne.text.toString( ) )
            val secondNumber = Integer.parseInt( etNumTwo.text.toString( ) )
            val mult         = utils.times( firstNumber, secondNumber )
            Toast
                .makeText( this, "$mult", Toast.LENGTH_SHORT )
                .show( )

        }
        bPi.setOnClickListener {
            val firstNumber  = Integer.parseInt( etNumOne.text.toString( ) )
            val mult         = utils.timesPi( firstNumber )
            Toast
                .makeText( this, "$mult", Toast.LENGTH_SHORT )
                .show( )
        }
        bToast.setOnClickListener {
            Toast
              //.makeText( this, application.getString( R.string.app_name ), Toast.LENGTH_SHORT )
                .makeText( this, toastService.getText( R.string.app_name ), Toast.LENGTH_SHORT )
                .show( )

        }
    }
}