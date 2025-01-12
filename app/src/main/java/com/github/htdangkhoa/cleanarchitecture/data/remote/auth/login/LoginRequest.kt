package com.github.htdangkhoa.cleanarchitecture.data.remote.auth.login

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("client_id")
    var clientId: Int,
    @SerializedName("client_secret")
    var clientSecret: String,
    @SerializedName("grant_type")
    var grantType: String
)
