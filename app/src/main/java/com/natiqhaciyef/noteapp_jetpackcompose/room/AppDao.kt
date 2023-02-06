package com.natiqhaciyef.noteapp_jetpackcompose.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.natiqhaciyef.noteapp_jetpackcompose.model.NoteModel

@Dao
interface AppDao {

    @Query("SELECT * FROM NoteModel")
    fun getAllNotes(note: NoteModel): List<NoteModel>

    @Insert
    fun addNote(note: NoteModel)

    @Delete
    fun deleteNote(note: NoteModel)
}