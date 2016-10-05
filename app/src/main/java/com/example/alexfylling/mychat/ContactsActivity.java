package com.example.alexfylling.mychat;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.StrictMode;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class ContactsActivity extends AppCompatActivity {

    private Context mContext;
    private List<Contact> mListContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }

    public ContactsActivity(Context mContext, List<Contact> mListContact) {
        this.mContext = mContext;
        this.mListContact = mListContact;
    }


}
