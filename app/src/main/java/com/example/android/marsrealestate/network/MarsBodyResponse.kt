package com.example.android.marsrealestate.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MarsBodyResponse (
    @Json(name = "data")
    val MarsResults: MarsDataResponse
)