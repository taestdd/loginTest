package com.opensurvey.logintext.adeptors

import android.content.Context
import android.widget.ArrayAdapter
import com.opensurvey.logintext.hongsdatas.Black

class BlackAdapter(val mContext : Context,
                   val resId : Int,
                   val mList : ArrayList<Black>) : ArrayAdapter<Black>(mContext, resId, mList) {
}