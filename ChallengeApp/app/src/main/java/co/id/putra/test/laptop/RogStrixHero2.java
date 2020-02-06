package co.id.putra.test.laptop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.id.putra.test.MainActivity;
import co.id.putra.test.R;
import co.id.putra.test.pembayaran.MainPembayaran;

public class RogStrixHero2 extends AppCompatActivity {

    private Button lanjutkan, kembali ;
    AlertDialog.Builder alertBuilder;
    String harga = "Rp. 26.500.000";
    String nama = "ASUS ROG Strix Hero II GL504GM";
    String ram = "4GB ";
    String storage ="M.2 NVMe PCle 128 GB";
    int databayar = 26500000 ;
    Intent pindah ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rog_strix_hero2);

        lanjutkan =(Button)findViewById(R.id.bt_lanjutkan);
        kembali =(Button)findViewById(R.id.btkembali);


        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertBuilder = new AlertDialog.Builder(RogStrixHero2.this);
                alertBuilder
                        .setTitle("Lanjutkan")

                        .setMessage("Pembelian Laptop ASUS ROG Strix Hero II GL504GM dengan Harga : " + harga + " Apakah Ingin Dilanjutkan ? ")

                        .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                Bundle paket = new Bundle();
                                paket.putString("NAMA", nama);
                                paket.putString("RAM", ram);
                                paket.putString("STORAGE", storage);
                                paket.putString("HARGA", harga);
                                paket.putInt("BAYAR",databayar);

                                pindah = new Intent(RogStrixHero2.this, MainPembayaran.class);
                                pindah.putExtras(paket);

                                startActivity(pindah);

                            }
                        })
                        .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });


                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();


            }
        });



        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(RogStrixHero2.this, MainActivity.class);
                startActivity(abc);
                finish();
            }
        });


    }
}
