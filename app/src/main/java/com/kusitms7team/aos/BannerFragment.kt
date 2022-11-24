package com.kusitms7team.aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kusitms7team.aos.databinding.FragmentBannerBinding

class BannerFragment(var imaRes : Int) : Fragment() {
    lateinit var binding : FragmentBannerBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBannerBinding.inflate(inflater, container, false)
        binding.bannerImageIv.setImageResource(imaRes)
        return binding.root
    }

}