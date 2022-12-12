package com.example.data_ghibli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data_ghibli.databinding.ActivityListBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val call: Call<List<Images>>? = RetrofitClient.instance?.getApi()?.getHusbandos()
        call?.enqueue(object: Callback<List<Images>> {
            override fun onResponse(call: Call<List<Images>>,
                                    response: Response<List<Images>>) {
                if (response.isSuccessful) {
                    response.body()?.let{
                        binding.listImages.adapter = ImagesAdapter(it as ArrayList<Images>)
                        binding.listImages.layoutManager = LinearLayoutManager(this@ListActivity)
                        binding.progressBar.visibility = View.GONE
                        binding.listImages.visibility = View.VISIBLE
                    }
                }
            }

            override fun onFailure(call: Call<List<Images>>, t: Throwable) {
                binding.progressBar.visibility = View.GONE
                binding.errorMsg.text = "ERRO NA REQUISIÇÃO!"
                binding.errorMsg.visibility = View.VISIBLE
            }
        })
    }
}
