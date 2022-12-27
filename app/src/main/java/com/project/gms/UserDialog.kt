package com.project.gms

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.project.gms.databinding.DialogUserInformationBinding


class UserDialog(private val context: AppCompatActivity) {
    private lateinit var binding: DialogUserInformationBinding
    private val dialog = Dialog(context)

    fun showDig(){
        binding = DialogUserInformationBinding.inflate(context.layoutInflater)

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.dialog_user_information)

        dialog.window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
        dialog.getWindow()?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.logoutBtn.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}