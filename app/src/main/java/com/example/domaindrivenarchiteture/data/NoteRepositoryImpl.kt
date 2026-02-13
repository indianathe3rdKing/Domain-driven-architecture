package com.example.domaindrivenarchiteture.data

import com.example.domaindrivenarchiteture.domain.model.Note
import com.example.domaindrivenarchiteture.domain.repositories.NoteRepository

class NoteRepositoryImpl: NoteRepository {
    private val notes = mutableListOf<Note>()
    private var id = 1
    override fun AddNote(note: Note) {
        notes.add(note.copy(id= id++))
    }

    override fun GetNotes(): List<Note> = notes.toList()


    override fun DeleteNote(note: Note) {
        notes.removeIf { it.id == note.id }
    }


}