package net.gahfy.mvvmposts.ui.attendance

import android.content.Context
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import net.gahfy.mvvmposts.R
import net.gahfy.mvvmposts.databinding.AttendanceItemBinding

class AttendanceListAdapter(val items: List<AttendanceModel>, val context: Context) :
        RecyclerView.Adapter<AttendanceListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val bindig = DataBindingUtil.inflate<AttendanceItemBinding>(
                LayoutInflater.from(parent.context),
                R.layout.attendance_item,
                parent,
                false
        )
        return ViewHolder(bindig)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvStudName.text = items.get(position).name
//        if (items.get(position).equals("present")) holder.binding.rbPresent.isActivated = true
//        else if (items.get(position).equals("absent")) holder.binding.rbAbsent.isActivated = true
//        else holder.binding.rbAbsent.isActivated = true
//        holder.binding.llItem.setOnClickListener { listViewModel.singleItemMutableLiveData.value = items.get(position) }

    }

    class ViewHolder(val binding: AttendanceItemBinding) : RecyclerView.ViewHolder(binding.root)
}