package net.gahfy.mvvmposts.ui.attendance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_attendance.*
import net.gahfy.mvvmposts.R
import java.util.ArrayList

class AttendanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance)
        setSpinnerData()
        setRecyclerview()
    }

    fun setSpinnerData(){
        val classType = ArrayList<String>()
        classType.add("Class")
        val dataAdapterVehicleType = ArrayAdapter(this, android.R.layout.simple_spinner_item, classType)
        dataAdapterVehicleType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_class.setAdapter(dataAdapterVehicleType)

        val section = ArrayList<String>()
        section.add("Section")
        val dataAdaptersection = ArrayAdapter(this, android.R.layout.simple_spinner_item, section)
        dataAdaptersection.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_section.setAdapter(dataAdaptersection)
    }

    fun setRecyclerview(){
        rv_attendance.layoutManager = LinearLayoutManager(this)
        rv_attendance.adapter = AttendanceListAdapter(getStudentDetails(),this)
    }

    fun getStudentDetails():ArrayList<AttendanceModel>{
        val students : ArrayList<AttendanceModel> = ArrayList()

        students.add(AttendanceModel("Varsha","Late"))
        students.add(AttendanceModel("Asha","Absent"))
        students.add(AttendanceModel("Anju","present"))
        students.add(AttendanceModel("Linta","Late"))
        students.add(AttendanceModel("Rijo","present"))
        students.add(AttendanceModel("Resmi","Absent"))
        students.add(AttendanceModel("Hari","present"))
        students.add(AttendanceModel("Nandhu","Late"))
        students.add(AttendanceModel("Sampoorna","present"))
        students.add(AttendanceModel("Benedict","present"))

        return students
    }
}
