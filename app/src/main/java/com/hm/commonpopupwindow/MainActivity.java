package com.hm.commonpopupwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.id_pushpop);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CommonPopupWindow popupWindow = new CommonPopupWindow.Builder(MainActivity.this)
                        .setView(R.layout.simple_item)
                        .setBackGroundLevel(0.5f)
                        .setAnimationStyle(R.style.AnimHorizontal)
                        .setWidthAndHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 150, MainActivity.this.getResources().getDisplayMetrics()),
                                150)
                        .setOutSideTouchable(true).create();
                popupWindow.showAsDropDown(mButton);
            }
        });
    }
}
