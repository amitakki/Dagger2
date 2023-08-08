package com.codewithamit.dagger2

import android.util.Log

class MessageService(private val retryCount: Int): NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "send: Message Sent - Retry Count $retryCount")
    }
}