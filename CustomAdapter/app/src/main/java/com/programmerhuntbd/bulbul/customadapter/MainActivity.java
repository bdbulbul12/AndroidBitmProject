package com.programmerhuntbd.bulbul.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<ContactPerson> persons;
    private ContactPerson contactPerson;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.myListView);

        contactPerson = new ContactPerson();
        persons = contactPerson.getAllPerson();
        personAdapter = new PersonAdapter(this,persons);
        listView.setAdapter(personAdapter);
    }
}
