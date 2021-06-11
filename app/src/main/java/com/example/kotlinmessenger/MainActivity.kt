package com.example.kotlinmessenger

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.kotlinmessenger.adapter.ViewPager2Adapter
import com.example.kotlinmessenger.databinding.ActivityMainBinding
import com.example.kotlinmessenger.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Hide Toolbar manually
        //getSupportActionBar().hide();
        //setSupportActionBar(binding.toolbar)

        val adapter = ViewPager2Adapter(this)
        binding.content.adapter = adapter

        binding.content.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                when(position){
                    0-> binding.bottomNav.menu.findItem(R.id.navigation_chat).isChecked = true
                    1-> binding.bottomNav.menu.findItem(R.id.navigation_contacts).isChecked = true
                    2-> binding.bottomNav.menu.findItem(R.id.navigation_profile).isChecked = true
                    else-> { 0 }
                }
            }
        })
        binding.bottomNav.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.navigation_chat -> binding.content.currentItem = 0
                R.id.navigation_contacts -> binding.content.currentItem = 1
                R.id.navigation_profile -> binding.content.currentItem = 2
            }
        }

    }
}