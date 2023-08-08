package com.codewithamit.dagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentBuilder(): UserRegistrationComponent.Builder
}