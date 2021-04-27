package uz.flowerry.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import uz.flowerry.room.dao.FlowersDao;
import uz.flowerry.room.entity.FlowerEntity;

@Database(entities = {FlowerEntity.class}, version = 1)
public abstract class FlowerDatabase extends RoomDatabase {

    public abstract FlowersDao getFlowerDao();

    static FlowerDatabase instance;

    static public FlowerDatabase getDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context,
                    FlowerDatabase.class,
                    "mydatabase.db")
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instance;
    }
}
