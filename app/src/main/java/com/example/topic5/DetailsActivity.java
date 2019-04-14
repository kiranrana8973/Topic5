package com.example.topic5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.URI;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView circImg;
    TextView tvFullName,tvPhoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg = findViewById(R.id.circImg);
        tvFullName = findViewById(R.id.tvFullName);
        tvPhoneNo = findViewById(R.id.tvPhoneNo);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null)
        {

            String path = "R.drawable." + bundle.getString("image");
          //  String imageName = bundle.getString("image");

//            int imageResource = getResources().getIdentifier("drawable/" + imageName, null, getPackageName());
//            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imageResource);
//            circImg.setImageBitmap(bitmap);
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));
        }

    }
}
