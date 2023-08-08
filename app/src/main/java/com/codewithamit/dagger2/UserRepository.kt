package com.codewithamit.dagger2

interface UserRepository {
    fun saveUser(email: String, password: String)
}