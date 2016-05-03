package com.example.llw.demo_android_xml;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.InputStream;
import java.util.List;

import entity.Student;
import pareserBypull.Pareserpull;

public class MainActivity extends AppCompatActivity {
    private TextView textviewshow;

    private void assignViews() {
        textviewshow = (TextView) findViewById(R.id.textviewshow);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();


        AssetManager asset = getAssets();
        try {
            InputStream input = asset.open("student.xml");
            List<Student> list = Pareserpull.getStudents(input);
            for (Student stu : list) {
                Log.e("StudentInfo", "Person ID: " + stu.getId() + ","
                        + stu.getName() + ", " + stu.getAge() + ", "
                        + stu.getSex());
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


}
