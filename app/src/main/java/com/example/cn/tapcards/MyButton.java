package com.example.cn.tapcards;

import android.content.Context;
import android.widget.Button;

public class MyButton extends android.support.v7.widget.AppCompatButton {
    int num;
    boolean isOpened = false,isMatched = false;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public MyButton(Context context) {
        super(context);
    }
}
