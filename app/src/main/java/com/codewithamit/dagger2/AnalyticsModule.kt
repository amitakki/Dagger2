package com.codewithamit.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticalService {
        return Mixpanel()
    }
}