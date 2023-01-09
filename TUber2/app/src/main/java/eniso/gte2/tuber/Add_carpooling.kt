package eniso.gte2.tuber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Add_carpooling : AppCompatActivity() {
    private lateinit var etposition: EditText
    private lateinit var etdestination: EditText
    private lateinit var ettime: EditText
    private lateinit var etnumplaces: EditText
    private lateinit var etphone: EditText
    private lateinit var etcarreg: EditText
    private lateinit var etfcb: EditText
    private lateinit var button7: Button


    private lateinit var dbref: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_carpooling)

        etposition =findViewById(R.id.etposition)
        etdestination =findViewById(R.id.etdestination)
        ettime =findViewById(R.id.ettime)
        etnumplaces =findViewById(R.id.etnumplaces)
        etcarreg =findViewById(R.id.etcarreg)
        etphone =findViewById(R.id.etphone)
        etfcb =findViewById(R.id.etfcb)
        button7 =findViewById(R.id.button7)

        dbref=FirebaseDatabase.getInstance().getReference("carpooling")

        button7.setOnClickListener {
            saveCarpoolingData()
        }


}
    private fun saveCarpoolingData(){
        //getting values
        val positon = etposition.text.toString()
        val destination= etdestination.text.toString()
        val time= ettime.text.toString()
        val phone_num= etphone.text.toString()
        val places= etnumplaces.text.toString()
        val registration= etcarreg.text.toString()
        val fcb= etfcb.text.toString()

        if(positon.isEmpty()){
            etposition.error ="please enter a position"
        }
        if(destination.isEmpty()){
            etdestination.error ="please enter a destination"
        }
        if(time.isEmpty()){
            ettime.error ="please enter a time"
        }
        if(phone_num.isEmpty()){
            etphone.error ="please enter your phone number"
        }
        if(registration.isEmpty()){
            etcarreg.error ="please enter your car registration "
        }
        if(places.isEmpty()){
            etnumplaces.error ="please enter how many places are available"
        }

        val carpoolingId = dbref.push().key!!

        val carpooling = carpoolingModel(carpoolingId,positon,destination,time,places,phone_num,registration,fcb)

        dbref.child(carpoolingId).setValue(carpooling)
            .addOnCompleteListener {

            }
            .addOnFailureListener {
                err->
                Toast.makeText(this,"Error ${err.message}",Toast.LENGTH_LONG).show()
            }
    }
}
