package id.ac.poliban.mi.yusfan.munculmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DataMahasiswa extends AppCompatActivity {
    private EditText etNama, etNim, etAlamat,etTelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa2);

        etNama = findViewById(R.id.etNama);
        etNim = findViewById(R.id.etNim);
        etAlamat = findViewById(R.id.etAlamat);
        etTelp = findViewById(R.id.etTelp);

        Button btSend = findViewById(R.id.btSend);

        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();

            intent.putExtra("nama",etNama.getText().toString());
            intent.putExtra("nim",etNim.getText().toString());
            intent.putExtra("alamat",etAlamat.getText().toString());
            intent.putExtra("telp",etTelp.getText().toString());

            setResult(RESULT_OK,intent);
            finish();
        });

    }
}