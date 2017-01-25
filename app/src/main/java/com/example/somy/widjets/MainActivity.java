package com.example.somy.widjets;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnGrid;
    Button Calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1. 위젯을 선언한다.

        setContentView(R.layout.activity_main);

        //2. 선언된 위젯변수에 xml의 위젯 id를 가져와서 담아준다.
        btnGrid = (Button) findViewById(R.id.grid);
        Calculator = (Button) findViewById(R.id.Calculator);

        //3. 변수(위젯)을 리스너에 달아준다
        btnGrid.setOnClickListener(this);
        Calculator.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.grid:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent 를 통해서 로드할 컴포넌트를 지정해야한다.
                intent = new Intent(this, GridActivity.class);
                                            // ^ 대상이되는 컴포넌트
                startActivity(intent);
                //이 과정을 통해 내가 원하는 컴포넌트를 여기로 끌어올 수 있음
                break;
            case R.id.Calculator:
                intent = new Intent(this, WidgetActivity.class);
                startActivity(intent);
                break;

        }
    }
}
