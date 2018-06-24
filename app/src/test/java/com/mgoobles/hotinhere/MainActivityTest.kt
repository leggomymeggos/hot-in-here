package com.mgoobles.hotinhere

import android.os.Build
import android.widget.TextView
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainActivityTest {

    @Test
    fun `should contain "Hello, World"`() {
        val subject = Robolectric.setupActivity(MainActivity::class.java)

        assertThat(subject.findViewById<TextView>(R.id.main_greeting).text).isEqualTo("Hello World!")
    }
}