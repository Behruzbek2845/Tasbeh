package com.example.tasbeh.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import androidx.core.view.marginBottom
import com.example.tasbeh.R
import com.example.tasbeh.adapters.MyInfoAdapter
import com.example.tasbeh.databinding.FragmentKalimalarBinding
import com.example.tasbeh.models.My_kalima
import com.google.android.material.tabs.TabLayout


class FragmentKalimalar : Fragment() {
    private lateinit var binding: FragmentKalimalarBinding
    private lateinit var list:ArrayList<My_kalima>
    lateinit var myInfoAdapter: MyInfoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKalimalarBinding.inflate(layoutInflater)

        loadKalima()
        myInfoAdapter = MyInfoAdapter(list)
        binding.myPager.adapter = myInfoAdapter

        binding.myTabLayout.setupWithViewPager(binding.myPager)


        val tabCount = binding.myTabLayout.tabCount
        for(i in 0 until tabCount){
            val tabView = LayoutInflater.from(binding.root.context).inflate(R.layout.item_tab_layout, null, false)
            val tab = binding.myTabLayout.getTabAt(i)
            tab?.customView = tabView

            tabView.findViewById<TextView>(R.id.txt_1).text = list[i].position


        }


            return binding.root
    }

    private fun loadKalima() {
        list = ArrayList()
        list.add(My_kalima("Калимаи тоййиба (энг пок калима)\n" +
                "\n" +
                "«Лаа илааҳа иллаллоҳу Муҳаммадур Росуулуллоҳ»\n" +
                "\n" +
                "Аллоҳдан ўзга илоҳ йўқ, Муҳаммад Аллоҳнинг Расулидир.", "1"))
        list.add(My_kalima("Калимаи шаҳодат (гувоҳлик калимаси, иқрорлик калимаси)\n" +
                "\n" +
                "«Ашҳаду аллаа илааҳа иллаллоҳу ва ашҳаду анна Муҳаммадан ъабдуҳу ва Росуулуҳ».\n" +
                "\n" +
                "Аллоҳдан ўзга илоҳ йўқлигига ва Муҳаммад Аллоҳнинг бандаси ва Расули эканига гувоҳлик бераман.","2"))
        list.add(My_kalima("Калимаи тавҳид (тавҳид, яъни Аллоҳнинг бирлигига иқрорлик калимаси)\n" +
                "\n" +
                "«Ашҳаду аллаа илааҳа иллаллоҳу ваҳдаҳу лаа шарика лаҳ, лаҳул мулку ва лаҳул ҳамд, йуҳйии ва йумийт ва ҳува ҳаййул лаа йамуут, бийадиҳил хойр ва ҳува ъалаа кулли шайъин қодийр».\n" +
                "\n" +
                "Аллоҳдан ўзга илоҳ йўқлигига гувоҳлик бераман. Аллоҳнинг шериги йўқдир, барча мулк Уникидир, мақтовлар Унгадир, У тирилтиради ва ўлдиради, аммо Ўзи тирикдир, ўлмайди. Яхшилик Унинг ихтиёридадир ва У ҳамма нарсага қодирдир.", "3"))
        list.add(My_kalima("Калимаи радди куфр (куфрни рад этиш калимаси)\n" +
                "\n" +
                "«Аллоҳумма! Инни аъуузу бика мин ан ушрика бика шайъан ва ана аълам, ва астағфирука лима лаа аълам. Иннака анта ъалламул ғуйууб».\n" +
                "\n" +
                "Аллоҳим! Ўзим билиб туриб Сенга бирор нарсани шерик қилишимдан асрашингни сўрайман. Билмай туриб шерик қилиб қўйган бўлсам, кечиришингни сўрайман. Албатта Сен ғайбларни билувчисан!", "4"))
        list.add(My_kalima("Калимаи истиғфор (гуноҳ кечирилишини сўраш калимаси)\n" +
                "\n" +
                "«Астағфируллоҳ, астағфируллоҳ, астағфируллоҳа таъала мин кулли замбин азнабтаҳу ъамдан ав хотоан, сиррон ав ъаланийя, ва атуубу илайҳи миназ-замбиллазии аъламу ва миназ-замбиллазии лаа аълам, иннака анта ъалламул ғуйууб».\n" +
                "\n" +
                "Аллоҳдан гуноҳларимни кечишини сўрайман, Аллоҳдан гуноҳларимни кечишини сўрайман, Аллоҳ таолодан атайлаб ё адашиб, яширин ё ошкора қилган барча гуноҳларимни кечишини сўрайман. Ўзим билган ва билмаган гуноҳлардан Унга тавба қиламан. Албатта Сен ғайбларни билувчисан!", "5"))
        list.add(My_kalima("Калимаи тамжид (улуғлаш калимаси)\n" +
                "\n" +
                "«Субҳааналлоҳи, валҳамдулиллааҳи, ва лаа илааҳа иллаллоҳу, валлоҳу акбар.\n" +
                "\n" +
                "Лаа ҳавла ва лаа қуввата иллаа биллааҳил ъалиййил ъазийм.\n" +
                "\n" +
                "Маа шаа Аллоҳу каана ва маа лам йашаъ лам йакун».\n" +
                "\n" +
                "Аллоҳнинг айбу нуқсони йўқ ва мақтов Аллоҳгадир. Аллоҳдан ўзга илоҳ йўқдир. Аллоҳ улуғдир, мутлоқ куч-қувват қудратли ва буюк Аллоҳдан ўзгада йўқдир. Аллоҳ нимани хоҳласа – бўлади, нимани хоҳламаса – бўлмайди.", "6"))
    }

}