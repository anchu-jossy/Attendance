package net.gahfy.mvvmposts.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import net.gahfy.mvvmposts.model.Post
import net.gahfy.mvvmposts.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}