package com.example.shpeapp.ui.members

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shpeapp.R
import com.example.shpeapp.databinding.FragmentMembersBinding

class MembersFragment : Fragment() {

    private var _binding: FragmentMembersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMembersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Sample list of members using the placeholder image
        val members = listOf(
            Member("John Doe", "Computer Science", "2025", R.drawable.ic_baseline_person_24),
            Member("Jane Smith", "Mechanical Engineering", "2024", R.drawable.ic_baseline_person_24),
            Member("Michael Brown", "Electrical Engineering", "2023", R.drawable.ic_baseline_person_24),
            Member("Emily Davis", "Chemical Engineering", "2024", R.drawable.ic_baseline_person_24),
            Member("Daniel Wilson", "Civil Engineering", "2025", R.drawable.ic_baseline_person_24),
            Member("Sarah Johnson", "Biomedical Engineering", "2023", R.drawable.ic_baseline_person_24),
            Member("David Martinez", "Computer Science", "2024", R.drawable.ic_baseline_person_24),
            Member("Laura Garcia", "Mechanical Engineering", "2025", R.drawable.ic_baseline_person_24),
            Member("James Anderson", "Electrical Engineering", "2023", R.drawable.ic_baseline_person_24),
            Member("Jessica Thomas", "Chemical Engineering", "2024", R.drawable.ic_baseline_person_24)
        )

        val adapter = MembersAdapter(members)
        binding.recyclerViewMembers.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewMembers.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
