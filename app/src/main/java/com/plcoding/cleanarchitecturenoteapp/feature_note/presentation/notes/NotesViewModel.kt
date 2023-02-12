package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NotesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(private val notesUseCases: NotesUseCases):ViewModel(){

    private val noteUseCase
fun onEvent(event: NotesEvent){
    when (event){
        is NotesEvent.Order -> {

        }
        is NotesEvent.RestoreNote -> {

        }
        is NotesEvent.ToggleOrderection -> {

        }
    }
}
}