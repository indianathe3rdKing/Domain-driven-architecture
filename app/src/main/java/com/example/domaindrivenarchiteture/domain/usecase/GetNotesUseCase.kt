package com.example.domaindrivenarchiteture.domain.usecase

import com.example.domaindrivenarchiteture.domain.model.Note
import com.example.domaindrivenarchiteture.domain.repositories.NoteRepository

class GetNotesUseCase(private val repository: NoteRepository) {
    operator fun invoke(): List<Note> = repository.GetNotes()
}