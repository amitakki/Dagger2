package com.codewithamit.dagger2

import android.util.Log
import javax.inject.Inject

@ActivityScope
class SQLUserRepository @Inject constructor(val                                                                                                                                                                                                                                                                                                                                    analyticalService: AnalyticalService) :
    UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in DB")
    }
}