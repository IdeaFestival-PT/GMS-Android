package com.project.gms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.project.gms.databinding.ActivitySearchBinding
import java.util.*

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySearchBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val random = Random()
        var num = random.nextInt(4)

        when(num){
            0 -> binding.searchBackgroundImage.setImageResource(R.drawable.search_background_image1)
            1 -> binding.searchBackgroundImage.setImageResource(R.drawable.search_background_image2)
            2 -> binding.searchBackgroundImage.setImageResource(R.drawable.search_background_image3)
            3 -> binding.searchBackgroundImage.setImageResource(R.drawable.search_background_image4)
        }

        binding.myInformationBtn.bringToFront()

        binding.myInformationBtn.setOnClickListener {
            val dialog = UserDialog()
            dialog.show(supportFragmentManager, "UserDialog")
        }

        binding.searchBtn.setOnClickListener {
            val intent = Intent(this, RestaurantRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        binding.areaChoiceRadioGroupLine1.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.seoul -> {
                    if(binding.seoul.isChecked) {
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.busan -> {
                    if(binding.busan.isChecked) {
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.yeosuSuncheon -> {
                    if(binding.yeosuSuncheon.isChecked) {
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.seongnam -> {
                    if(binding.seongnam.isChecked) {
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
            }
        }
        binding.areaChoiceRadioGroupLine2.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.incheon -> {
                    if(binding.incheon.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.daegu -> {
                    if(binding.daegu.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.mokpoNaju -> {
                    if(binding.mokpoNaju.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.jeonju -> {
                    if(binding.jeonju.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
            }
        }
        binding.areaChoiceRadioGroupLine3.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.gwangju -> {
                    if(binding.gwangju.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                    }
                }
                R.id.ulsan -> {
                    if(binding.ulsan.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                    }
                }
                R.id.suwonHwaseong -> {
                    if(binding.suwonHwaseong.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                    }
                }
                R.id.jeju -> {
                    if(binding.jeju.isChecked) {
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                    }
                }
            }
        }
    }
}