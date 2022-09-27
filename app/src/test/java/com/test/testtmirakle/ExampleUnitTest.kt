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
    fun `this test should fail`() = runTest {
        assertTrue(false)
    }

    @Test
    fun `this test should not fail`() {
        assertTrue(true)
    }
}