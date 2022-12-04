package eniso.gte2.tuber

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.internal.ContextUtils.getActivity
import eniso.gte2.tuber.databinding.ActivityTermsAndConditionsBinding

class Terms_and_conditions : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTermsAndConditionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button5.setOnClickListener {
            if (binding.checkBox.isChecked()) {
                val int = Intent(this,homee::class.java)
                startActivity(int)


            }
            else{
                Toast.makeText(this,  "You need to accept these terms for your registration", Toast.LENGTH_LONG).show()
            }
            }
        }
    }
