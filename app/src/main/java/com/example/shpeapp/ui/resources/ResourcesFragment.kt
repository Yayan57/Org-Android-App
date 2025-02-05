package com.example.shpeapp.ui.resources

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shpeapp.databinding.FragmentResourcesBinding

class ResourcesFragment : Fragment() {

    private var _binding: FragmentResourcesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val resourcesViewModel =
            ViewModelProvider(this).get(ResourcesViewModel::class.java)

        _binding = FragmentResourcesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textResources
        resourcesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
