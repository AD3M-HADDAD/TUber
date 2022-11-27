package eniso.gte2.tuber

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.gte2.tuber.databinding.ActivityEmailRequestBinding

import android.util.Log
import android.widget.EditText
import eniso.gte2.tuber.databinding.ActivityNumberRequestBinding
import java.util.regex.Pattern

class Email_Request : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var email: String
    private val emailPattern = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
    "\\@" +
    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
    "\\." +
    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEmailRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        editText = findViewById(R.id.editTextEmail)
        email = editText.text.toString().trim()
        binding.button.setOnClickListener {

            binding.button.setBackgroundColor(Color.LTGRAY)
//            if (email.matches(emailPattern.toRegex()))
//            {
                val int = Intent(this,Name_Request::class.java)
                startActivity(int)
//            }

//            else {
//                Toast.makeText(applicationContext, "Invalid email address",
//                    Toast.LENGTH_SHORT).show()
//            }
        }
    }
}