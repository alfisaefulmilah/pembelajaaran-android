package dev.edmt.UAS_PPB;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //menginisiasi dan memanggil widget button pada file layout
        Button btn1 =(Button)findViewById(R.id.button1);
        Button btn2 =(Button)findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MainActivity.this,ActivityMenu.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MainActivity.this,Info.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });




        Button btn3 =(Button)findViewById(R.id.exit);

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi

            }
        });

    }
}
