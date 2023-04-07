package io.gideon.myhandbook1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import io.gideon.myhandbook1.databinding.FragmentMyViewPagerBinding
import io.gideon.myhandbook1.onboardingscreen.OnBoardingScreen1
import io.gideon.myhandbook1.onboardingscreen.OnBoardingScreen2
import io.gideon.myhandbook1.onboardingscreen.OnBoardingScreen3
import io.gideon.myhandbook1.onboardingscreen.ViewPagerAdapter


class MyViewPager : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment

    val view = inflater.inflate(R.layout.fragment_my_view_pager, container, false)

        val fragmentlist = arrayListOf<Fragment>(
            OnBoardingScreen1(),
            OnBoardingScreen2(),
            OnBoardingScreen3()
        )

        val adapter= ViewPagerAdapter(
            fragmentlist,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        val you = view.findViewById<ViewPager2>(R.id.viewPagerBut)
        val getStarted = view.findViewById<Button>(R.id.button)

        you.adapter = adapter
        val indicator = view.findViewById<DotsIndicator>(R.id.dots_Indicator)
        indicator.attachTo(you)

        getStarted.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.action_myViewPager_to_homeFragment
                Toast.makeText(context, "I show", Toast.LENGTH_SHORT).show()
        }


        return view




    }


}