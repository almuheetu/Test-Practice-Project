package com.example.testpracticeproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testpracticeproject.databinding.FirstFragmentXmlBinding

class FirstFragment : Fragment() {
    private lateinit var adapter: StudentAdapter
    private lateinit var binding: FirstFragmentXmlBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FirstFragmentXmlBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.StudentRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = StudentAdapter(studentList)
        recyclerView.adapter = adapter


    }

}