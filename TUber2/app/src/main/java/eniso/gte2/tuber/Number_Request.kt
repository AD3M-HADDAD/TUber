package eniso.gte2.tuber

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.gte2.tuber.databinding.ActivityMainBinding
import eniso.gte2.tuber.databinding.ActivityNumberRequestBinding

class Number_Request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNumberRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
            binding.button4.setBackgroundColor(Color.LTGRAY)
            binding.button3.setBackgroundColor(Color.TRANSPARENT)
            binding.button2.setBackgroundColor(Color.TRANSPARENT)
            if (binding.editTextPhone.text.isEmpty())
            {
                Toast.makeText(this,  "You need to enter your mobile number", Toast.LENGTH_LONG).show()
            }
            else if (binding.editTextPhone.text.length !=8)
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("."))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains(","))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("+"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("*"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("/"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("("))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains(")"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("#"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("-"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains(" "))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else {
                val int = Intent(this,Email_Request::class.java)
                startActivity(int)
            }
        }
        binding.button3.setOnClickListener {
            binding.button3.setBackgroundColor(Color.LTGRAY)
            binding.button4.setBackgroundColor(Color.TRANSPARENT)
            binding.button2.setBackgroundColor(Color.TRANSPARENT)
            val int = Intent(this,Email_Request::class.java)
            startActivity(int)
        }
        binding.button2.setOnClickListener {
            binding.button2.setBackgroundColor(Color.LTGRAY)
            binding.button4.setBackgroundColor(Color.TRANSPARENT)
            binding.button3.setBackgroundColor(Color.TRANSPARENT)
            val int = Intent(this,Email_Request::class.java)
            startActivity(int)
        }
    }
}