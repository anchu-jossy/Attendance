package net.gahfy.mvvmposts.ui.dashboard

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import net.gahfy.mvvmposts.R
import net.gahfy.mvvmposts.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var viewModel: DashboardViewModel

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard)
        viewModel = ViewModelProviders.of(this).get(DashboardViewModel::class.java)

        binding.imageviewAttendence.setOnClickListener(View.OnClickListener {
            viewModel.onClick(this)
        })


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.dashboard, menu)
        return true
    }

}
