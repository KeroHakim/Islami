package com.route.islami.project.home.sebha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami.databinding.SebhaFragmanetBinding

class SebhaFragment : Fragment() {
    lateinit var viewBinding: SebhaFragmanetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = SebhaFragmanetBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}