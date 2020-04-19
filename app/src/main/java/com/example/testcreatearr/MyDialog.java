package com.example.testcreatearr;

import android.app.AlertDialog;
import android.content.Context;

public class MyDialog {
    private static MyDialog myDialog;

    private MyDialog() {
    }

    public static MyDialog getInstance() {
        if (myDialog == null) {
            synchronized ("1") {
                if (myDialog == null) {
                    myDialog = new MyDialog();
                }
            }
        }
        return myDialog;
    }

    public void showDialog(Context context, String title, String content) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(content);
        builder.create().show();
    }
}
