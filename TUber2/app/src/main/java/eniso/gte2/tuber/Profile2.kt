package eniso.gte2.tuber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.gte2.tuber.databinding.ActivityProfile2Binding


class Profile2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfile2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageButton.setOnClickListener {
            val i = Intent(this,homee::class.java)
            startActivity(i)
        }
    }
}