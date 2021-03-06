package com.example.roomwordsample;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Word.class}, version = 1)
public class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao wordDao();
}
