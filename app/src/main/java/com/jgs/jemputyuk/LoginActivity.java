package com.jgs.jemputyuk;

import android.app.Activity;
import android.view.View;

public class LoginActivity extends Activity {
    public void initEvent() {
        View btn_login = null;
        btn_login.setOnClickListener((View.OnClickListener) this);
        View btn_register = null;
        btn_register.setOnClickListener((View.OnClickListener) this);
    }

}
