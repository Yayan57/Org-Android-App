package com.example.shpeapp.ui.join

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shpeapp.databinding.FragmentJoinBinding
import android.content.Intent
import android.net.Uri

class JoinFragment : Fragment() {

    private var _binding: FragmentJoinBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val joinViewModel =
            ViewModelProvider(this).get(JoinViewModel::class.java)

        _binding = FragmentJoinBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonRegister.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yourregistrationform.com"))
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
