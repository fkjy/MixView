package com.example.mixview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**简单图片浏览器*/

public class MainActivity extends AppCompatActivity {

    //定义一个访问图片的数组
    private int[] images = new int[]{
            R.drawable.java,
            R.drawable.ajax,
            R.drawable.html,
            R.drawable.javaee,
            R.drawable.swift,
    };
    private int currentImg = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
       /* //获取LinearLayout布局容器
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        //程序创建ImageView 组件
        final ImageView imageView = new ImageView(MainActivity.this);
        //将ImageView组件添加到LinearLayout布局容器中
        layout.addView(imageView);*/

        imageView = (ImageView) findViewById(R.id.image);

        //初始化时显示第一张图片
        imageView.setImageResource(images[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //改变ImageView组件显示的图片
                imageView.setImageResource(images[++currentImg % images.length]);
            }
        });
    }
}
