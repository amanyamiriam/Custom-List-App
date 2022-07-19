package com.haz.morningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var mList:ListView ?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList = findViewById(R.id.mListUsers)
        users= ArrayList()
        adapter = CustomAdapter(this,users!!)
        //start creating users
        var user1 = User(R.mipmap.imageone,"Miriam ","0743566300")
        var user2 = User(R.mipmap.imagetwo,"Andy","0712345678")
        var user3 = User(R.mipmap.imagethree,"Faith","0743567823")
        var user4 = User(R.mipmap.imageone,"Waweru","073566304")
        var user5 = User(R.mipmap.imagetwo,"Linet","0745466300")
        var user6 = User(R.mipmap.imagethree,"Brain","0703567300")
        var user7 = User(R.mipmap.imageone," Eugene","0766578300")
        var user8 = User(R.mipmap.imagetwo,"Timothy","0756438790")
        var user9 = User(R.mipmap.imagethree,"Shanky","0743500366")
        //Add the created users to the arraylist users
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)
        //Assign our custom to the listview
        mList!!.adapter = adapter!!


    }
}