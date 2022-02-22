package com.example.utoilets.data

import com.example.utoilets.R
import com.example.utoilets.model.Toilet

class Datasource {
    fun loadToilets(): List<Toilet>{
        // List of toilets, with their name, description, and picture
        return listOf<Toilet>(
            Toilet(R.string.toiletBuilding1, R.string.toiletDescription1, R.drawable.image1),
            Toilet(R.string.toiletBuilding2, R.string.toiletDescription2, R.drawable.image1)
        )
    }
}