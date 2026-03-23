package com.aentrena.androidcompose.ui.theme.herolist

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aentrena.androidcompose.data.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import javax.inject.Inject



@HiltViewModel
class HeroListViewModel @Inject constructor(
    private val repository: RepositoryImpl
): ViewModel() {

    val heros = generateHeros()

    private val _state: MutableStateFlow<HeroListState> = MutableStateFlow(HeroListState.Loading)
    val state: StateFlow<HeroListState> = _state.asStateFlow()

    init {
        getHeros()
    }

    fun getHeros(){
        viewModelScope.launch {
            _state.update { HeroListState.Loading }

            Log.d("VIEW_MODEL", _state.toString())

            val result = runCatching {
                withContext(Dispatchers.IO) {
                    repository.getHeros()
                }
            }
            Log.d("VIEW_MODEL", _state.toString())

            if (result.isSuccess){
                _state.update { HeroListState.Success(result.getOrThrow()) }
            } else {
                _state.update { HeroListState.Error(result.exceptionOrNull()?.message.orEmpty()) }
            }
            Log.d("VIEW_MODEL", _state.toString())
        }
    }
}