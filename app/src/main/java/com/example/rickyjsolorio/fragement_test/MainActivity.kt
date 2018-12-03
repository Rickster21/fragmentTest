package com.example.rickyjsolorio.fragement_test

import android.content.Intent
import android.os.Build.VERSION_CODES.O
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE
import android.transition.Fade
import android.transition.Slide
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.Toast

import com.example.rickyjsolorio.fragement_test.R.drawable.spider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank.*

class MainActivity() : AppCompatActivity(), BlankFragment2.detailsPage, BlankFragment.selcetedAnimal{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragObject =  BlankFragment() //you dont need the new in kotlin (in java you do)
      //  val obh = BlankFragment2()

        val fragmanger = supportFragmentManager     //fragmanger value gets the support library for fragtrans value
        val fragtrans =  fragmanger.beginTransaction()  //fragtrans gets the trans library from fragmanager



        if(findViewById<View>(R.id.fragment_container)!= null) {

            if (savedInstanceState != null) {

                return
            }


            fragtrans.add(R.id.fragment_container, fragObject).addToBackStack("yolo").commit()
                //only use add on the first time fragment not the second frag.

        }

    }     //end of override fun onCreate

    override  fun addFrag(view: View) {


        this.snake.setOnClickListener {

            goToSpiderListFrag()
        }

        this.spider.setOnClickListener {


        }



        this.fish.setOnClickListener {


        }



    }
    public fun goToSpiderListFrag(){          //function to make the code cleaner in the override functions; it makes a fragment transaction to
                                                // move to the next fragment when a view is clicked
        val frag2 = BlankFragment3()
        val fragmanger = supportFragmentManager     //fragmanger value gets the support library for fragtrans value
        val fragtrans = fragmanger.beginTransaction().replace(R.id.fragment_container,frag2).addToBackStack(null).setTransition(TRANSIT_FRAGMENT_FADE)
        fragtrans.commit()


    }


    override fun fragout(view: View) {

        this.spider.setOnClickListener {

            val ee = BlankFragment2()

            val fragmanger = supportFragmentManager     //fragmanger value gets the support library for fragtrans value
            val fragtrans = fragmanger.beginTransaction().replace(R.id.fragment_container,ee)
            fragtrans.commit()

        }

    }
}// last                                                                                                                                                       curley bracket


