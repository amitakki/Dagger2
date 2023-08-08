package com.codewithamit.dagger2

import android.util.Log

class FirebaseAnalytics: AnalyticalService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Firebase: $eventName - $eventType")
    }
}