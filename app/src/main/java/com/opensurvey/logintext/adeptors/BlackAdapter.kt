package com.opensurvey.logintext.adeptors

import android.content.Context
import android.provider.DocumentsContract.Root
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.opensurvey.logintext.R
import com.opensurvey.logintext.hongsdatas.Black

class BlackAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Black>) : ArrayAdapter<Black>(mContext, resId, mList) {


    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temprow = convertView
        if (temprow == null) {

            temprow = inf.inflate(R.layout.black_list_item, null) }
        val row = temprow!!

        return row

    }

}