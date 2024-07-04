package com.example.shpeapp.ui.sponsors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shpeapp.databinding.FragmentSponsorsBinding


class SponsorsFragment : Fragment() {

    private var _binding: FragmentSponsorsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSponsorsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // You can now set the text and other UI elements directly
        // No need for ViewModel if the content is static


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

