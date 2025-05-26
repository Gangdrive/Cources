package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Information

class Datasource() {
    fun loadInformation(): List<Information>{
        return listOf<Information>(
            Information(R.drawable.architecture, R.string.architecture, R.string.architectureInt),
            Information(R.drawable.automotive, R.string.automotive, R.string.automotiveInt),
            Information(R.drawable.biology, R.string.biology, R.string.biologyInt),
            Information(R.drawable.business, R.string.business, R.string.businessInt),
            Information(R.drawable.crafts, R.string.crafts, R.string.craftsInt),
            Information(R.drawable.culinary, R.string.culinary, R.string.culinaryInt),
            Information(R.drawable.design, R.string.design, R.string.designInt),
            Information(R.drawable.drawing, R.string.drawing, R.string.drawingInt),
            Information(R.drawable.ecology, R.string.ecology, R.string.ecologyInt),
            Information(R.drawable.engineering, R.string.engineering, R.string.engineeringInt),
            Information(R.drawable.fashion, R.string.fashion, R.string.fashionInt),
            Information(R.drawable.film, R.string.film, R.string.filmInt),
            Information(R.drawable.finance, R.string.finance, R.string.financeInt),
            Information(R.drawable.gaming, R.string.gaming, R.string.gamingInt),
            Information(R.drawable.geology, R.string.geology, R.string.geologyInt),
            Information(R.drawable.history, R.string.history, R.string.historyInt),
            Information(R.drawable.journalism, R.string.journalism, R.string.journalismInt),
            Information(R.drawable.law, R.string.law, R.string.lawInt),
            Information(R.drawable.lifestyle, R.string.lifestyle, R.string.lifestyleInt),
            Information(R.drawable.music, R.string.music, R.string.musicInt),
            Information(R.drawable.painting, R.string.painting, R.string.paintingInt),
            Information(R.drawable.photography, R.string.photography, R.string.photographyInt),
            Information(R.drawable.physics, R.string.physics, R.string.physicsInt),
            Information(R.drawable.tech, R.string.tech, R.string.techInt),
        )
    }
}