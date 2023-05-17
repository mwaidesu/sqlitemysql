package com.example.sqlitemysql;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton submit;
    RecyclerView recyclerView;
    EditText Name;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        recyclerView = findViewById(R.id.recyclerview);
        Name = findViewById(R.id.name);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitName();
            }
        });
    }

    private void submitName() {
        Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
    }
}