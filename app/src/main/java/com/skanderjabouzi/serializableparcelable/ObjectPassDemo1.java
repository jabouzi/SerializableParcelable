package com.skanderjabouzi.serializableparcelable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ObjectPassDemo1 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView mTextView = new TextView(this);
        Person mPerson = (Person)getIntent().getSerializableExtra(MainActivity.SER_KEY);
        mTextView.setText("You name is: " + mPerson.getName() + "/n"+
                "You age is: " + mPerson.getAge() + "/n Address: " + mPerson.getAddress().getNumber() + " " + mPerson.getAddress().getStreet() + " " + mPerson.getAddress().getCity());

        setContentView(mTextView);
    }
}
