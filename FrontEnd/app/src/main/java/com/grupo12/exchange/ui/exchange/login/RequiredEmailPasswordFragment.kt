package com.grupo12.exchange.ui.exchange.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.grupo12.exchange.R

class RequiredEmailPasswordFragment : Fragment() {

    //Declarate variables
    private lateinit var validateEmail: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_required_email_password, container, false)
    }

    //Navigate settings
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        validateEmail = view.findViewById(R.id.validate_email_button)

        validateEmail.setOnClickListener{
            it.findNavController().navigate(R.id.action_requiredEmailPasswordFragment2_to_validateEmailCodeFragment)
        }
    }

}