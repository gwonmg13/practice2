package kr.soen.practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    Button b8;               //버튼 객체를 생성. ﻿﻿﻿﻿
    EditText e7,e8, e10;     //입력창 객체를 생성. ﻿
    CheckBox ch1;            //체크박스 버튼 객체를 생성. ﻿﻿﻿
    TextView t11, t13;       //텍스트뷰 객체를 생성. ﻿﻿



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 주문");    // 화면 맨위 title을 지정.
        init();                    //초기화 함수 호출. ﻿﻿﻿﻿﻿
    }
    void init(){
        e7 = (EditText)findViewById(R.id.editText7);
        e8 = (EditText)findViewById(R.id.editText8);
        e10 = (EditText)findViewById(R.id.editText10);
        ch1 = (CheckBox)findViewById(R.id.checkBox);
        b8 = (Button)findViewById(R.id.button8);
        t11 = (TextView)findViewById(R.id.textView11);
        t13 = (TextView)findViewById(R.id.textView13);

        //각각 뷰단의 아이디 값 속성을 불러옴.

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String pizza = e7.getText().toString();
                String spagetti = e8.getText().toString();
                String salad = e10.getText().toString();
                //입력창에 입력된 값을 받아서 변수에 저장. ﻿﻿﻿

                int pizzaCount,spagettiCount,saladCount;


                if(pizza.getBytes().length==0) {
                    pizzaCount = 0;
                }else{
                    pizzaCount =Integer.parseInt(pizza);
                }
                if(spagetti.getBytes().length==0){
                    spagettiCount = 0;
                }else{
                    spagettiCount = Integer.parseInt(spagetti);
                }
                if(salad.getBytes().length==0){
                    saladCount = 0;
                }else{
                    saladCount = Integer.parseInt(salad);
                }

                int count = pizzaCount + spagettiCount + saladCount;
                //입력된 메뉴 개수를 모두 더합니다. ﻿﻿﻿﻿﻿
                double result;

                if(ch1.isChecked() == true){
                    //체크박스의 체크 여부를 확인.
                    //체크가 되어있다면 할인 계산을 적용.
                    result = (pizzaCount * 15000) +
                            (spagettiCount * 13000) +
                            (saladCount* 9000);
                    result = result - (result * 0.1);

                }else{
                    result = (pizzaCount * 15000) +
                            (spagettiCount * 13000) +
                            (saladCount* 9000);
                }
                /*//먼저 화면에 결과를 띄우기 전에 Toast 값이 제대로 출력되는지 확인.
                Toast.makeText(getApplicationContext(),
                        "총 금액은 " + (int)result + "입니다.",
                        Toast.LENGTH_SHORT).show();*/
                t11.setText(String.valueOf(count+"개"));
                t13.setText(String.valueOf((int)result+"원"));

            }
        });
    }
}
