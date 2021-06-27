package com.example.bibliotecaonline.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.bibliotecaonline.activities.ui.main.SectionsPagerAdapter
import com.example.bibliotecaonline.databinding.ActivityMainMenuBinding
import com.example.bibliotecaonline.R
import com.example.bibliotecaonline.profile.fragment.UserProfile

class MainMenu : AppCompatActivity() {

    private lateinit var binding: ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
       val profilebutton=findViewById<Button>(R.id.profile_button)
        profilebutton.setOnClickListener{
            val intent=Intent(this, UserProfile::class.java)
            startActivity(intent)
        }
    }
}