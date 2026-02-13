package com.example.domaindrivenarchiteture.domain.usecase

import com.example.domaindrivenarchiteture.domain.model.Note
import com.example.domaindrivenarchiteture.domain.repositories.NoteRepository

class AddNotesUseCase(private val repository: NoteRepository) {
    operator fun invoke(note: Note)= repository.AddNote(note)
}