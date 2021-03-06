package net.gahfy.mvvmposts.ui.attendance

import androidx.lifecycle.MutableLiveData
import net.gahfy.mvvmposts.base.BaseViewModel
import net.gahfy.mvvmposts.model.Post

class AttendanceListModel:BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}