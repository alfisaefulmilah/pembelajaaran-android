package dev.edmt.UAS_PPB;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MenuSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_satu);

        //menginisiasi dan memanggil widget button pada file layout
        Button btn1 =(Button)findViewById(R.id.menu1_7);
        Button btn2 =(Button)findViewById(R.id.menu1_1);
        Button btn3 =(Button)findViewById(R.id.menu1_2);
        Button btn4 =(Button)findViewById(R.id.menu1_3);
        Button btn7 =(Button)findViewById(R.id.menu1_4);
        Button btn5 =(Button)findViewById(R.id.menu1_5);
        Button btn6 =(Button)findViewById(R.id.menu1_6);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuSatu.this,InstalJdk.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuSatu.this,InstalAndroid.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuSatu.this,ProgPertama.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuSatu.this,KonfigurasiSdk.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuSatu.this,KonfigurasiAvd.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuSatu.this,RunProjek.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });




        Button btnback = (Button) findViewById(R.id.menu1_6);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MenuSatu.this, ActivityMenu.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });

    }
}
