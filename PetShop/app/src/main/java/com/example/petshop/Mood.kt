package com.example.petshop

abstract class Mood(var date: String){
    abstract fun tell(): String
}