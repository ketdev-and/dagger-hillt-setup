package com.example.dagger_hillt_setup

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object hiltAppModule {
    @Singleton
    @Provides
    @Named("string1")
    fun providestringinstance() = "this is from o-provide string instance"

    @Singleton
    @Provides
    @Named("string2")
    fun provideanotherinstance() = "this is from  p-ani string instance"

    @Singleton
    @Provides
    fun providefronresource(@ApplicationContext context:Context, @Named("string2") string2var:String)
    ="${context.getString(R.string.hilt_test)} is fron string resource aldo added ${string2var}"
}