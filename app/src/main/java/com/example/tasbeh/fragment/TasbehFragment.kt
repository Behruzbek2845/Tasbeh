package com.example.tasbeh.fragment

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tasbeh.R
import com.example.tasbeh.databinding.FragmentTasbehBinding
import com.example.tasbeh.models.Sana
import com.example.tasbeh.sharedPraferance.MySharedPraferance

class TasbehFragment : Fragment() {
    private lateinit var binding: FragmentTasbehBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTasbehBinding.inflate(layoutInflater)
        var count = 0

        binding.um.setOnClickListener {
            count++
            binding.sanoq.text = count.toString()
            binding.tozalaTas.setOnClickListener {
                count=0
                binding.sanoq.text = "0"
            }
        }


        return binding.root
     }

    private fun loadData() {

    }


}