package com.codewithamit.dagger2

interface AnalyticalService {
    fun trackEvent(eventName: String, eventType: String)
}