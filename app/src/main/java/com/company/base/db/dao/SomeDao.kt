package com.company.base.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.company.base.db.models.SomeModel

@Dao
interface SomeDao {
    @Query("SELECT * FROM some_model")
    fun get(): LiveData<SomeModel>
}