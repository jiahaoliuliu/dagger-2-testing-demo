package com.ecgreb.dagger2testingdemo.sample4;

import android.widget.TextView;

import com.ecgreb.dagger2testingdemo.BaseTest;
import com.ecgreb.dagger2testingdemo.MainActivity;
import com.ecgreb.dagger2testingdemo.R;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertEquals;

public class MainActivityTest2 extends BaseTest {
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