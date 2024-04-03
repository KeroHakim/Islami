package com.route.islami.project.home.radio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami.databinding.RadioFragmanetBinding

class RadioFragment : Fragment() {
    lateinit var viewBinding: RadioFragmanetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = RadioFragmanetBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}