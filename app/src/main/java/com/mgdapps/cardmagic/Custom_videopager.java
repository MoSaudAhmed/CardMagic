package com.mgdapps.cardmagic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_videopager extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button button;
    int position;

    CardReference cardReference=new CardReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customvideo_pager);

        textView = (TextView) findViewById(R.id.tv_videoadap);
        imageView = (ImageView) findViewById(R.id.img_videoadap);
        button = (Button) findViewById(R.id.btn_videoadap);
        position = getIntent().getIntExtra("position", 0);



        textView.setText(cardReference.cards_videopage_string[position]);
        imageView.setImageResource(cardReference.cards_videopage_image[position]);

    }

    public void videobtnclicked(View view) {

        Intent intent = new Intent(getApplicationContext(), Videoview.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}
