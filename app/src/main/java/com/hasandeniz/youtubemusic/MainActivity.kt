package com.hasandeniz.youtubemusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hasandeniz.youtubemusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sarkiListesi = ArrayList<Sarki>()
        val s1 = Sarki("Never Be the Same", "Camila Cabello · 3:46")
        val s2 = Sarki("All These Years", "Camila Cabello · 2:42")
        val s3 = Sarki("She Loves Control", "Camila Cabello · 2:57")
        val s4 = Sarki("Havana (feat. Camila Cabello)", "Camila Cabello · 3:37")
        val s5 = Sarki("Inside Out", "Camila Cabello · 3:03")

        sarkiListesi.add(s1)
        sarkiListesi.add(s2)
        sarkiListesi.add(s3)
        sarkiListesi.add(s4)
        sarkiListesi.add(s5)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = SarkiAdapter(this,sarkiListesi)
        binding.recyclerView.adapter = adapter
    }
}