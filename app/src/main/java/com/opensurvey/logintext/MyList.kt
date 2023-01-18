package com.opensurvey.logintext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.opensurvey.logintext.hongsdatas.Black

class MyList : AppCompatActivity() {

    val mBlackList = ArrayList<Black>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list)

        mBlackList.add( Black("김태홍","1990") )
        mBlackList.add( Black("김태홍1","1991") )
        mBlackList.add( Black("김태홍2","1992") )
        mBlackList.add( Black("김태홍3","1993") )
        mBlackList.add( Black("김태홍4","1994") )
        mBlackList.add( Black("김태홍5","1995") )
        mBlackList.add( Black("김태홍6","1996") )

    }
}