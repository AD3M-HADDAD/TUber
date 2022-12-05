package eniso.gte2.tuber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tuber.databinding.ActivityHomeBinding
import eniso.gte2.tuber.databinding.ActivityProfileBinding

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageButton.setOnClickListener {
            val i = Intent(this,homee::class.java)
            startActivity(i)
        }
    }
}