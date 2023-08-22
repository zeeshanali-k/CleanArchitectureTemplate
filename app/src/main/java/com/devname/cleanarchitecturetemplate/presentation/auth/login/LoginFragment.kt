package com.devname.cleanarchitecturetemplate.presentation.auth.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.devname.cleanarchitecturetemplate.R
import com.devname.cleanarchitecturetemplate.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {


    private lateinit var binding: FragmentLoginBinding

    private val viewModel by lazy {
        viewModels<LoginViewModel>().value
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentLoginBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        binding.registerBtn.setOnClickListener {
            //You can also use directions api of navigation component
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        //view model will be instantiated here due to lazy initialization
        viewModel.doSomething()
    }

}