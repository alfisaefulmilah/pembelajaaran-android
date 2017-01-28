package dev.edmt.UAS_PPB;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        //menginisiasi dan memanggil widget button pada file layout
        Button btn1 =(Button)findViewById(R.id.menu1);
        Button btn2 =(Button)findViewById(R.id.menu2);
        Button btn3 =(Button)findViewById(R.id.menu3);
        Button btn4 =(Button)findViewById(R.id.menu4);



        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(ActivityMenu.this,MenuSatu.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(ActivityMenu.this,MenuDua.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(ActivityMenu.this,MenuTiga.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(ActivityMenu.this,Multimedia.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });






        Button btnback = (Button) findViewById(R.id.menu7);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(ActivityMenu.this, MainActivity.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });


    }
}
