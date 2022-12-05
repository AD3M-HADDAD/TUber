package eniso.gte2.tuber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tuber.databinding.ActivityHomeBinding
import eniso.gte2.tuber.databinding.ActivityMainBinding

class homee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button6.setOnClickListener {
            val i = Intent(this,Add_carpooling::class.java)
            startActivity(i)
        }
        binding.imageButton2.setOnClickListener {
            val i = Intent(this,profile::class.java)
            startActivity(i)
        }
    }
}