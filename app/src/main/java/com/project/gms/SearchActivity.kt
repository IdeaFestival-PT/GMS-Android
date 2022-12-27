package com.project.gms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.project.gms.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySearchBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.myInformationBtn.bringToFront()

        binding.myInformationBtn.setOnClickListener {
            val dialog = UserDialog(this)
            dialog.showDig()
        }

    }
}