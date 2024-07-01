package com.example.tasbeh
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.tasbeh.databinding.ActivityMainBinding
import com.example.tasbeh.fragment.FragmentKalimalar
import com.example.tasbeh.fragment.TasbehFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = Navigation.findNavController(this, R.id.my_navigation_host)
        binding.btnMenu.setupWithNavController(navController)




    }

}



