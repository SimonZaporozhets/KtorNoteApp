package com.szaporozhets.ktornoteapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.szaporozhets.ktornoteapp.data.local.entities.LocallyDeletedNoteID
import com.szaporozhets.ktornoteapp.data.local.entities.Note


@Database(
    entities = [Note::class, LocallyDeletedNoteID::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class NotesDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}