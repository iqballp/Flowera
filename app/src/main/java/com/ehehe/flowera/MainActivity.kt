package com.ehehe.flowera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFlower: RecyclerView
    private var list: ArrayList<Flower> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFlower = findViewById(R.id.rv_flower)
        rvFlower.setHasFixedSize(true)

        list.addAll(FlowerData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvFlower.layoutManager = LinearLayoutManager(this)
        val listFlowerAdapter = ListFlowerAdapter(list)
        rvFlower.adapter = listFlowerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.action_profile -> {
                val pindah = Intent(this@MainActivity, Profile::class.java)
                startActivity(pindah)
            }
        }
    }
}
