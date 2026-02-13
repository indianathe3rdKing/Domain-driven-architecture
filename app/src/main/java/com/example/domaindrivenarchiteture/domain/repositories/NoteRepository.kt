package com.example.domaindrivenarchiteture.domain.repositories

import com.example.domaindrivenarchiteture.domain.model.Note

interface NoteRepository {

    fun AddNote(note: Note)
    fun GetNotes(): List<Note>
    fun DeleteNote(note:Note)
}