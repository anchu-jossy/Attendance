package net.gahfy.mvvmposts.ui.login

import LoginModel
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import net.gahfy.mvvmposts.network.PostApi
import net.gahfy.mvvmposts.ui.dashboard.DashboardActivity
import javax.inject.Inject


class LoginViewModel(): ViewModel() {
    private lateinit var subscription: Disposable
    private var mCompositeDisposable: CompositeDisposable? = null
    @Inject
    lateinit var postApi: PostApi
    fun onClick(context: Context) {
        loadPosts()
       /* val context = context
        val intent = Intent(context, DashboardActivity::class.java)
        context.startActivity(intent)*/
    }


    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }

    private fun loadPosts(){

        mCompositeDisposable?.add(postApi.getLogin("email","password")

                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError))

    }

    private fun handleResponse(androidList: LoginModel) {

        Log.d("TEST!@#", androidList.name)

    }

   private fun handleError(error: Throwable) {

        Log.d("TEST!@#", error.localizedMessage)


    }


}



