package com.github.htdangkhoa.cleanarchitecture.data.service

import com.github.htdangkhoa.cleanarchitecture.data.remote.SuccessResponse
import com.github.htdangkhoa.cleanarchitecture.data.remote.auth.AuthResponse
import com.github.htdangkhoa.cleanarchitecture.data.remote.auth.login.LoginRequest
import com.github.htdangkhoa.cleanarchitecture.data.remote.auth.renew_token.RenewTokenRequest
import com.github.htdangkhoa.cleanarchitecture.data.remote.location.LocationResponse
import com.github.htdangkhoa.cleanarchitecture.data.remote.user.GetMeResponse
import com.github.htdangkhoa.cleanarchitecture.data.remote.user.UsersResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    // Auth

    @POST("login")
    suspend fun login(
        @Body loginRequest: LoginRequest
    ): AuthResponse

    @POST("renew_token")
    suspend fun renewToken(
        @Body renewTokenRequest: RenewTokenRequest
    ): AuthResponse

    // User

    @GET("me")
    suspend fun getMe(): GetMeResponse

    @GET("general/users?list=1")
    suspend fun getUsers(): UsersResponse

    @GET("logout")
    suspend fun logout(): SuccessResponse

    // Location

    @GET("general/locations?is_enabled=1&list=1")
    suspend fun getLocations(): LocationResponse
}
