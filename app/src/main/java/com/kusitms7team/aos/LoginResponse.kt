package com.kusitms7team.aos

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("isSuccess") var isSuccess: Boolean,
    @SerializedName("code") var code: Int,
    @SerializedName("message") var message: String,
    @SerializedName("result") var result: LoginResult,
)

data class LoginResult(
    @SerializedName("responseType") val responseType: String,
    @SerializedName("id") val id: Long,
    @SerializedName("role") val role: String,
    @SerializedName("accessToken") val accessToken: String
)