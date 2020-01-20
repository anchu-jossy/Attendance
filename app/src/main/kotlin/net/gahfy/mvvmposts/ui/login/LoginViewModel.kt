package net.gahfy.mvvmposts.ui.login

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import net.gahfy.mvvmposts.base.BaseViewModel
import net.gahfy.mvvmposts.network.PostApi
import javax.inject.Inject


class LoginViewModel(): BaseViewModel() {
    private lateinit var subscription: Disposable
    private var mCompositeDisposable: CompositeDisposable? = CompositeDisposable()
    val userLiveData: MutableLiveData<String> = MutableLiveData()
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
//        subscription.dispose()
    }

    private fun loadPosts(){

        mCompositeDisposable?.add(postApi.getLogin("admin","admin")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError))

    }

    private fun handleResponse(androidList: LoginModel) {

        Log.d("TEST!@#", androidList.name)
        Log.d("TEST!@#", "success................................................")
        userLiveData.value = "Success"

    }

   private fun handleError(error: Throwable) {
       Log.d("TEST!@#", "failed................................................")

        Log.d("TEST!@#", error.localizedMessage)

    }


}



