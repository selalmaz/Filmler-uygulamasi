package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.filmlerapp.R
import com.example.filmlerapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  FragmentDetayBinding.inflate(inflater, container, false)

        // gonderilen veriyi alma
        val bundle : DetayFragmentArgs by navArgs()
        val film = bundle.film

        binding.toolbarDetay.title=film.ad
        binding.ivDetay.setImageResource(
            resources.getIdentifier(film.resim,"drawable",requireContext().packageName))
        binding.tvDetay.text = "${film.fiyat} ₺"




        return binding.root
    }

}