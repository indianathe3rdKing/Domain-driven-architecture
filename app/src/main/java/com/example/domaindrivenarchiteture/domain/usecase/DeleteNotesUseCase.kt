package com.example.domaindrivenarchiteture.domain.usecase

import com.example.domaindrivenarchiteture.domain.model.Note
import com.example.domaindrivenarchiteture.domain.repositories.NoteRepository

class DeleteNotesUseCase(private val respository: NoteRepository) {
    operator fun invoke(note: Note) = respository.DeleteNote(note)
}