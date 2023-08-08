package com.codewithamit.dagger2

import android.util.Log
import javax.inject.Inject

@ActivityScope
class EmailService @Inject constructor(): NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "send: Email Sent")
    }
}