package com.project.gms.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
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

        val signId = binding.signIdEditText.text.toString()
        val signEmail = binding.signEmailEditText.text.toString()

        binding.emailBtn.setOnClickListener {
            navController.navigate(R.id.action_signUpFragment1_to_signUpFragment2)
        }

    }
}