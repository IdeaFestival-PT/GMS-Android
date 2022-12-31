package com.project.gms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.gms.Communication.CommunicationWork
import com.project.gms.DTO.Category
import com.project.gms.databinding.ActivitySearchBinding
import java.util.*

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    var location: String = ""
    var category: Category = Category.None
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
            val category = category
            val location = location
            val serchDataSend = CommunicationWork()
            serchDataSend.searchInfoSend(category = category, location = location, context = this)

        }

        binding.koreanFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked == true){
                category = Category.KOREA
                binding.westernFoodCheckBox.isChecked = false
                binding.chineseFoodCheckBox.isChecked = false
                binding.japaneseFoodCheckBox.isChecked = false
            }
            else if (isChecked == false){
                category = Category.None
            }
        }

        binding.chineseFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked == true){
                category = Category.CHINA
                binding.koreanFoodCheckBox.isChecked = false
                binding.westernFoodCheckBox.isChecked = false
                binding.japaneseFoodCheckBox.isChecked = false
            }
            else if(isChecked == false){
                category = Category.None
            }
        }
        binding.westernFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked == true){
                category = Category.WESTERN
                binding.koreanFoodCheckBox.isChecked = false
                binding.chineseFoodCheckBox.isChecked = false
                binding.japaneseFoodCheckBox.isChecked = false
            }
            else if (isChecked == false){
                category = Category.None
            }
        }

        binding.japaneseFoodCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked == true){
                category = Category.JAPAN
                binding.koreanFoodCheckBox.isChecked = false
                binding.westernFoodCheckBox.isChecked = false
                binding.chineseFoodCheckBox.isChecked = false
            }
            else if (isChecked == false){
                category = Category.None
            }
        }

        binding.areaChoiceRadioGroupLine1.setOnCheckedChangeListener{ group, checkedId ->
            when(checkedId){
                R.id.seoul -> {
                    if(binding.seoul.isChecked) {
                        location = "서울"
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.busan -> {
                    if(binding.busan.isChecked) {
                        location = "부산"
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.yeosuSuncheon -> {
                    if(binding.yeosuSuncheon.isChecked) {
                        location = "여수/순천"
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
                        location = "인천"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.daegu -> {
                    if(binding.daegu.isChecked) {
                        location = "대구"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.mokpoNaju -> {
                    if(binding.mokpoNaju.isChecked) {
                        location = "목포/나주"
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
                        location = "광주"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.ulsan -> {
                    if(binding.ulsan.isChecked) {
                        location = "울산"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine4.clearCheck()
                    }
                }
                R.id.suwonHwaseong -> {
                    if(binding.suwonHwaseong.isChecked) {
                        location = "수원/화성"
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
                        location = "성남"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.jeonju -> {
                    if(binding.jeonju.isChecked) {
                        location = "전주"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
                R.id.jeju -> {
                    if(binding.jeju.isChecked) {
                        location = "제주"
                        binding.areaChoiceRadioGroupLine1.clearCheck()
                        binding.areaChoiceRadioGroupLine2.clearCheck()
                        binding.areaChoiceRadioGroupLine3.clearCheck()
                    }
                }
            }
        }
    }
}