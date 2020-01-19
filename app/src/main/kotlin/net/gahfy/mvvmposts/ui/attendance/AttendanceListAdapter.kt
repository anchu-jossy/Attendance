package net.gahfy.mvvmposts.ui.attendance

import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import net.gahfy.mvvmposts.R
import net.gahfy.mvvmposts.databinding.ItemPostBinding
import net.gahfy.mvvmposts.model.Post

class AttendanceListAdapter: androidx.recyclerview.widget.RecyclerView.Adapter<AttendanceListAdapter.ViewHolder>() {
    private lateinit var postList:List<Post>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttendanceListAdapter.ViewHolder {
        val binding: ItemPostBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_post, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AttendanceListAdapter.ViewHolder, position: Int) {
        holder.bind(postList[position])
    }

    override fun getItemCount(): Int {
        return if(::postList.isInitialized) postList.size else 0
    }

    fun updatePostList(postList:List<Post>){
        this.postList = postList
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemPostBinding): androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root){
        private val viewModel = AttendanceListModel()

        fun bind(post:Post){
            viewModel.bind(post)
           // binding.viewModel = viewModel
        }
    }
}