package com.example.testpracticeproject

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

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val studentName: TextView
        val studentId: TextView

        init {
            studentName = view.findViewById(R.id.tv_student_carName)
            studentId = view.findViewById(R.id.tv_student_id)
        }
    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup, viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.student_list, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder, position: Int
    ) {
        val student = studentList[position]
        viewHolder.studentName.text = student.name
        viewHolder.studentId.text = student.id
    }

    override fun getItemCount(): Int {
        return studentList.size
    }


}

