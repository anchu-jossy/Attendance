package net.gahfy.mvvmposts.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import net.gahfy.mvvmposts.databinding.ActivityLoginBinding
import net.gahfy.mvvmposts.ui.dashboard.DashboardActivity


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, net.gahfy.mvvmposts.R.layout.activity_login)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

       binding.btnLogin.setOnClickListener {
           viewModel.onClick(this) }

        viewModel.userLiveData.observe(this@LoginActivity, Observer {
            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
            startActivity(intent)
        })

    }

}
