package eniso.gte2.tuber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tuber.databinding.ActivityMainBinding

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