package com.example.testprojecthammersystems.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.testprojecthammersystems.R
import com.example.testprojecthammersystems.core.dataBase.AppDatabase
import com.example.testprojecthammersystems.data.model.BannerItem
import com.example.testprojecthammersystems.data.model.DishesItem
import com.example.testprojecthammersystems.data.model.Product
import com.example.testprojecthammersystems.databinding.FragmentMainBinding
import com.example.testprojecthammersystems.screens.base.BaseFragment
import com.example.testprojecthammersystems.screens.main.adapter.BannersAdapter
import com.example.testprojecthammersystems.screens.main.adapter.DishesAdapter
import com.example.testprojecthammersystems.screens.main.adapter.ProductsAdapter
import com.example.testprojecthammersystems.screens.main.viewHolder.DishesVH


class MainFragment : BaseFragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MainViewModel

    private lateinit var bannersAdapter: BannersAdapter
    private lateinit var dishesAdapter: DishesAdapter
    private lateinit var productsAdapter: ProductsAdapter


    override fun getRootView(): ViewGroup = binding.root


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMainBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe()
        initView()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            this.app(),
            AppDatabase::class.java, "appDataBase"
        ).build()

        viewModel = MainViewModel(db.productDao())

    }

    private fun initView() {
        initToolbar()
        initBanners()
        initDishes()
        initProducts()
    }


    private fun initBanners() {
        bannersAdapter = BannersAdapter()
        binding.rvBanners.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvBanners.adapter = bannersAdapter
        bannersAdapter.setData(
            listOf(
                BannerItem(),
                BannerItem(),
                BannerItem(),
                BannerItem()
            )
        )

    }

    private fun initDishes() {
        dishesAdapter = DishesAdapter()
        binding.rvDishes.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvDishes.adapter = dishesAdapter
        dishesAdapter.setListener(object : DishesVH.DishAction {
            override fun onDishClick(position: Int) {
                dishesAdapter.updateData(position)
            }

        })
    }

    private fun setDishes(list: List<DishesItem>?) {
        dishesAdapter.setData(list ?: listOf())
    }

    private fun initProducts() {
        productsAdapter = ProductsAdapter()
        binding.productsRv.layoutManager = LinearLayoutManager(context)
        binding.productsRv.adapter = productsAdapter
    }

    private fun setProducts(list: List<Product>) {
        productsAdapter.setData(list)
    }

    private fun initToolbar() {
        context?.getColor(R.color.white)?.let { setToolbarColor(it) }
        setToolbarMenu(R.menu.main_menu)
    }


    private fun observe() {
        viewModel.listProduct.observe(viewLifecycleOwner) { list ->
            if (list == null) {
                viewModel.getPizzaData()
            } else {
                setProducts(list)
            }
        }

        viewModel.listDishes.observe(viewLifecycleOwner) { list ->
            setDishes(list)
        }
    }
}
