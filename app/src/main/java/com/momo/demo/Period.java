package com.momo.demo;

import android.nfc.Tag;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseClassName;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created by daniel-home on 11/09/14.
 */

@ParseClassName("periods")
public class Period extends ParseObject {



    public Period() {
        // A default constructor is required.
    }

    public String getTitle() {
        return getString("period");
    }



}