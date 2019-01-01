package com.example.rickyjsolorio.fragement_test


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragment : Fragment() {




    interface selcetedAnimal{     // this is implemented in main as an extended function at the top

        public fun secondFrag(view: View)


  }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_blank, container, false)













    return view

    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)

        activity
    }
}
