package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)

        //Create a list of pets
        //Method 1
        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        //Method 2 val pets = mutableListOf(cat, dog)

        val scorpion = Scorpion("Stinger", 32)
        pets.add(scorpion)

        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)

        val happy = Happy(date = "1st Jan, 2026")
        val sad = Sad(date = "31st Jan, 2026")


    }
}
