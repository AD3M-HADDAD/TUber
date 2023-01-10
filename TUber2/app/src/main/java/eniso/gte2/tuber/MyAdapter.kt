package eniso.gte2.tuber

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val carpoolingList: ArrayList<carpoolingModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.carpooling_item,
        parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = carpoolingList[position]

        holder.position.text= currentItem.position
        holder.destination.text= currentItem.destination
        holder.time.text= currentItem.time
        holder.registration.text= currentItem.registration
        holder.phone.text= currentItem.phone
        holder.places.text= currentItem.places


    }

    override fun getItemCount(): Int {
return carpoolingList.size    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val position : TextView = itemView.findViewById(R.id.tvposition)
        val destination : TextView = itemView.findViewById(R.id.tvdestination)
        val time : TextView = itemView.findViewById(R.id.tvtime)
        val places : TextView = itemView.findViewById(R.id.tvplaces)
        val registration : TextView = itemView.findViewById(R.id.tvregistration)
        val phone : TextView = itemView.findViewById(R.id.tvphone)
    }
}