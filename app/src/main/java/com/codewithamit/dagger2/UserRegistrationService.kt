package com.codewithamit.dagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                                  @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUSer(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@dagger.com", "User registered Successfully")
    }
}