package com.grupo12.exchange.ui.exchange.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.grupo12.exchange.R

class LoginFragment : Fragment() {

    //Declarate variables
    private lateinit var forgotPassword: TextView
    private lateinit var actionToSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionToSignup = view.findViewById(R.id.sign_up_button)
        forgotPassword = view.findViewById(R.id.forgot_password)

        actionToSignup.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }

        forgotPassword.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
    }

}