package com.wyhand.calculator;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String inf = "";//存储text中保存内容
    private TextView textView;
    private Tool to = new Tool();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = (TextView)this.findViewById(R.id.textView);
        this.textView.setText(this.inf);//编辑框显示的内容和inf一致
    }

    public void onButtonClick(View v){
        try {
            int id = v.getId();
            if (id == R.id.actone) {//切换activity到进制转换
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,secondactivity.class);//setClass(this,classname)跳转
                startActivity(intent);
                //MainActivity.this.finish();//结束当前的activity
            }else if (id == R.id.acttwo) {//切换activity到单位换算
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,thirdactivity.class);
                startActivity(intent);
                //MainActivity.this.finish();//结束当前的activity
            } else if (id == R.id.one) {
                this.inf = this.inf + "1";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.two) {
                this.inf = this.inf + "2";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.three) {
                this.inf = this.inf + "3";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.four) {
                this.inf = this.inf + "4";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.five) {
                this.inf = this.inf + "5";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.six) {
                this.inf = this.inf + "6";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.seven) {
                this.inf = this.inf + "7";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.eight) {
                this.inf = this.inf + "8";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.nine) {
                this.inf = this.inf + "9";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.zero) {
                this.inf = this.inf + "0";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.add) {
                if (to.check(this.inf)) {
                    this.inf = this.inf + "+";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.reduce) {
                if (to.check(this.inf)) {
                    this.inf = this.inf + "-";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.multiply) {
                if (to.check(this.inf)) {
                    this.inf = this.inf + "×";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.divide) {
                if (to.check(this.inf)) {
                    this.inf = this.inf + "÷";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.clear) {
                this.inf = "";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if (id == R.id.back) {
                if (this.inf.length() != 0) {
                    this.inf = this.inf.substring(0, this.inf.length() - 1);//开始截取位置,
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.point) {
                if (to.check(this.inf)) {
                    this.inf = this.inf + ".";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.openparen) {
                if (to.check2(this.inf)) {
                    this.inf = this.inf + "(";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            }else if (id == R.id.closeparen) {
                if (to.check2(this.inf)) {
                    this.inf = this.inf + ")";
                    this.textView.setText(this.inf);//
                }
            } else if(id == R.id.sin) {
                this.inf = this.inf + "sin(";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if(id == R.id.cos) {
                this.inf = this.inf + "cos(";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if(id == R.id.log) {
                this.inf = this.inf + "log(";
                this.textView.setText(this.inf);//修改TextView的text值
            } else if(id == R.id.powerof) {
                if (to.check(this.inf)) {
                    this.inf = this.inf + "^";
                    this.textView.setText(this.inf);//修改TextView的text值
                }
            } else if (id == R.id.equal) {
                Calculator cl = new Calculator();
                this.inf = cl.calculate(this.inf) + "";//调用Calculator对inf显示的算术表达式进行计算
                this.textView.setText(this.inf);//修改TextView的text值，显示运行结果
            }
        }catch(Exception e){
            this.inf = "Input Error";
            this.textView.setText(this.inf);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.i("dayang","打开Menu时执行该方法");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 这条表示加载菜单文件，第一个参数表示通过那个资源文件来创建菜单
        // 第二个表示将菜单传入那个对象中。这里我们用Menu传入menu
        // 这条语句一般系统帮我们创建好
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // 菜单的监听方法
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.helpMenu){
            Toast.makeText(MainActivity.this, "这是帮助", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

}
