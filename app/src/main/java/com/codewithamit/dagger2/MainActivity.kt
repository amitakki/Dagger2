package com.codewithamit.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent

        val userRegistrationComponent =
            appComponent.getUserRegistrationComponentBuilder().setRetryCount(3).build()
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUSer("user@dagger.com", "123456")
    }
}