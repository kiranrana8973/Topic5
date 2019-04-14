package com.example.topic5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Create a List of Contacts
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add( new Contacts("Saugat Malla","908011122",R.drawable.saugat));
        contactsList.add( new Contacts("Rajesh Hamal","908092212",R.drawable.rajesh));
        contactsList.add( new Contacts("Dahayang Rai","908092110",R.drawable.dahayang));
        contactsList.add( new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan));

        //Pass List to the Adapter class
        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}


