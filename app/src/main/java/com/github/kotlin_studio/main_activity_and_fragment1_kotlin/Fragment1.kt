package com.github.kotlin_studio.main_activity_and_fragment1_kotlin


import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragment1.view.*
import org.jetbrains.anko.toast


/**
 * A Fragment1 subclass (without Postman)
 */
class Fragment1 : Fragment() {

    var counter = 0
    internal var activity: Activity? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        super.onAttach(context)
        if (context is Activity) activity = context as Activity

        val rootView = inflater.inflate(R.layout.fragment_fragment1, container, false)
        val button1 = rootView.button1
        button1.setOnClickListener {
            counter++
            getActivity()?.toast("Количество нажатий кнопки: $counter")

            try {
                (activity as Postman).fragmentMail(counter)
            } catch (ignored: ClassCastException) { }
        }
        return rootView
  }

}










