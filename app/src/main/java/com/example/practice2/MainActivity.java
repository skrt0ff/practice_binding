package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import com.example.practice2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements
    View.OnClickListener
    {
    private Button btnOk;
    private TextView textView;
    //private ActivityMainBinding binding; //Создаем переменную
    private Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = ActivityMainBinding.inflate(getLayoutInflater()); //
        //View view = binding.getRoot(); //view наполняется activity_main файлом
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews() {
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Нажми на любую кнопку!");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

       // btnOk = binding.btnOk;
        //textView = binding.textView;
//        if (btnOk != null)
//            textView.setText("Кнопка есть!");
//        else textView.setText("Кнопки нет!");
    }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnOk:
                    textView.setText("Ok! Нажми Cancel");
                    btnOk.setEnabled(false);
                    btnCancel.setEnabled(true);
                    break;
                case R.id.btnCancel:
                    textView.setText("Cancel! Нажми на Ok");
                    btnCancel.setEnabled(false);
                    btnOk.setEnabled(true);
                    break;
            }
        }
    }