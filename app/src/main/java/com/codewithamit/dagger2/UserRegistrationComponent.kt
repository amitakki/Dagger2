package com.codewithamit.dagger2

import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun build(): UserRegistrationComponent

        fun setRetryCount(@BindsInstance retryCount: Int): Builder
    }
}