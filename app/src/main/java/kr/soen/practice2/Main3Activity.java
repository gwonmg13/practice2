package kr.soen.practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button b2,b6;
    EditText e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이계산");
        init();
    }
    void init(){

        e3 = (EditText)findViewById(R.id.editText3);
        b2 = (Button)findViewById(R.id.button2);

        e4 = (EditText)findViewById(R.id.editText4);
        b6 = (Button)findViewById(R.id.button6);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = e3.getText().toString();
                int numString = Integer.parseInt(num);
                int result = 2017 - numString +1;
                Toast.makeText(getApplicationContext(),
                        "당신의 나이는 "+ result+" 세 입니다.",Toast.LENGTH_SHORT).show();

            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num = e4.getText().toString();
                int numString = Integer.parseInt(num);
                int result = 2017 - numString +1;
                Toast.makeText(getApplicationContext(),
                        "당신이 태어난 해는 "+ result+" 세 입니다.",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
