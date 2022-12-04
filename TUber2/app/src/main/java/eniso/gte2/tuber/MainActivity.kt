package eniso.gte2.tuber

import android.R
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import eniso.gte2.tuber.databinding.ActivityMainBinding
import java.lang.Boolean


class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       // setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val i = Intent(this,Number_Request::class.java)
            startActivity(i)
        }
    }




}