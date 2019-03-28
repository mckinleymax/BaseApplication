package com.company.base.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "some_model")
data class SomeModel(@PrimaryKey(autoGenerate = true) val id: Long? = null, val data: String)