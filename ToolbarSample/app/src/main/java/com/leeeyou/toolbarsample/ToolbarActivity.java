package com.leeeyou.toolbarsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class ToolbarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar");
        toolbar.inflateMenu(R.menu.menu_toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                                               @Override
                                               public boolean onMenuItemClick(MenuItem item) {
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

                                                   Toast.makeText(ToolbarActivity.this, result, Toast.LENGTH_SHORT).show();
                                                   return true;
                                               }
                                           }
        );
    }

}
