package com.jgs.jemputyuk;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class UserActivity extends Activity {
    public void HalamanLogin(View view) {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
