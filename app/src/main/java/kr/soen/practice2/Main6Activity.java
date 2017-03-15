package kr.soen.practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    Button b5,b7,b9,b10;
    EditText e9,e11;
    String num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");
        init();
    }

    void init(){
        b5 = (Button)findViewById(R.id.button5);
        b7 = (Button)findViewById(R.id.button7);
        b9 = (Button)findViewById(R.id.button9);
        b10 = (Button)findViewById(R.id.button10);
        e9 = (EditText)findViewById(R.id.editText9);
        e11 = (EditText)findViewById(R.id.editText11);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = e9.getText().toString();
                num2 = e11.getText().toString();

                if(test(num1, num2)==true){
                    int result = Integer.parseInt(num1) + Integer.parseInt(num2);

                    Toast.makeText(getApplicationContext(),
                            "더하기 계산 결과는 "+result+" 입니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }


            }
        });
        b7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                 num1 = e9.getText().toString();
                 num2 = e11.getText().toString();

                if(test(num1, num2)==true){
                    int result  = Integer.parseInt(num1) - Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(),
                            "빼기 계산 결과는 "+ result +" 입니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }


            }
        });
        b9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                 num1 = e9.getText().toString();
                 num2 = e11.getText().toString();


                if(test(num1, num2)==true){
                    int result  = Integer.parseInt(num1) * Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(),
                            "곱하기 계산 결과는 "+ result +" 입니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 num1 = e9.getText().toString();
                 num2 = e11.getText().toString();

                if(test(num1, num2)==true){
                    int IntNum2 = Integer.parseInt(num2);
                    if(IntNum2 == 0){
                        Toast.makeText(getApplicationContext(),
                                "0으로 나눌 수 없습니다. ",Toast.LENGTH_SHORT).show();
                    }else{
                        double result  = Integer.parseInt(num1) / IntNum2;
                        Toast.makeText(getApplicationContext(),
                                "나누기 계산 결과는 "+ (int)result +" 입니다.",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }





            }
        });

    }
    boolean test(String num1,String num2){
        if(num1.getBytes().length==0||num2.getBytes().length==0){
            return false;
        }else{
            return true;
        }
    }
}
