package eniso.gte2.tuber

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tuber.databinding.ActivityLoginBinding
import eniso.gte2.tuber.databinding.ActivityMainBinding

class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    binding.button9.setOnClickListener {
        val i = Intent(this,homee::class.java)
        startActivity(i)
        //launchSignInFlow()
    }
        binding.button8.setOnClickListener {
            val i = Intent(this,Number_Request::class.java)
            startActivity(i)
        }
    }
}