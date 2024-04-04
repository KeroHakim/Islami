package com.route.islami.project.home.sebha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import androidx.fragment.app.Fragment
import com.route.islami.databinding.SebhaFragmanetBinding

class SebhaFragment : Fragment() {
    lateinit var viewBinding: SebhaFragmanetBinding
    private var counter = 0
    private val rotationDegrees = 30
    private var currentRotation = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = SebhaFragmanetBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.btnCounter.setOnClickListener {
            tasbehCounter()
            rotateBodyOfSebha()
        }
    }

    private fun rotateBodyOfSebha() {
        currentRotation += rotationDegrees
        if (currentRotation >= 360) {
            currentRotation -= 360
        }
        viewBinding.bodyOfSebha.rotation = currentRotation.toFloat()
        }

    private fun tasbehCounter() {
        counter++
        viewBinding.tasbehCounter.text = counter.toString()
    }
}