package com.leeeyou.toolbarsample.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.leeeyou.toolbarsample.R;
import com.leeeyou.toolbarsample.utils.UniversalAdapter;
import com.leeeyou.toolbarsample.utils.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ExampleActivity extends Base_Original_Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Toolbar");
        toolbar.setTitleTextColor(Color.WHITE);

        toolbar.setSubtitle("SubTitle");
        toolbar.setSubtitleTextColor(Color.GRAY);

        toolbar.setNavigationIcon(R.mipmap.menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleActivity.this, "Navigation", Toast.LENGTH_SHORT).show();
            }
        });

        toolbar.setLogo(R.mipmap.ic_launcher);

        toolbar.inflateMenu(R.menu.menu_toolbar);
        toolbar.setOnMenuItemClickListener(new OnMenuItemClickListener() {
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

                                                   Toast.makeText(ExampleActivity.this, result, Toast.LENGTH_SHORT).show();
                                                   return true;
                                               }
                                           }
        );


        List<String> datas = new ArrayList<>(500);
        for (int i = 0; i < 500; i++) {
            datas.add("这是第" + (i + 1) + "行数据");
        }

        ListView listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(new UniversalAdapter<String>(this, datas, android.R.layout.test_list_item) {
            @Override
            public void convert(ViewHolder vh, String item, int position) {
                vh.setText(android.R.id.text1, item);
            }
        });
    }

}
