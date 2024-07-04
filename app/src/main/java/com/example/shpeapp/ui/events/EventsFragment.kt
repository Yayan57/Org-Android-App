package com.example.shpeapp.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shpeapp.databinding.FragmentEventsBinding
import com.example.shpeapp.data.Event

class EventsFragment : Fragment() {

    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Sample list of events
        val events = listOf(
            Event("Event 1", "Detail 1", "Date 1", "Location 1", "June 3rd, 2024; 7pm", "link 1"),
            Event("Event 2", "Detail 2", "Date 2", "Location 2", "June 3rd, 2024; 7pm", "link 2")
        )

        val adapter = EventAdapter(events)
        binding.recyclerViewEvents.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewEvents.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

