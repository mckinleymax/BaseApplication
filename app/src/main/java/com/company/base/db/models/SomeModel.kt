package com.company.base.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class SomeModel(@PrimaryKey val id: Int)