package com.example.testpracticeproject

import android.health.connect.changelog.ChangeLogsResponse.DeletedLog
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testpracticeproject.databinding.StudentListBinding
import java.util.ArrayList

class StudentAdapter(
    private val studentList: ArrayList<Student>

) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(
        binding: StudentListBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        val studentName: TextView
        val studentId: TextView


        init {
            studentName = binding.tvStudentCarName
            studentId = binding.tvStudentId
        }

    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val bindding =
            StudentListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(bindding)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int
    ) {

        val student = studentList[position]
        //viewHolder.binding.tvStudentCarName.text = student.name

        viewHolder.studentName.text = student.name
        viewHolder.studentId.text = student.id
    }

    override fun getItemCount(): Int {
        return studentList.size
    }


}

