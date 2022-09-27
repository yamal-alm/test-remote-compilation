package com.test.testtmirakle

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExperimentalCoroutinesApi
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() = runTest {
        assertEquals(4, 2 + 3)
    }

    @Test
    fun addition_isCorrect2() {
        assertEquals(4, 2 + 2)
    }
}