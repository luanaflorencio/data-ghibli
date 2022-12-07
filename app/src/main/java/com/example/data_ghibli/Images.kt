package com.example.data_ghibli

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Images (
    @SerializedName("url")
    val url:String? = null
): Parcelable