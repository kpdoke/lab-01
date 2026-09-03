package com.example.petshop

class Sad(date: String): Mood(date){
    override fun tell(): String {
        return "Pet is sad on $date"
    }
}