package com.route.islami.project.home.quran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami.databinding.QuranFragmanetBinding
import com.route.islami.project.adapters.SuraAdapter

class QuranFragment : Fragment() {
    lateinit var viewBinding: QuranFragmanetBinding
    lateinit var adapter:SuraAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = QuranFragmanetBinding.inflate(inflater,container,false)
        return viewBinding.root
    }
}