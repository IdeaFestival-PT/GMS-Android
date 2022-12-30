package com.project.gms.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.project.gms.Communication.CommunicationWork
import com.project.gms.DTO.EmailSendDTO
import com.project.gms.R
import com.project.gms.databinding.FragmentSignUp1Binding

class SignUpFragment1 : Fragment() {

    private lateinit var binding: FragmentSignUp1Binding
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUp1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = requireActivity().findNavController(R.id.nav_host_fragment_email)

        binding.signSentNumberBtn.setOnClickListener {
            val userEmailData = EmailSendDTO(
                binding.signIdEditText.text.toString()
            )
            Log.d("TAG",userEmailData.toString())
            val emailSendWork = CommunicationWork()
            emailSendWork.sendEmail(userEmailData)
        }

        binding.emailBtn.setOnClickListener {
            val authKey = binding.signEmailEditText.text.toString()
            val email = binding.signIdEditText.text.toString()
            val retrofitWork = CommunicationWork()
            retrofitWork.emailCodeSend(authKey, email, this)
        }
    }
}