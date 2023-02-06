package com.natiqhaciyef.noteapp_jetpackcompose.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.natiqhaciyef.noteapp_jetpackcompose.model.NoteModel

@Database(entities = [NoteModel::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getDao() : AppDao
}