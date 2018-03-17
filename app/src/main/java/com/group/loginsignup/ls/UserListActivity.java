package com.group.loginsignup.ls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UserListActivity extends AppCompatActivity {

    ListView list;
    CustomAdapter adapter;
    public UserListActivity CustomListView = null;
    public ArrayList<ListModel> CustomListViewValuesArr= new ArrayList<ListModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
    }
}
