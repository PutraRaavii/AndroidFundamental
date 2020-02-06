package co.id.putra.test.pembayaran;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import co.id.putra.test.MainActivity;
import co.id.putra.test.R;
import co.id.putra.test.pemesanan.MainPemesanan;

public class MainPembayaran extends AppCompatActivity {
    TextView txLaptop, txRam, txStorage,txHarga ;
    String zxc, zxc1, zxc2 ;
    Button continue1, cancel1 ;
    EditText etjumlah, etnamapembeli;
    int penampung_sementara;
    AlertDialog.Builder build ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pembayaran);
        txLaptop =(TextView)findViewById(R.id.tw_laptop);
        txRam =(TextView)findViewById(R.id.tw_ram);
        txStorage =(TextView)findViewById(R.id.tw_storage);
        txHarga =(TextView)findViewById(R.id.tw_harga);

        etnamapembeli =(EditText)findViewById(R.id.edt_namapembeli);

        etjumlah =(EditText)findViewById(R.id.edt_jumlahpembelian);


        continue1 =(Button)findViewById(R.id.bt_continue);
        cancel1 =(Button)findViewById(R.id.bt_cancel);

        // narik data
        Bundle getData = getIntent().getExtras();
        txLaptop.setText(getData.getString("NAMA"));
        txRam.setText(getData.getString("RAM"));
        txStorage.setText(getData.getString("STORAGE"));
        txHarga.setText(getData.getString("HARGA"));
        penampung_sementara = getData.getInt("BAYAR");
        zxc = getData.getString("NAMA");
        zxc2 = getData.getString("HARGA");

        Log.d("Log", "Bayar " + penampung_sementara);


        // Todo : Make A Declaration For Input Sub Total Buy


        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String namabuyer = etnamapembeli.getText().toString();
                final int penampung1 = Integer.parseInt(etjumlah.getText().toString());
                build = new AlertDialog.Builder(MainPembayaran.this);
                build
                        .setTitle("Lanjutkan Pada Pemesanan")
                        .setMessage("Lanjutkan Pada Pemilihan Kurir untuk melakukan pengiriman")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Bundle paket = new Bundle();
                                paket.putString("HARGA1", zxc2);
                                paket.putString("BUYER", namabuyer);
                                paket.putString("NAMALAPTOP",zxc);
                                paket.putInt("LAPTOP", penampung_sementara);
                                paket.putInt("BANYAKLAPTOP",penampung1);
                                Intent abc = new Intent(MainPembayaran.this, MainPemesanan.class);
                                abc.putExtras(paket);
                                startActivity(abc);
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                AlertDialog alertdialog = build.create();
                alertdialog.show();

            }
        });

        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainPembayaran.this, MainActivity.class);
                startActivity(abc);
                finish();
            }
        });




    }
}
