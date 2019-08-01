package com.dell.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context context, String Message) {
        Toast.makeText(context, Message, Toast.LENGTH_LONG).show();
    }

}
