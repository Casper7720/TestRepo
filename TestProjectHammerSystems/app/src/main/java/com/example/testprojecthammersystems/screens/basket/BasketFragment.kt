package com.example.testprojecthammersystems.screens.basket

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testprojecthammersystems.R
import com.example.testprojecthammersystems.databinding.FragmentBasketBinding


class BasketFragment : Fragment() {

    private lateinit var binding: FragmentBasketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBasketBinding.inflate(layoutInflater)
        return binding.root
    }
}