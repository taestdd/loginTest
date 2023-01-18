package com.opensurvey.logintext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.opensurvey.logintext.adeptors.BlackAdapter
import com.opensurvey.logintext.hongsdatas.Black
import kotlinx.android.synthetic.main.activity_my_list.*

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

    }
}