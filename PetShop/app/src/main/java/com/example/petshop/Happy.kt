package com.example.petshop

class Happy(date: String): Mood(date){
    override fun tell(): String {
        return "Pet is happy on $date"
    }
}