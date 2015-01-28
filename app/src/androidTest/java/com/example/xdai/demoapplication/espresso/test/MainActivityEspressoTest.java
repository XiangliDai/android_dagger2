package com.example.xdai.demoapplication.espresso.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.xdai.demoapplication.MainActivity;
import com.example.xdai.demoapplication.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@LargeTest
public class MainActivityEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityEspressoTest() {
        // This constructor was deprecated - but we want to support lower API levels.
        super(MainActivity.class);
    }
    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Espresso will not launch our activity for us, we must launch it via getActivity().
        getActivity();
    }

    public void testCheckText() {
        onView(withId(R.id.home_text))
                .check(matches(withText("Hello world!")));
    }
}
