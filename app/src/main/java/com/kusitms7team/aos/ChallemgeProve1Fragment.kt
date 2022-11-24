package com.kusitms7team.aos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.kusitms7team.aos.databinding.FragmentChallemgeProve1Binding
import java.util.*

class ChallemgeProve1Fragment : Fragment() {

    lateinit var binding: FragmentChallemgeProve1Binding
    lateinit var challengeName1 : ConstraintLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            com.kusitms7team.aos.R.layout.fragment_challemge_prove1,
            container,
            false
        )
        return binding.root

    }
}