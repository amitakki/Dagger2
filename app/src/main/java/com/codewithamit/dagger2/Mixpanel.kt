package com.codewithamit.dagger2

import android.util.Log

class Mixpanel: AnalyticalService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel: $eventName - $eventType")
    }
}