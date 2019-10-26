package vickyrahma.rpl.superhero

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val itemName = itemView.findViewById(R.id.itemName) as TextView
    private val itemDesc = itemView.findViewById(R.id.itemDesc) as TextView

    fun bindContent(menuItem: MenuItem){
        itemName.text = menuItem.name
        itemDesc.text = menuItem.name
    }
}