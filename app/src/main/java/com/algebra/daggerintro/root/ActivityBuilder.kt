package com.algebra.daggerintro.root

import com.algebra.daggerintro.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    internal abstract fun bindMainActivity( ) : MainActivity
}