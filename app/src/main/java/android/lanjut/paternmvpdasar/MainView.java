package android.lanjut.paternmvpdasar;

import android.widget.EditText;

/**
 * Created by lind on 28/04/18.
 */

public interface MainView {
    void cetakKosong();
    void cetakIsi(EditText alas,EditText tinggi);
    void updateHasil(Double luas);
}
