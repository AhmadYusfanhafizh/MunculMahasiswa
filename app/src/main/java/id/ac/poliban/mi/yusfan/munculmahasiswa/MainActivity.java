package id.ac.poliban.mi.yusfan.munculmahasiswa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String str;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK && data.getExtras()!=null){
            str = data.getStringExtra("nama") + "\n";
            str += data.getStringExtra("nim") + "\n";
            str += data.getStringExtra("alamat") + "\n";
            str += data.getStringExtra("telp") + "\n";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btInput = findViewById(R.id.btInput);
        Button btData = findViewById(R.id.btData);

        btInput.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DataMahasiswa.class);
            startActivityForResult(intent,1);
        });

        btData.setOnClickListener(v -> {
            Intent intent = new Intent();
            String nim = intent.getStringExtra("Data NIM");

            new AlertDialog.Builder(this)
                    .setTitle("Info Mahasiswa")
                    .setMessage(str)
                    .setPositiveButton("OK", null).show();
        });


    }
}
