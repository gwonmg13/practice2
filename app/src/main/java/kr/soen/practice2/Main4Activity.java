package kr.soen.practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {


    Button b3,b4;
    EditText e5,e6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("섭씨 온도, 화씨 온도 계산");
        init();
    }
    void init(){

        e5 = (EditText)findViewById(R.id.editText5);
        b3 = (Button)findViewById(R.id.button3);

        e6 = (EditText)findViewById(R.id.editText6);
        b4 = (Button)findViewById(R.id.button4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = e5.getText().toString();
                int numString = Integer.parseInt(num);
                double result = numString * 1.8 +32;
                Toast.makeText(getApplicationContext(),
                        "화씨 온도는 "+ result+" 도 입니다.",Toast.LENGTH_SHORT).show();

            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num = e6.getText().toString();
                int numString = Integer.parseInt(num);
                double result =  (numString - 32 )/1.8;
                Toast.makeText(getApplicationContext(),
                        "섭씨 온도는 "+ result+" 도 입니다.",Toast.LENGTH_SHORT).show();

            }
        });

    }
}

