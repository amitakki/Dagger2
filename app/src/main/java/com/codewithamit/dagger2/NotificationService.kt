package com.codewithamit.dagger2

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}