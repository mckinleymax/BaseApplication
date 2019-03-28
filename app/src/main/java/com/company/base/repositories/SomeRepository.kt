package com.company.base.repositories

import androidx.lifecycle.LiveData
import com.company.base.db.dao.SomeDao
import com.company.base.db.models.SomeModel
import javax.inject.Inject

class SomeRepository @Inject constructor(private val dao: SomeDao) {
    fun fetch(): LiveData<SomeModel> {
        // Perform some network call and save to DB

        return dao.get()
    }
}