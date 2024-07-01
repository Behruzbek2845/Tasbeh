package com.example.tasbeh.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tasbeh.R
import com.example.tasbeh.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)


        binding.txt.text = "Hozirda mo‘min-musulmonlar ichida mazhabga qarshi bo‘lishga va ba’zi bir amallarni bid’at-xurofotga chiqarishga ishqiboz bo‘lgan kishilar «tasbih o‘girish bid’atdir, bu ishni Nabiyimiz Muhammad sollallohu alayhi vasallam qilmaganlar, sahobalar ham qilmaganlar», degan ma’nodagi gaplarni tarqatib, mo‘min-musulmonlarning xayollarini parishon qilib, ixtiloflar, tushunmovchiliklar kelib chiqishiga sabab bo‘layotirlar. Lekin mujtahid ulamolarimiz tasbihni tutish joizligi va undan foydalanish mumkinligini aynan Nabiyimiz Muhammad sollallohu alayhi vasallamdan qilingan rivoyatdan olganlar.\n" +
                "\n" +
                "«Sunan» nomli dong taratgan kitoblarning sohiblari imom Abu Dovud, imom Termiziy, imom Ibni Moja va imom Nasa’iy quyidagi rivoyatni keltiradilar:\n" +
                "\n" +
                "«Rasululloh sollallohu alayhi vasallam bir ayolning oldiga kirdilar. Uning oldida danak-lar yoki mayda toshlar bo‘lib, o‘shalar ila tasbih aytayotgan edi. Bas, u zot: «Men senga undan oson yoki afzal narsaning xabarining beraman: Subhanallohi adada ma holaqa fissama’i, Subhanallohi adada ma xolaqa fil-arzi, Subhanallohi adada ma xolaqa bayna zalik, Subhanallohi adada ma xolaqa ma huva xoliqun, Allohu Akbar mislu zalika, valhamdulillahi mislu zalika, va Laa ilaaha illallohu mislu zalik, va laa havla va laa quvvata illa billaahi mislu zalik»,dedilar."

        return binding.root
    }


}