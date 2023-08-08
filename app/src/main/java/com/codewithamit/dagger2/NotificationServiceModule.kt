package com.codewithamit.dagger2

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule() {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int) : NotificationService {
        return MessageService(retryCount)
    }

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}