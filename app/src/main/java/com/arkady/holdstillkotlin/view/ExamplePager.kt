package com.arkady.holdstillkotlin.view

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.arkady.holdstillkotlin.R
import com.arkady.holdstillkotlin.data.ExampleModel
import kotlinx.android.synthetic.main.view_example_pager.view.*

class ExamplePager @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0) : FrameLayout(context, attrs, defStyle, defStyleRes) {

    private lateinit var exampleModelList: List<ExampleModel>

    init {
        inflate(getContext(), R.layout.view_example_pager, this)

        val holdStillTransformer = HoldStillTransformer()
        holdStillTransformer.viewIds = setOf(R.id.topTitleSection, R.id.underBar, R.id.image)
        pager.setPageTransformer(false, holdStillTransformer)
    }

    fun setData(exampleList : List<ExampleModel>) {
        exampleModelList = exampleList
        pager.adapter = ExamplePagerAdapter()
    }


    inner class ExamplePagerAdapter : PagerAdapter() {
        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val examplePageView = ExampleItemView(context)
            examplePageView.setData(exampleModelList[position])
            container.addView(examplePageView)
            return examplePageView
        }

        override fun isViewFromObject(view: View, obj: Any): Boolean {
            return view == obj
        }

        override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
            container.removeView(obj as View?)
        }

        override fun getCount(): Int {
            return exampleModelList.size
        }
    }
}
