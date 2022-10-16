package com.example.testprojecthammersystems.base


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.MenuRes
import androidx.fragment.app.Fragment
import com.example.testprojecthammersystems.R
import kotlinx.android.synthetic.main.inc_toolbar.view.*

abstract class BaseFragment : Fragment() {

    abstract fun getRootView(): ViewGroup

    fun app() = requireContext().applicationContext

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        context?.resources?.getColor(R.color.baseWhite)
            ?.let { getRootView().setBackgroundColor(it) }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    protected fun setToolbarTitle(title: String) {
        getRootView().toolbar.title = title
    }

    fun setToolbarMenu(@MenuRes resId: Int) {
        getRootView().toolbar.inflateMenu(resId)
    }

    fun setToolbarColor(resId: Int){
        getRootView().toolbar.setBackgroundColor(resId)
    }

}