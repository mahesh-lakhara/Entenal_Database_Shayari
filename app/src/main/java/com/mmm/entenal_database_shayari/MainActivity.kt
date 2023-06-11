package com.mmm.entenal_database_shayari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.entenal_database_shayari.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var shayarilist = ArrayList<ShayriModel>()
    lateinit var dbHelper: ExtenalDatabase
    lateinit var adapter: ShayariAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        adapter = ShayariAdapter()

        dbHelper = ExtenalDatabase(this)
        shayarilist= dbHelper.shayari as ArrayList<ShayriModel>



        adapter.setshayari(shayarilist)

        binding.rcvListShayari.layoutManager = LinearLayoutManager(this)
        binding.rcvListShayari.adapter = adapter




    }
}