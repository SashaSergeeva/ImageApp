package com.example.imageapp.dependencyinjection

import com.example.imageapp.repositories.EditImageRepository
import com.example.imageapp.repositories.EditImageRepositoryImpl
import com.example.imageapp.repositories.SavedImagesRepository
import com.example.imageapp.repositories.SavedImagesRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoryModule = module {
    factory<EditImageRepository> {EditImageRepositoryImpl(androidContext())}
    factory<SavedImagesRepository> {SavedImagesRepositoryImpl(androidContext())}
}