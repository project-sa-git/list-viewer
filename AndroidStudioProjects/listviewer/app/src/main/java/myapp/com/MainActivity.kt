package myapp.com

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val texts = arrayOf(
        // データのリスト表示

            "login: ianhanniballake",
            "id: 517315"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = ListView(this)
        setContentView(listView)

        val arrayAdapter = ArrayAdapter(this, R.layout.detail_list, texts)

        listView.setAdapter(arrayAdapter)
    }
}