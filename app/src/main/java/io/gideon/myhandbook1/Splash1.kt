package io.gideon.myhandbook1

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class Splash1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_myViewPager_to_homeFragment)

            }else{
                findNavController().navigate(R.id.action_splash1_to_myViewPager)

            }
        }, 3000)





        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash1, container, false)
    }

    private fun onBoardingFinished():Boolean{
        val share = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return share.getBoolean("Finished", false)

    }


}