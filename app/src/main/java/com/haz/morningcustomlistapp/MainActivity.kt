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
        var user1 = User(R.mipmap.mypictwo,"Miriam Mwenje","0743566300")
        var user2 = User(R.mipmap.img,"Miriam Mwenje","0743566300")
        var user3 = User(R.mipmap.mypic,"Miriam Mwenje","0743566300")
        var user4 = User(R.mipmap.mypictwo,"Miriam Mwenje","0743566300")
        var user5 = User(R.mipmap.img,"Miriam Mwenje","0743566300")
        var user6 = User(R.mipmap.imageone,"Miriam Mwenje","0743566300")
        var user7 = User(R.mipmap.mypictwo,"Miriam Mwenje","0743566300")
        var user8 = User(R.mipmap.mypic,"Miriam Mwenje","0743566300")
        var user9 = User(R.mipmap.img,"Miriam Mwenje","0743566300")
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