package com.example.xdai.demoapplication;

import android.app.Activity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by xdai on 1/27/15.
 */


@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(HomeActivity.class).create().get();
        Assert.assertTrue(activity != null);
    }
}
