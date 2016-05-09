package com.leeeyou.toolbarsample.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.leeeyou.toolbarsample.R;

public class MainActivity extends Base_Center_Activity {

    Button btn_go_toolbar;
    Button btn_searchview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCenterTitleOnly("ToolbarSample");

        btn_go_toolbar = (Button) findViewById(R.id.btn_go_toolbar);
        btn_go_toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ExampleActivity.class));
            }
        });

        btn_searchview = (Button) findViewById(R.id.btn_searchview);
        btn_searchview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchViewActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String result = "";
        switch (item.getItemId()) {
            case R.id.ac_toolbar_copy:
                result = "Copy";
                break;
            case R.id.ac_toolbar_cut:
                result = "Cut";
                break;
            case R.id.ac_toolbar_del:
                result = "Del";
                break;
            case R.id.ac_toolbar_edit:
                result = "Edit";
                break;
            case R.id.ac_toolbar_email:
                result = "Email";
                break;
        }
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

}
