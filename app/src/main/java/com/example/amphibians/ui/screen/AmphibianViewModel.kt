package com.example.amphibians.ui.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

sealed interface AmphibianUiState {
    data class Success(val data: String) : AmphibianUiState
    object Error : AmphibianUiState
    object Loading : AmphibianUiState
}

class AmphibianViewModel : ViewModel() {
    var amphibianUiState : AmphibianUiState by mutableStateOf(AmphibianUiState.Loading)

    init {
        getAmpData()
    }

    fun getAmpData(){
//        viewModelScope.launch {
//            amphibianUiState = AmphibianUiState.Loading
//            amphibianUiState = try{
//                var name = null
//                AmphibianUiState.Success()
//            }
//            catch (e: IOException) {
//                AmphibianUiState.Error
//            } catch (e: HttpException) {
//                AmphibianUiState.Error
//            }
//        }
    }

//    companion object {
//        val Factory: ViewModelProvider.Factory = viewModelFactory {
//            initializer {
//                val application =(this[APPLICATION_KEY] as AmphibianApplication)
//                val
//            }
//        }
//    }
}