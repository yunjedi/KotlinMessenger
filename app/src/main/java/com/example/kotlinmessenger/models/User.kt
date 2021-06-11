package com.example.kotlinmessenger.models

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val uid: String,
    val name: String,
    val profileImageUrl: String?
) : Parcelable

