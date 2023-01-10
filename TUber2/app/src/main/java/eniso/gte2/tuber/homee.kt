package eniso.gte2.tuber

//import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import eniso.gte2.tuber.databinding.ActivityHomeBinding

class homee : AppCompatActivity() {

    private lateinit var carRecyclerView: RecyclerView
    private lateinit var tvposition : TextView
    private lateinit var tvdestination : TextView
    private lateinit var tvtime : TextView
    private lateinit var tvplaces : TextView
    private lateinit var tvregistration : TextView
    private lateinit var tvphone : TextView
    private lateinit var CarList :ArrayList<carpoolingModel>
    private lateinit var dbref: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.carpooling_item)
        setContentView(R.layout.activity_home)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        carRecyclerView =findViewById(R.id.rvCarpooling)
        carRecyclerView.layoutManager=LinearLayoutManager(this)
        carRecyclerView.setHasFixedSize(true)
//        tvposition =findViewById(R.id.tvposition)
//        tvdestination =findViewById(R.id.tvdestination)
//        tvtime =findViewById(R.id.tvtime)
//        tvphone =findViewById(R.id.tvphone)
//        tvplaces =findViewById(R.id.tvplaces)
//        tvregistration =findViewById(R.id.tvregistration)

        CarList = arrayListOf<carpoolingModel>()

        getCarpoolingData()




        binding.button6.setOnClickListener {
            val i = Intent(this,Add_carpooling::class.java)
            startActivity(i)
        }
        binding.imageButton2.setOnClickListener {
            val i = Intent(this,Profile2::class.java)
            startActivity(i)
        }
    }

    private fun getCarpoolingData(){

        carRecyclerView.visibility=View.GONE

        val dbref =FirebaseDatabase.getInstance().getReference("carpooling")

        dbref.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                CarList.clear()
                if (snapshot.exists()){
                    for (carSnap in snapshot.children){
                        val carData =carSnap.getValue(carpoolingModel::class.java)
                        CarList.add(carData!!)
                    }
                    val mAdapter = MyAdapter(CarList)
                    carRecyclerView.adapter=mAdapter

                    carRecyclerView.visibility=View.VISIBLE

                }
                    }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })


    }
}


//        private lateinit var dbref : DatabaseReference
//    private lateinit var carpoolingRecyclerView: RecyclerView
//    private lateinit var carpoolingArrayList : ArrayList<carpooling>
//
//
//
////    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//
//
//
////        carpoolingRecyclerView = findViewById(androidx.constraintlayout.widget.R.id.home)
//
//        carpoolingRecyclerView.layoutManager = LinearLayoutManager(this)
//        carpoolingRecyclerView.setHasFixedSize(true)
//
//        carpoolingArrayList= arrayListOf<carpooling>()
//        getCarpoolingData()
//
//
//
//
//        val binding = ActivityHomeBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.button6.setOnClickListener {
//            val i = Intent(this,Add_carpooling::class.java)
//            startActivity(i)
//        }
//        binding.imageButton2.setOnClickListener {
//            val i = Intent(this,Profile2::class.java)
//            startActivity(i)
//        }
//
//
//    }
//
//    private fun getCarpoolingData(){
//
//        dbref = FirebaseDatabase.getInstance().getReference("carpooling")
//
//        dbref.addValueEventListener(object : ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//
//                if (snapshot.exists()){
//
//                    for (carpoolingSnapchot in snapshot.children){
//                        val carpooling = carpoolingSnapchot.getValue((carpooling:: class.java))
//                        carpoolingArrayList.add(carpooling!!)
//
//                    }
//
//                    carpoolingRecyclerView.adapter=MyAdapter(carpoolingArrayList)
//
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                TODO("Not yet implemented")
//            }
//
//
//        })
//    }
//}