package com.example.instrumentationunittests;

import android.app.Activity;
import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkUi() {
        onView(withId(R.id.first_number_view))
                .check(matches(isDisplayed()));

        onView(withId(R.id.second_number_view))
                .check(matches(isDisplayed()));

        onView(withText("Result N/A!"))
                .check(matches(isDisplayed()));

        onView(withText("Sum"))
                .check(matches(isDisplayed()));

        onView(withText("Diff"))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkCalculation() {
        onView(withId(R.id.first_number_view))
                .perform(typeText("15"));

        onView(withId(R.id.second_number_view))
                .perform(typeText("29"));

        onView(withText("Sum"))
                .perform(click());

        onView(withId(R.id.result_view))
                .check(matches(withText("Result: 44")));
    }
}
