package com.ecgreb.dagger2testingdemo;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class MainActivityTest24 {
    private MainActivity mainActivity;

    @Before public void setUp() throws Exception {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test public void shouldInjectMockStringFactory1() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber1() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory2() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber2() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory3() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber3() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory4() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber4() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory5() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber5() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory6() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber6() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }
    @Test public void shouldInjectMockStringFactory7() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber7() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory8() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber8() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory9() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber9() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

    @Test public void shouldInjectMockStringFactory10() throws Exception {
        TextView greeting = (TextView) mainActivity.findViewById(R.id.greeting);
        assertEquals("Fake greeting", greeting.getText());
    }

    @Test public void shouldInjectMagicNumber10() throws Exception {
        TextView number = (TextView) mainActivity.findViewById(R.id.number);
        assertEquals("The magic number is 4.", number.getText());
    }

}
