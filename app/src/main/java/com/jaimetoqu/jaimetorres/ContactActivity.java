package com.jaimetoqu.jaimetorres;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView linkedinTv = (TextView) findViewById(R.id.linkedinTv);
        linkedinTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("http://cl.linkedin/in/jaimetoqu"));
                startActivity(linkedinIntent);
            }
        });

        TextView githubTv = (TextView) findViewById(R.id.githubTv);
        githubTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent githubIntent = new Intent(Intent.ACTION_VIEW);
                githubIntent.setData(Uri.parse("http://github.com/jaimetoqu"));
                startActivity(githubIntent);
            }
        });

        TextView phoneTv = (TextView) findViewById(R.id.phoneTv);
        phoneTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("+56 9 63275560"));
                startActivity(callIntent);

            }
        });
    }
}
