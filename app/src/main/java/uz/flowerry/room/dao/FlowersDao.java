package uz.flowerry.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

import uz.flowerry.room.entity.FlowerEntity;

@Dao
public interface FlowersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(FlowerEntity data);

    @Delete
    public void delete(FlowerEntity data);

    @Query("SELECT * FROM flowers_table")
    public LiveData<List<FlowerEntity>> getFlowers();
}
