package com.aentrena.androidcompose

import androidx.lifecycle.ViewModel
import com.aentrena.androidcompose.data.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HeroListViewModel @Inject constructor(repository: RepositoryImpl): ViewModel() {

}