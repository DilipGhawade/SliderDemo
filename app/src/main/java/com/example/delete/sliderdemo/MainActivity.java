package com.example.delete.sliderdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;



public class MainActivity extends AppCompatActivity {
    CustomAdapter adapter;
    ViewPager viewPager;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //for removing notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomAdapter(this);
        viewPager.setAdapter(adapter);
        imageView = (ImageView) findViewById(R.id.img_view);
        Timer tm = new Timer();
        tm.scheduleAtFixedRate(new MyTimer(),5000,2000);
    }

    public class MyTimer extends TimerTask {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                   if (viewPager.getCurrentItem()==0)
                   {
                       viewPager.setCurrentItem(1);
                   }
                    else if (viewPager.getCurrentItem()==1)
                   {
                       viewPager.setCurrentItem(2);
                   }
                    else if (viewPager.getCurrentItem()==2)
                   {
                       viewPager.setCurrentItem(3);
                   }
                    else if (viewPager.getCurrentItem()==3)
                   {
                       viewPager.setCurrentItem(4);
                   }
                    else if (viewPager.getCurrentItem()==4)
                   {
                       viewPager.setCurrentItem(5);
                   }
                    else if (viewPager.getCurrentItem()==5)
                   {
                       viewPager.setCurrentItem(6);
                   }
                   else if (viewPager.getCurrentItem()==6)
                   {
                       viewPager.setCurrentItem(7);
                   }
                    else {
                       viewPager.setCurrentItem(0);
                   }
                }
            });
        }
    }
}

