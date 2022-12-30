package com.project.gms.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.project.gms.Communication.CommunicationWork
import com.project.gms.DTO.ClientDTO
import com.project.gms.R
import com.project.gms.databinding.FragmentSignUp2Binding

class SignUpFragment2 : Fragment() {

    private lateinit var binding: FragmentSignUp2Binding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUp2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = requireActivity().findNavController(R.id.nav_host_fragment_email)

        binding.signBtn.setOnClickListener {
            val clientInfo = ClientDTO(
                binding.classNumberEditText.text.toString(),
                binding.nameEditText.text.toString(),
                binding.signSetPasswordEditText.text.toString(),
                arguments?.getString("email") ?: ""
            )
            val newPassword = binding.signSetPasswordEditText.text.toString()
            val checkPassword = binding.signCheckPasswordEditText.text.toString()
            if (newPassword == checkPassword){
                val retrofitwork = CommunicationWork()
                retrofitwork.clientInfoSend(clientInfo, context)
            }



        }

    }

}