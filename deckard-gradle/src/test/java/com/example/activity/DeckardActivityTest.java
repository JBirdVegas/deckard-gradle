package com.example.activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class DeckardActivityTest {

    @Test
    public void testSomething() throws Exception {
        assertTrue(Robolectric.buildActivity(DeckardActivity.class).create().get() != null);
    }
}
