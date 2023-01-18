package com.opensurvey.logintext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.opensurvey.logintext.adeptors.BlackAdapter
import com.opensurvey.logintext.hongsdatas.Black
import kotlinx.android.synthetic.main.activity_my_list.*
import kotlinx.android.synthetic.main.activity_my_list.view.*

class MyList : AppCompatActivity() {

    val mBlackList = ArrayList<Black>()

    lateinit var mAdapter : BlackAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list)

        mBlackList.add( Black("김태홍",1990) )
        mBlackList.add( Black("김태홍1",1991) )
        mBlackList.add( Black("김태홍2",1992) )
        mBlackList.add( Black("김태홍3",1993) )
        mBlackList.add( Black("김태홍4",1994) )
        mBlackList.add( Black("김태홍5",1995) )
        mBlackList.add( Black("김태홍6",1996) )


        mAdapter = BlackAdapter(this,R.layout.black_list_item,mBlackList)

        blackList.adapter = mAdapter


        blackList.setOnItemClickListener { parent, view, position, id ->

            val clickedBlack = mBlackList[position]
            Toast.makeText(this, "${clickedBlack.name}입니다.", Toast.LENGTH_SHORT).show()
        }

        blackList.setOnItemLongClickListener { parent, view, position, id ->

            mBlackList.removeAt(position)
            mAdapter.notifyDataSetChanged()

            return@setOnItemLongClickListener true

        }



    }
}


