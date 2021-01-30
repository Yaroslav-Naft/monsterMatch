package com.yarsoalvnaftulyev.monstermatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yarsoalvnaftulyev.monstermatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    private val monsters: List<Monster> = listOf(
    //used data class for a monster to make a list of each type
    //allows to have 1 list with 1 class instead of 3 seperate list
    Monster(R.drawable.monster1_head, R.drawable.monster1_body, R.drawable.monster1_feet),
    Monster(R.drawable.monster2_head, R.drawable.monster2_body, R.drawable.monster2_feet),
    Monster(R.drawable.monster3_head, R.drawable.monster3_body, R.drawable.monster3_feet)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //different starting point
        shuffleMonsters()
        //listener on button will shuffle monsters
        binding.shuffleButton.setOnClickListener {
            shuffleMonsters()
        }
        //head image view found
        //activity main xml file
        //binding.headImageView.setImageResource(R.drawable.monster3_body)
        //same as setContentView(R.layout.activity_main)
        //setting content view to our binding
        //which is activity.main
    }

    private fun shuffleMonsters(){
        //the constant here gives you the entire
        //monster from which you pick the appropriate body
        //part to go into the image display
//        val randomMonster1 = monsters.random()
//        val randomMonster2 = monsters.random()
//        val randomMonster3 = monsters.random()
//
//        binding.headImageView.setImageResource(randomMonster1.head)
//        binding.bodyImageView.setImageResource(randomMonster2.body)
//        binding.feetImageView.setImageResource(randomMonster3.feet)
        //or
        binding.headImageView.setImageResource(monsters.random().head)
        binding.bodyImageView.setImageResource(monsters.random().body)
        binding.feetImageView.setImageResource(monsters.random().feet)
    }
}

data class Monster(val head: Int, val body: Int, val feet: Int)