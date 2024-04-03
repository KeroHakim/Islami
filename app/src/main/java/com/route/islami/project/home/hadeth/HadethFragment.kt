package com.route.islami.project.home.hadeth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami.databinding.HadethFragmanetBinding

class HadethFragment : Fragment() {
    lateinit var viewBinding: HadethFragmanetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = HadethFragmanetBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}