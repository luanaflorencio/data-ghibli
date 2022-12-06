package com.example.data_ghibli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.data_ghibli.databinding.ActivityListBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager: ViewPager2 = binding.pager
        val tabLayout: TabLayout = binding.tabLayout

        val fragments: ArrayList<Fragment> = arrayListOf(
            ImagesTabFragment(),
            GifsTabFragment()
        )

        val adapter = RecyclerViewAdapter(fragments, this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = getString(R.string.imagens)
            }
            if (position == 1) {
                tab.text = getString(R.string.gifs)
            }
        }.attach()
    }
}
