package com.example.a3dop.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a3dop.utils.PreferenceHelper
import com.example.a3dop.databinding.FragmentGetRegistorBinding


class GetRegistorFragment : Fragment() {

    private lateinit var binding: FragmentGetRegistorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGetRegistorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() = with(binding) {
        PreferenceHelper.unit(requireContext())
        tvName2.text = PreferenceHelper.safeText?.trim()
        tvPsw2.text = PreferenceHelper.safeText2?.trim()
    }
}