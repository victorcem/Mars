package com.example.android.marsrealestate.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MarsDataResponse (
        @Json(name = "results")
        val MarsResults: List<MarsProperty>
)