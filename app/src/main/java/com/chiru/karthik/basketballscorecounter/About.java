package com.chiru.karthik.basketballscorecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.net.Uri.parse;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onClickContact(View view)
    {
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setType("plain/text");
        sendIntent.setData(parse("karthikchiru12@gmail.com"));
        sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "karthikchiru12@gmail.com" });
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Regarding the app");
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Type your messege here :-)");
        startActivity(sendIntent);
    }
}
