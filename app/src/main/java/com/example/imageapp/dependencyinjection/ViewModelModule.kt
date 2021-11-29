package com.example.imageapp.dependencyinjection

import com.example.imageapp.viewmodels.EditImageViewModel
import com.example.imageapp.viewmodels.SavedImagesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { EditImageViewModel(editImageRepository = get()) }
    viewModel {SavedImagesViewModel(savedImagesRepository = get())}
}