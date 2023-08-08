package com.codewithamit.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

/*    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseUserRepository()
    }*/

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlUserRepository: SQLUserRepository): UserRepository
}