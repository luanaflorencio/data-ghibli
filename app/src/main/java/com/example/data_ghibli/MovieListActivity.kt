package com.example.data_ghibli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.data_ghibli.databinding.ActivityMovieListBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MovieListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager: ViewPager2 = binding.pager
        val tabLayout: TabLayout = binding.tabLayout

        val fragments: ArrayList<Fragment> = arrayListOf(
            MoviesTabFragment(),
            CharsTabFragment()
        )

        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = getString(R.string.movies)
            }
            if (position == 1) {
                tab.text = getString(R.string.chars)
            }
        }.attach()
    }
}
