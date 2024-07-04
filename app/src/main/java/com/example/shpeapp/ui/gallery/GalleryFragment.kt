package com.example.shpeapp.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shpeapp.R
import com.example.shpeapp.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Sample list of gallery items
        val galleryItems = listOf(
            GalleryItem("Event 1", R.drawable.ic_baseline_person_24),
            GalleryItem("Event 2", R.drawable.ic_baseline_person_24),
            GalleryItem("Member 1", R.drawable.ic_baseline_person_24),
            GalleryItem("Member 2", R.drawable.ic_baseline_person_24),
            // Add more items as needed
        )

        val adapter = GalleryAdapter(galleryItems)
        binding.recyclerViewGallery.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerViewGallery.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
