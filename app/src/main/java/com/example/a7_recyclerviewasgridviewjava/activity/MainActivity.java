package com.example.a7_recyclerviewasgridviewjava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a7_recyclerviewasgridviewjava.R;
import com.example.a7_recyclerviewasgridviewjava.adapter.CustomAdapter;
import com.example.a7_recyclerviewasgridviewjava.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        List<Member> members = prepareMemberList();
        refreshAdapter(members);


    }
    private void initView(){
        recyclerView = findViewById(R.id.recycleViewMain);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
    }
    private void refreshAdapter(List<Member> members){
        CustomAdapter adapter = new CustomAdapter(context,members);
        recyclerView.setAdapter(adapter);
    }
    private List<Member> prepareMemberList(){
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 63; i++) {
            members.add(new Member(" Sherzod", "Jurabekov",false));

        }
        return members;
    }

}