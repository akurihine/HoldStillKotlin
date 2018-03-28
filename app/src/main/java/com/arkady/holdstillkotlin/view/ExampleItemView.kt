package com.arkady.holdstillkotlin.view

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.arkady.holdstillkotlin.R
import com.arkady.holdstillkotlin.data.ExampleModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.view_example_item.view.*

class ExampleItemView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0) : FrameLayout(context, attrs, defStyle, defStyleRes) {

    init {
        inflate(getContext(), R.layout.view_example_item, this)
    }

    fun setData(example : ExampleModel) {
        mainText.text = example.mainText
        topText.text = example.topText
        infoText.text = example.infoText
        shopInfo.text = example.shopInfo
        Glide.with(context).load(example.imageUrl).into(image)
    }
}