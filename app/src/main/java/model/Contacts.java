package model;

import android.os.Parcel;
import android.os.Parcelable;

public class Contacts{

    private String name;
    private String phoneNo;
    private int image;
    //Constructor
    public Contacts(String name, String phoneNo, int image) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.image = image;
    }
    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int imageId) {
        this.image = imageId;
    }


}