package com.example.aplicacionargentinaprograma

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun testStringComparison() {
        viewModel.compareStrings("hello", "hello")
        assertEquals("Las cadenas son iguales", viewModel.comparisonResult.value)

        viewModel.compareStrings("hello", "world")
        assertEquals("Las cadenas son diferentes", viewModel.comparisonResult.value)
    }
}
