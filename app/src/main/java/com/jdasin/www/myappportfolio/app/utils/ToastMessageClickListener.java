package com.jdasin.www.myappportfolio.app.utils;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Daniel on 6/8/2015.
 */
public class ToastMessageClickListener implements View.OnClickListener {

    private int mStringId;

    public ToastMessageClickListener(Integer stringId) {
        this.mStringId = stringId;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), mStringId, Toast.LENGTH_LONG).show();
    }
}
