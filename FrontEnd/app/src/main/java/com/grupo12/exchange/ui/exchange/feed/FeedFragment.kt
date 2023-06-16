package com.grupo12.exchange.ui.exchange.feed

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.grupo12.exchange.R


class FeedFragment : AppCompatActivity() {

    val bottomsheet = findViewById<LinearLayout>(R.id.selectMenu)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_feed)
        bottomsheet.setOnClickListener() {
            showDialog()
        }
    }

    private fun showDialog() {

        val dialog = BottomSheetDialog(this)
        dialog.setContentView(R.layout.fragment_menu)

        val homeLayout = dialog.findViewById<LinearLayout>(R.id.layoutHome)
        val categoryLayout = dialog.findViewById<LinearLayout>(R.id.layoutCategory)
        val addLayout = dialog.findViewById<LinearLayout>(R.id.layoutAdd)
        val searchLayout = dialog.findViewById<LinearLayout>(R.id.layoutSearch)
        val profileLayout = dialog.findViewById<LinearLayout>(R.id.layoutProfile)

        if (homeLayout != null) {
            homeLayout.setOnClickListener() {
                findNavController().navigate(R.id.action_menuFragment_to_feedFragment2)
            }
        }

        if (categoryLayout != null) {
            categoryLayout.setOnClickListener() {
                findNavController().navigate(R.id.action_menuFragment_to_categoryFragment)
            }
        }

        dialog.show()
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation
        dialog.window!!.setGravity(Gravity.BOTTOM)

    }

}