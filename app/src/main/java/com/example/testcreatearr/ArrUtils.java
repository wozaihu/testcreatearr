package com.example.testcreatearr;

import android.content.Context;
import android.widget.Toast;

import java.util.Random;

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

    public int getRandomNumber() {
        int i = new Random(999).nextInt();
        return i;
    }

    public String getPictureUrl() {
        return "http://b-ssl.duitang.com/uploads/item/201808/24/20180824163744_tlueh.jpg";
    }
}
