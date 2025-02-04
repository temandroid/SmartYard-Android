package com.sesameware.domain.model.request

import com.sesameware.domain.BuildConfig
import com.squareup.moshi.Json

data class RegisterPushTokenRequest(
    @Json(name = "pushToken") val pushToken: String,
    @Json(name = "pushService") val pushService: String = BuildConfig.PUSH_SERVICE,
    @Json(name = "platform") val platform: String = PUSH_PLATFORM
)

const val PUSH_PLATFORM = "android"
