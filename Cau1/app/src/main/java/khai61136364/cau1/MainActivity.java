package khai61136364.cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB, editSoH;
    TextView textViewKetQua;
    Button nutChuvi, nutDientich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }

    void TimWidget() {
        editSoA = (EditText) findViewById(R.id.edSoA);
        editSoB = (EditText) findViewById(R.id.edSoB);
        editSoH = (EditText) findViewById(R.id.edSoH);
        textViewKetQua = (TextView) findViewById(R.id.tvKetQua);
        nutChuvi = (Button) findViewById(R.id.btnChuvi);
        nutDientich = (Button) findViewById(R.id.btnDientich);
    }
    public void XuLyChuvi(View v){

        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        int C = 2*(a+b);

        String chuoiC = String.valueOf(C);

        textViewKetQua.setText("=" + chuoiC);
    }

    public void XuLyDientich(View v){

        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        String sH = editSoH.getText().toString();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int h = Integer.parseInt(sH);

        int S =a*h;
        String chuoiS = String.valueOf(S);

        textViewKetQua.setText("=" + chuoiS);
    }
}