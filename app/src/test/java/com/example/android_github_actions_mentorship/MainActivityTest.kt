package com.example.android_github_actions_mentorship

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [34])
class MainActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `greeting with world`() {
        composeTestRule.setContent {
            Greeting("world")
        }
        composeTestRule.onNodeWithText("Hello world!").assertExists()
    }

    @Test
    fun `greeting with empty name`() {
        composeTestRule.setContent {
            Greeting(name = "")
        }
        composeTestRule.onNodeWithText("Hello !").assertExists()
    }

    @Test
    fun `greeting with long name`() {
        val longName = "a".repeat(1000)
        composeTestRule.setContent {
            Greeting(name = longName)
        }
        composeTestRule.onNodeWithText("Hello $longName!").assertExists()
    }

    @Test
    fun `greeting with special characters`() {
        val specialName = "!@#$%^&*()"
        composeTestRule.setContent {
            Greeting(name = specialName)
        }
        composeTestRule.onNodeWithText("Hello $specialName!").assertExists()
    }
}