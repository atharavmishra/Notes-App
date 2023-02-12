package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

data class NoteState(val notes: List<Note> = emptyList(),
                     val noteOrder: NoteOrder,
                     val isOrderSectionVisible : Boolean = false)
