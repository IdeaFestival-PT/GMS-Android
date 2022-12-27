package com.project.gms.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.project.gms.LoginActivity
import com.project.gms.R
import com.project.gms.SearchActivity
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

        val classNumber = binding.classNumberEditText.text.toString()
        val name = binding.nameEditText.text.toString()
        val signSetPassword = binding.signSetPasswordEditText.text.toString()
        val signCheckPassword = binding.signCheckPasswordEditText.text.toString()

        binding.signBtn.setOnClickListener {
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
        }

    }

}