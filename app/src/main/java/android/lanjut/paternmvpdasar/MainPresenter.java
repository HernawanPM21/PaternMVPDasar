package android.lanjut.paternmvpdasar;

import android.widget.EditText;

/**
 * Created by lind on 28/04/18.
 */

public interface MainPresenter {
    void cekData(EditText alas,EditText tinggi);
    void hitungLuas(Double alas,Double tinggi);
}
