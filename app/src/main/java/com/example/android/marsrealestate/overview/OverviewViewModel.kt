package com.example.android.marsrealestate.overview

import android.telecom.Call
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.marsrealestate.network.MarsApi
import com.example.android.marsrealestate.network.MarsBodyResponse
import com.example.android.marsrealestate.network.MarsProperty
import retrofit2.Callback
import retrofit2.Response


/**
 * The [ViewModel] that is attached to the [OverviewFragment].
 */
class OverviewViewModel : ViewModel() {

    // The internal MutableLiveData String that stores the most recent response
    private val _response = MutableLiveData<String>()

    // The external immutable LiveData for the response String
    val response: LiveData<String>
        get() = _response

    /**
     * Call getMarsRealEstateProperties() on init so we can display status immediately.
     */
    init {
        getMarsRealEstateProperties()
    }

    /**
     * Sets the value of the status LiveData to the Mars API status.
     */
    private fun getMarsRealEstateProperties() {
        _response.value = MarsApi.retrofitService.getProperties().enqueue(
                object : Callback<MarsBodyResponse> {
                    override fun onResponse(call: retrofit2.Call<MarsBodyResponse>, response: Response<MarsBodyResponse>) {
                        _response.value = response.body().toString()
                    }

                    override fun onFailure(call: retrofit2.Call<MarsBodyResponse>, t: Throwable) {
                        _response.value = "Errooooooo " + t.message
                    }

                }).toString()
    }
}
