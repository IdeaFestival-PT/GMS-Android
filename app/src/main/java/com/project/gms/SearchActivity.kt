package com.project.gms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.gms.databinding.ActivitySearchBinding
import java.util.*

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    var location: String = ""
    var categoryS = "None"
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySearchBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val random = Random()
        var num = random.nextInt(4)

        val intent = Intent(this, RestaurantRecyclerViewActivity::class.java)
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
            intent.putExtra("category", categoryS)
            intent.putExtra("location", location)
            this.startActivity(intent)
        }

        binding.koreanFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked == true){
                binding.westernFoodCheckBox.isChecked = false
                binding.chineseFoodCheckBox.isChecked = false
                binding.japaneseFoodCheckBox.isChecked = false
                categoryS = "KOREA"
            }
            else if (isChecked == false){
                categoryS = "None"
            }
        }

        binding.chineseFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked == true){
                binding.koreanFoodCheckBox.isChecked = false
                binding.westernFoodCheckBox.isChecked = false
                binding.japaneseFoodCheckBox.isChecked = false
                categoryS = "CHINA"
            }
            else if (isChecked == false){
                categoryS = "None"
            }
        }
        binding.westernFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked == true){
                binding.koreanFoodCheckBox.isChecked = false
                binding.chineseFoodCheckBox.isChecked = false
                binding.japaneseFoodCheckBox.isChecked = false
                categoryS = "WESTERN"
            }
            else if (isChecked == false){
                categoryS = "None"
            }
        }

        binding.japaneseFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked == true){
                binding.koreanFoodCheckBox.isChecked = false
                binding.westernFoodCheckBox.isChecked = false
                binding.chineseFoodCheckBox.isChecked = false
                categoryS = "JAPAN"
            }
            else if (isChecked == false){
                categoryS = "None"
            }
        }

        binding.areaChoiceRadioGroupLine1.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.seoul -> {
                    if(binding.seoul.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.busan -> {
                    if(binding.busan.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.yeosuSuncheon -> {
                    if(binding.yeosuSuncheon.isChecked) {
                        location = "??????/??????"
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
            }
        }
        binding.areaChoiceRadioGroupLine2.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.incheon -> {
                    if(binding.incheon.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.daegu -> {
                    if(binding.daegu.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.mokpoNaju -> {
                    if(binding.mokpoNaju.isChecked) {
                        location = "??????/??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
            }
        }
        binding.areaChoiceRadioGroupLine3.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.gwangju -> {
                    if(binding.gwangju.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.ulsan -> {
                    if(binding.ulsan.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.suwonHwaseong -> {
                    if(binding.suwonHwaseong.isChecked) {
                        location = "??????/??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }

            }
        }
        binding.areaChoiceRadioGroupLine4.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.seongnam -> {
                    if(binding.seongnam.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.jeonju -> {
                    if(binding.jeonju.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.jeju -> {
                    if(binding.jeju.isChecked) {
                        location = "??????"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
            }
        }
    }
}