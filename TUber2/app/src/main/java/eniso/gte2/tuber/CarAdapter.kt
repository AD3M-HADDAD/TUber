//package eniso.gte2.tuber
//
//import android.provider.Settings
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class CarAdapter (private val CarList: ArrayList<carpoolingModel>): RecyclerView.Adapter<CarAdapter.ViewHolder>(){
//
//
//
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.carpooling_item, parent, false)
//            return ViewHolder(itemView)
//    }
//
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val currentCarpooling = CarList[position]
//        holder.tvposition.text=currentCarpooling.position
//        holder.tvdestination.text=currentCarpooling.destination
//        holder.tvtime.text=currentCarpooling.time
//        holder.tvregistration.text=currentCarpooling.registration
//        holder.tvphone.text=currentCarpooling.phone
//        holder.tvplaces.text=currentCarpooling.places
//
//
//    }
//
//
//
//    override fun getItemCount(): Int {
//        return CarList.size
//    }
//    class ViewHolder (view: View, itemView: View): RecyclerView.ViewHolder(itemView) {
//
//        val tvposition : TextView = itemView.findViewById(R.id.tvposition)
//        val tvdestination : TextView = itemView.findViewById(R.id.tvdestination)
//        val tvtime : TextView = itemView.findViewById(R.id.tvtime)
//        val tvregistration : TextView = itemView.findViewById(R.id.tvregistration)
//        val tvplaces : TextView = itemView.findViewById(R.id.tvplaces)
//        val tvphone : TextView = itemView.findViewById(R.id.tvphone)
//    }
//
//}