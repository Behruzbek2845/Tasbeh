package com.example.tasbeh.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tasbeh.R
import com.example.tasbeh.databinding.FragmentDuoBinding


class DuoFragment : Fragment() {
    private lateinit var binding: FragmentDuoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDuoBinding.inflate(layoutInflater)
        var count = 0

        binding.duo.setOnClickListener {
            count++
            if (count==0){
                binding.txtKalima.text = "Субҳаналлоҳ!"
            }
            if (count==33){
                binding.txtKalima.text = "Алҳамду лиллааҳ!"
            }
            if (count==66){
                binding.txtKalima.text = "Аллоҳу акбар!"
            }
            if (count==99){
                binding.txtKalima.text = "La ilaha illallohu vahdahu la shariyka lah, lahul-mulku va lahul hamd va huva ‘ala kulli shay’in qodiyr."
            }
            if (count==100){
                binding.txtKalima.text = "Omin.\uD83E\uDD32"
            }
            if (count==101){
                binding.txtKalima.text = "Субҳаналлоҳ!"
                binding.btnCount.text = "0"
                count = 0
            }
            binding.btnCount.text = count.toString()
            binding.btnClean.setOnClickListener {
                binding.btnCount.text = "0"
                count = 0
            }
        }



        return binding.root
     }

    private fun loadData() {

    }


}