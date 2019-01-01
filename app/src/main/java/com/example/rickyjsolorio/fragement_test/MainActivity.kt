package com.example.rickyjsolorio.fragement_test

import android.os.Bundle
import android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE
import android.support.v7.app.AppCompatActivity
import android.view.View
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


            fragtrans.add(R.id.fragment_container, fragObject).addToBackStack(null).commit()
                //only use add on the first time fragment not the second frag.

        }

    }     //end of override fun onCreate



    //*********************************************************************************************************************************************************

    override  fun secondFrag(view: View) {


        this.snake.setOnClickListener {

            goToSpiderListFrag()   // this function description is below on this page
        }

        this.spider.setOnClickListener {

                   // need to make functions using the custom views making the list view re-usable


        }



        this.fish.setOnClickListener {

                   // need to make functions using the custom views making the list view re-usable



        }



    }// end of second frag

    //*********************************************************************************************************************************************************


    override fun animalListPage(view: View) {


         }//end of animal listpage

    //*********************************************************************************************************************************************************


    public fun goToSpiderListFrag(){             //function to make the code cleaner in the override functions; it makes a fragment transaction to
                                                 // move to the next fragment when a view is clicked
                                                 //this functoin is used above in the first onlcick listener


        val frag2 = BlankFragment3()
        val fragmanger = supportFragmentManager     //fragmanger value gets the support library for fragtrans value
        val fragtrans = fragmanger.beginTransaction().replace(R.id.fragment_container,frag2).addToBackStack(null).setTransition(TRANSIT_FRAGMENT_FADE)
        fragtrans.commit()
    }

    //*********************************************************************************************************************************************************

}      // end of main activity                                                                                                                                                curley bracket


