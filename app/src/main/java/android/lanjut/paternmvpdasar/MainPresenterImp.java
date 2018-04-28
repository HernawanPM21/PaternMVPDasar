package android.lanjut.paternmvpdasar;

import android.widget.EditText;

/**
 * Created by lind on 28/04/18.
 */

public class MainPresenterImp implements  MainPresenter{
    MainView mainView;

    public MainPresenterImp(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void cekData(EditText alas, EditText tinggi) {
        if (alas.getText().toString().isEmpty()||tinggi.getText().toString().isEmpty()){

            mainView.cetakKosong();
        }else{
            mainView.cetakIsi(alas,tinggi);
        }
    }

    @Override
    public void hitungLuas(Double alas, Double tinggi) {
        Double luas = alas*tinggi*0.5;
        mainView.updateHasil(luas);// disini hasilnya kita masukan ke view nya
    }
}
