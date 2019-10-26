package vickyrahma.rpl.superhero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var menuData = listOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuData = Menu.menus

        val menuAdapter = MenuAdapter(menuData)

        menuItem.hasFixedSize()
        menuItem.layoutManager = LinearLayoutManager(this)
        menuItem.adapter = menuAdapter
    }
}