package com.example.alexfylling.mychat;

import android.graphics.Bitmap;

/**
 * Created by alexfylling on 05.10.2016.
 */

public class Contact {
    private String mName;
    private String mEmail;
    private String mPhoneNr;
    private Bitmap mAvatar;

    public Contact(String mName, String mEmail, String mPhoneNr, Bitmap mAvatar) {
        this.mName = mName;
        this.mEmail = mEmail;
        this.mPhoneNr = mPhoneNr;
        this.mAvatar = mAvatar;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhonenr() {
        return mPhoneNr;
    }

    public void setmPhonenr(String mPhoneNr) {
        this.mPhoneNr = mPhoneNr;
    }

    public Bitmap getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(Bitmap mAvatar) {
        this.mAvatar = mAvatar;
    }
}
