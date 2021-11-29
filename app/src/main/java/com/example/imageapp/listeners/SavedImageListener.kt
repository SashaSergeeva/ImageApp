package com.example.imageapp.listeners

import java.io.File

interface SavedImageListener {
    fun onImageClicked(file: File)
}