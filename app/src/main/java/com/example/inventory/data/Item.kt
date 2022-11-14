package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat

/**
 * Created by Harris on 07/10/2022
 */

@Entity(tableName = "item")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    @ColumnInfo(name = "name")
    val itemName: String,
    @ColumnInfo(name = "price")
    val itemPrice: Double,
    @ColumnInfo(name = "quantity")
    val quantityInStock: Int
)
/**
 * Extension Function to format Item Price to a  currency format String
  */
fun Item.getFormattedPrice() : String = NumberFormat.getCurrencyInstance().format(itemPrice)