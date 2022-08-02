package kr.hs.emirim.s2117.mirim_project_0802_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] poster = {R.drawable.wntnfghlwjs1, R.drawable.wntnfghlwjs2,R.drawable.wntnfghlwjs3,R.drawable.wntnfghlwjs4,R.drawable.wntnfghlwjs5,R.drawable.wntnfghlwjs6,R.drawable.wntnfghlwjs7,R.drawable.wntnfghlwjs8,R.drawable.wntnfghlwjs9,R.drawable.wntnfghlwjs10};
    String[] items = {"죽여버리겠어", "기수뇌동", "시부야 사변 -개문-", "회옥", "시부야 사변 -이비-", "눈부신 어둠", "주태대천", "옥절", "시부야 사변 -강령-", "시부야 사변 -벽력-"};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(poster[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}