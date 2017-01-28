package dev.edmt.UAS_PPB;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MenuDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_dua);

        Button btn1 =(Button)findViewById(R.id.menu2_1);
        Button btn2 =(Button)findViewById(R.id.menu2_2);
        Button btn3 =(Button)findViewById(R.id.menu2_3);
        Button btn4 =(Button)findViewById(R.id.menu2_4);





        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuDua.this,AreaKerja.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuDua.this,ProjectExplore.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuDua.this,UserInterface.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuDua.this,PembuatLayout.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });


        Button btnback = (Button) findViewById(R.id.menu2_5);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MenuDua.this, ActivityMenu.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });


    }
}
