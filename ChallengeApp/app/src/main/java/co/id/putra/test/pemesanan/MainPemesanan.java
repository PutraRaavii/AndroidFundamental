package co.id.putra.test.pemesanan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import co.id.putra.test.MainActivity;
import co.id.putra.test.R;
import co.id.putra.test.pembayaran.MainPembayaran;
import co.id.putra.test.terakhir.MainLast;

public class MainPemesanan extends AppCompatActivity {
    Button go, back ;
    int kurir, penampung_lewat, penampung_lewat2 ;
    AlertDialog.Builder pesan;
    String botol;
    String Buku, pembeli, harga ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pemesanan);

        go =(Button)findViewById(R.id.bt_go);
        back =(Button)findViewById(R.id.bt_back);


        Bundle getPrice = getIntent().getExtras();

        penampung_lewat = getPrice.getInt("LAPTOP");
        penampung_lewat2 = getPrice.getInt("BANYAKLAPTOP");
        Buku = getPrice.getString("NAMALAPTOP");
        pembeli = getPrice.getString("BUYER");
        harga = getPrice.getString("HARGA1");


        final RadioGroup rgall =(RadioGroup)findViewById(R.id.rg_all);


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                int id = rgall.getCheckedRadioButtonId();
                switch (id){
                    case R.id.rb_jne :
                        Toast toast=Toast.makeText(getApplicationContext(),"Pengiriman melalui JNE",Toast.LENGTH_SHORT);
                        toast.show();
                        kurir = 20000 ;
                        botol = "JNE";
                        break;
                    case R.id.rb_pos :
                        Toast toast1=Toast.makeText(getApplicationContext(),"Pengiriman melalui Pos Indonesia",Toast.LENGTH_SHORT);
                        toast1.show();
                        kurir = 50000;
                        botol = "Pos Indonesia";
                        break;
                    case R.id.rb_cepat :
                        Toast toast2=Toast.makeText(getApplicationContext(),"Pengiriman melalui SiCepat",Toast.LENGTH_SHORT);
                        toast2.show();
                        kurir = 15000 ;
                        botol = "SiCepat";
                        break;
                    case R.id.rb_ninja :
                        Toast toast3=Toast.makeText(getApplicationContext(),"Pengiriman melalui Ninja Express",Toast.LENGTH_SHORT);
                        toast3.show();
                        kurir = 25000;
                        botol = "Ninja Express";
                        break;
                    case R.id.rb_TiKi :
                        Toast toast4=Toast.makeText(getApplicationContext(),"Pengiriman melalui TiKi",Toast.LENGTH_SHORT);
                        toast4.show();
                        kurir = 25000 ;
                        botol = "TiKi" ;
                        break;
                    case R.id.rb_wahana :
                        Toast toast5=Toast.makeText(getApplicationContext(),"Pengiriman melalui Wahana Logistik",Toast.LENGTH_SHORT);
                        toast5.show();
                        kurir = 30000;
                        botol = "Wahana Logistik" ;
                        break;
                }


                Bundle data = new Bundle();
                data.putString("HARGA2", harga);
                data.putString("BUYER1", pembeli);
                data.putString("SARANA", botol);
                data.putString("NAMALAPTOP3", Buku);
                data.putInt("KURIR", kurir);
                data.putInt("HARGALAPTOP", penampung_lewat);
                data.putInt("BANYAKLAPTOP2", penampung_lewat2);
                Intent abc = new Intent(MainPemesanan.this,MainLast.class);
                abc.putExtras(data);
                startActivity(abc);

            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainPemesanan.this, MainPembayaran.class);
                startActivity(abc);
                finish();
            }
        });






    }
}
