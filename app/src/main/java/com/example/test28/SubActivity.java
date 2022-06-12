package com.example.test28;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        Button Btn2= findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("태그","값");//print라 볼 수 있다. test를 할 수 있다. 로그캣에 글자가 뜬다.
            }
        });

        findViewById(R.id.Btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubActivity.this,MainActivity.class));
            }//activity를 실행해라 뭐냐면, new intent로 받아서 subactivity.this에 mainactivity 호출
            //intent는 화면을 전환할때 데이터를 넘겨줄 수 있음
        });
    }
    public void Btn1Click(View v){//View v매개변수를 받아야..
        Toast toast = Toast.makeText(this, "ㅇㅇ", Toast.LENGTH_LONG);//Btn1Click버튼 클릭시 동작
        //toast.setGravity(Gravity.END | Gravity.BOTTOM,10,10);
        //문구가 뜰 위치를 정한다. end는 오른쪽 끝 bottom은 아래 끝, offset은 가에로부터 얼마나 간격을 둘지
        //이게 이제 더이상 작동하지 않는 듯하다. 맞춤형 알림 불가능!!!
        toast.show();
    }
}
