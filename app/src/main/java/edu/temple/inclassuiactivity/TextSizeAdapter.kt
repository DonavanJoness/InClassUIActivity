package edu.temple.inclassuiactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val number: Array<Int>) : BaseAdapter() {

    override fun getCount() =  number.size


    override fun getItem(position: Int) = number[position]


    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?):
            View { val textView: TextView
            if (convertView == null) {
            textView = TextView(context)
        } else {
            textView = convertView as TextView
        }

        textView.text = number[position].toString()
        textView.textSize = number[position].toFloat()
        textView.setPadding(20, 20, 20, 20)

        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val textView = (getView(position, convertView, parent) as TextView)
        textView.textSize = number[position].toFloat()
        return textView
    }
}