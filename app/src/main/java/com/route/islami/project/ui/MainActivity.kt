package com.route.islami.project.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.route.islami.R
import com.route.islami.databinding.ActivityMainBinding
import com.route.islami.project.home.hadeth.HadethFragment
import com.route.islami.project.home.quran.QuranFragment
import com.route.islami.project.home.radio.RadioFragment
import com.route.islami.project.home.sebha.SebhaFragment

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initViews()
    }

    private fun initViews() {
        viewBinding.content.btnNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_quran -> {
                    pushFragment(QuranFragment())
                }

                R.id.nav_hadeth -> {
                    pushFragment(HadethFragment())
                }

                R.id.nav_sebha -> {
                    pushFragment(SebhaFragment())
                }

                R.id.nav_radio -> {
                    pushFragment(RadioFragment())
                }
                else ->{
                    pushFragment(QuranFragment())
                }
            }
            true
        }
        viewBinding.content.btnNav.selectedItemId = R.id.nav_quran
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().addToBackStack(null).replace(viewBinding.content.fragmentContainer.id,fragment).commit()
    }
}