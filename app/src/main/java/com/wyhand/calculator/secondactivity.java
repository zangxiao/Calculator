package com.wyhand.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class secondactivity extends AppCompatActivity {
    private String inf = "";//存储text1中显示内容
    private String ans = "output";//存储text2中显示内容
    private EditText editText;
    private TextView textView2;
    private Tool to = new Tool();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        this.editText = (EditText)findViewById(R.id.text1);//存储text1中输入内容
        this.textView2 = (TextView)findViewById(R.id.text2);
        this.textView2.setText(this.ans);
    }

    public void onButtonClick2(View v){
        String str1 = editText.getText().toString();
        System.out.println("输入结果为" + str1);
        try {
            Conversion con = new Conversion();
            int id = v.getId();
            if (id == R.id.Binary) {
                this.textView2.setText(con.TentoEr(Integer.valueOf(str1)));//修改TextView的text值，显示运行结果
            } else if (id == R.id.Octal) {
                this.ans = con.TentoEi(Integer.valueOf(str1)) + "";//调用Conversion对inf显示的算术表达式进行计算
                this.textView2.setText(this.ans);//修改TextView的text值，显示运行结果
            } else if (id == R.id.Decimal) {
                this.ans = con.TentoTe(Integer.valueOf(str1)) + "";//调用Conversion对inf显示的算术表达式进行计算
                this.textView2.setText(this.ans);//修改TextView的text值，显示运行结果
            } else if (id == R.id.Hexadecimal) {
                this.ans = con.TentoNi(Integer.valueOf(str1)) + "";//调用Conversion对inf显示的算术表达式进行计算
                this.textView2.setText(this.ans);//修改TextView的text值，显示运行结果
            }
        }catch(Exception e){
            this.inf = "Input Error";
        }
    }

}