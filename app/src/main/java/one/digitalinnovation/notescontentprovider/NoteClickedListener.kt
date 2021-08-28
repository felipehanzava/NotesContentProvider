package one.digitalinnovation.notescontentprovider

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}