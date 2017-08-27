package com.bridge.jcvd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bridge on 2017/8/27.
 * MainActivityTest
 */
public class MainActivityTest {
    MainActivity main = new MainActivity();
    @Test
    public void onCreate() throws Exception {
        main.finishAffinity();
    }

    @Test
    public void onBackPressed() throws Exception {

    }

}