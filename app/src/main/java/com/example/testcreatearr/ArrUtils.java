package com.example.testcreatearr;

import android.content.Context;
import android.widget.Toast;

public class ArrUtils {
    private static ArrUtils utils;

    private ArrUtils() {
    }

    public static ArrUtils getInstance() {
        if (utils == null) {
            synchronized (ArrUtils.class) {
                if (utils == null) {
                    utils = new ArrUtils();
                }
            }
        }
        return utils;
    }

    public void showToast(Context context, String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
