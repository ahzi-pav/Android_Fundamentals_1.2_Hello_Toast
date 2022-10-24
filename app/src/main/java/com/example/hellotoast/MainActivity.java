package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;
    private TextView mShowCount;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);

        count = 0;
    }

    public void showToast(View view) {
        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(this, R.string.tost_message_text, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        count++;
        mShowCount.setText(String.valueOf(count));
    }
}