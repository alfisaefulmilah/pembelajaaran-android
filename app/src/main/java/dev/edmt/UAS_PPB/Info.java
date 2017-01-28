package dev.edmt.UAS_PPB;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button btn1 =(Button)findViewById(R.id.disusun);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(Info.this,About.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        Button btnback = (Button) findViewById(R.id.backhome);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Info.this, MainActivity.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });

    }
}
