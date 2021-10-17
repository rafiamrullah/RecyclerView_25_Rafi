package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Haikyuuu(
    val imgHaikyuuu: Int,
    val nameHaikyuuu: String,
    val descHaikyuuu: String,
) : Parcelable
