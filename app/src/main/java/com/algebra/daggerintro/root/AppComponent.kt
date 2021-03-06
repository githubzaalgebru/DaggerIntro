package com.algebra.daggerintro.root

import android.app.Application
import com.algebra.daggerintro.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [ AndroidSupportInjectionModule::class, ActivityBuilder::class ] )
interface AppComponent : AndroidInjector< DaggerApplication >{
    fun inject( activity: MainActivity )

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application( application : Application ): Builder

        fun build( ): AppComponent
    }
}