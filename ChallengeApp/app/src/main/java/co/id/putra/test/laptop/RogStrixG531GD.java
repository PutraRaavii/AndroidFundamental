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

public class RogStrixG531GD extends AppCompatActivity {

    private Button lanjutkan, kembali ;
    AlertDialog.Builder alertBuilder;
    String harga = "Rp. 12.650.000";
    String nama = "ASUS ROG Strix G531GD";
    String ram = "8 GB, 32 GB";
    String storage ="1 TB";
    int databayar = 12650000 ;
    Intent pindah ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rog_strix_g531_gd);

        lanjutkan =(Button)findViewById(R.id.bt_lanjutkan);
        kembali =(Button)findViewById(R.id.btkembali);

        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertBuilder = new AlertDialog.Builder(RogStrixG531GD.this);
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

                                pindah = new Intent(RogStrixG531GD.this, MainPembayaran.class);
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
                Intent abc = new Intent(RogStrixG531GD.this, MainActivity.class);
                startActivity(abc);
                finish();
            }
        });


    }
}
