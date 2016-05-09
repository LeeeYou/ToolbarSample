package com.leeeyou.toolbarsample.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.leeeyou.toolbarsample.R;

public class Base_Center_Activity extends AppCompatActivity {

    private FrameLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base_center);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            final WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | attributes.flags);
        }

        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        setContentView(View.inflate(this, layoutResID, null));
    }

    @Override
    public void setContentView(View view) {
        rootLayout = (FrameLayout) findViewById(R.id.rootLayout);

        if (rootLayout == null) {
            return;
        }

        rootLayout.addView(view, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        initToolbar();
    }

    public void setTitleAndDoNotDisplayHomeAsUp(String title) {
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    public void setTitleAndDisplayHomeAsUp(String title) {
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setCenterTitleOnly(String title) {
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        TextView toolbar_center_title = (TextView) findViewById(R.id.toolbar_center_title);
        toolbar_center_title.setVisibility(View.VISIBLE);
        toolbar_center_title.setText(title);
    }

    public void setLeftTitleOnly(String title) {
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        TextView toolbar_center_title = (TextView) findViewById(R.id.toolbar_center_title);
        toolbar_center_title.setVisibility(View.GONE);
    }


}
