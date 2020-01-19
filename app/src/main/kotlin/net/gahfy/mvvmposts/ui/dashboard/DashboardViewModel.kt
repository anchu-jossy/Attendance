package net.gahfy.mvvmposts.ui.dashboard

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.lifecycle.MutableLiveData
import android.view.View
import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import net.gahfy.mvvmposts.R
import net.gahfy.mvvmposts.base.BaseViewModel
import net.gahfy.mvvmposts.model.Post
import net.gahfy.mvvmposts.model.PostDao
import net.gahfy.mvvmposts.network.PostApi
import net.gahfy.mvvmposts.ui.attendance.AttendanceActivity
import net.gahfy.mvvmposts.ui.post.PostListAdapter
import javax.inject.Inject

class DashboardViewModel():ViewModel(){



    fun onClick(context: Context) {
        val context = context
        val intent = Intent(context, AttendanceActivity::class.java)

        context.startActivity(intent)
    }
}