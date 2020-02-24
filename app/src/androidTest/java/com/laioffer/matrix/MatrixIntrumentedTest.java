package com.laioffer.matrix;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MatrixIntrumentedTest {
    @Rule
    public ActivityTestRule<ControlPanel> activityTestRule =
            new ActivityTestRule<>(ControlPanel.class);
    @Test
    public void verifyMatrix() {
        onView(withText("Matrix")).check(matches(isDisplayed()));
    }

    @Test
    public void verifyLogin() {
        onView(withId(R.id.fab)).perform(click());

        onView(withText("Police")).perform(click());

        onView(withText("SEND")).check(matches(isDisplayed()));
    }


}
