package com.example.utoilets.data

import com.example.utoilets.R
import com.example.utoilets.model.Toilet

class Datasource {
    fun loadToilets(): List<Toilet>{
        // List of cats, with their name and picture
        return listOf<Toilet>(
            Toilet(R.string.toiletBuilding1, R.string.toiletDescription1, R.drawable.image1),
            Toilet(R.string.toiletBuilding1, R.string.toiletDescription1, R.drawable.image1)
        )
    }
}