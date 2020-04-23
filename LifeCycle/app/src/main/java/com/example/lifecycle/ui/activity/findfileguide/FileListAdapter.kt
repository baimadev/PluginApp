package com.example.lifecycle.ui.activity.findfileguide

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.lifecycle.R
import kotlinx.android.synthetic.main.item_rv.view.*
import java.io.File

class FileListAdapter(files: MutableList<File>) :
    BaseQuickAdapter<File, BaseViewHolder>(R.layout.item_file, files) {
    override fun convert(helper: BaseViewHolder, item: File) {
        helper.setText(R.id.text,item.name)

    }


}