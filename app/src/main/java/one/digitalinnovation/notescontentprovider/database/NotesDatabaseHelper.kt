package one.digitalinnovation.notescontentprovider.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns

class NotesDatabaseHelper(context: Context
): SQLiteOpenHelper(context, "databasenotes", null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NOTES (" +
                "${BaseColumns._ID} INTEGER NOT NULL PRIMARY KEY," +
                "$TITLE_NOTES TEXT NOT NULL," +
                "$DESCRIPTION_NOTES TEXT NOT NULL")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }

    companion object{
        const val TABLE_NOTES: String = "Notes"
        const val TITLE_NOTES: String = "title"
        const val DESCRIPTION_NOTES: String = "description"
    }

}