package com.example.imageapp.listeners

import com.example.imageapp.data.ImageFilter

interface ImageFilterListener {
    fun onFilterSelected(imageFilter: ImageFilter)
}