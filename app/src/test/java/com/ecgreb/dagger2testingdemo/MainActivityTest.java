package com.ecgreb.dagger2testingdemo;

import org.bouncycastle.jce.provider.symmetric.ARC4;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.widget.TextView;

import static org.junit.Assert.assertEquals;

public class MainActivityTest extends BaseTest{
    private MainActivity mainActivity;

    @Before public void setUp() throws Exception {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test public void shouldInjectMockStringFactory() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }
}
