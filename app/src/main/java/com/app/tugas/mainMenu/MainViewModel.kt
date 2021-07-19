package com.app.tugas.mainMenu

import androidx.lifecycle.ViewModel
import com.app.tugas.domain.GetMessageUseCase

class MainViewModel(private val getMessageUseCase: GetMessageUseCase) : ViewModel() {
    fun getMessage(name: String) = getMessageUseCase.run(name)
}