package com.example.testpracticeproject

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testpracticeproject.databinding.StudentListBinding
import java.util.ArrayList

class StudentAdapter(
    private val studentList: ArrayList<Student>

) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(val binding: StudentListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val binding =
            StudentListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int
    ) {

        val student = studentList[position]
        viewHolder.binding.tvStudentCarName.text = student.name
        viewHolder.binding.tvStudentId.text = student.id

    }

    override fun getItemCount(): Int {
        return studentList.size
    }


}



