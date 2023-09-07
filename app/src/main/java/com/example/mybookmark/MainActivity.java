package com.example.mybookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mybookmark.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;    //멤버변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //뷰페이저가 프레그먼트 3개와 연결하고자한다.



        //수정
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();

        //여기에 내용을 추가 수정 삭제할때마다



    }
}