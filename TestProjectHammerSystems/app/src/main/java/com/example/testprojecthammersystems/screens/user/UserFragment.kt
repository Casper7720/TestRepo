package com.example.testprojecthammersystems.screens.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testprojecthammersystems.R
import com.example.testprojecthammersystems.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentUserBinding.inflate(layoutInflater)
        return binding.root
    }
}