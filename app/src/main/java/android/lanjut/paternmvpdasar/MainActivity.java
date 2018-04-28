package android.lanjut.paternmvpdasar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenterImp mainPresenterImp;
    EditText et_alas,et_tinggi;
    Button btn_hasil;
    TextView tv_hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_alas= findViewById(R.id.et_alas);
        et_tinggi = findViewById(R.id.et_tinggi);
        btn_hasil = findViewById(R.id.btn_hasil);
        tv_hasil  = findViewById(R.id.tv_hasil);

        mainPresenterImp = new MainPresenterImp(MainActivity.this);

    btn_hasil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mainPresenterImp.cekData(et_alas,et_tinggi);
        }
    });
    }


    @Override
    public void cetakKosong() {
        Toast.makeText(this, "Maaf Kosong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void cetakIsi(EditText alas, EditText tinggi) {
        Double p_alas = Double.parseDouble(et_alas.getText().toString());
        Double p_tinggi = Double.parseDouble(et_tinggi.getText().toString());
        mainPresenterImp.hitungLuas(p_alas,p_tinggi);
    }

    @Override
    public void updateHasil(Double luas) {
        tv_hasil.setText(luas.toString());
    }
}
