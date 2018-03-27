package com.arkady.holdstillkotlin.view

import android.support.v4.view.ViewPager
import android.view.View


class HoldStillTransformer : ViewPager.PageTransformer {
    var viewIds: Set<Int> = HashSet()

    override fun transformPage(view: View, position: Float) {
        val pageWidth = view.width

        when {
            position < -1 -> // [-Infinity,-1)
                view.alpha = 0F
            position <= 1 -> { // [-1,1]
                for (id in viewIds) {
                    val v : View? = view.findViewById(id)
                    v!!.translationX = -position * pageWidth
                }

                view.alpha = 1F

            } else -> view.alpha = 0F // (1,+Infinity]
        }
    }
}