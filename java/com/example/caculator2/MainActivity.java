package com.example.caculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    final  double MAX=9999999999999.0;
    boolean first = true, second = false, add = false, sub = false, divide = false, mul = false;
    EditText edt;
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub, btnDivide, btnX, btnResult, btnPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edt);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
        edt.setTypeface(typeface);
        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btnAdd).setOnClickListener(this);
        findViewById(R.id.btnSub).setOnClickListener(this);
        findViewById(R.id.btnX).setOnClickListener(this);
        findViewById(R.id.btnDivide).setOnClickListener(this);
        findViewById(R.id.btnResult).setOnClickListener(this);
        findViewById(R.id.btnPoint).setOnClickListener(this);
        findViewById(R.id.btnCE).setOnClickListener(this);
        findViewById(R.id.btnC).setOnClickListener(this);
        findViewById(R.id.btnBS).setOnClickListener(this);
        findViewById(R.id.btnneg).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        //if(Integer.parseInt(edt.getText().toString())==0)
        //s1.deleteCharAt(0);
        //nhap du lieu
        if (!second) {
            if ((id == R.id.btn0)) {
                s1.append('0');
                edt.setText(s1.toString());
            } else if (id == R.id.btn1) {
                s1.append('1');
                edt.setText(s1.toString());
            } else if (id == R.id.btn2) {
                s1.append('2');
                edt.setText(s1.toString());
            } else if (id == R.id.btn3) {
                s1.append('3');
                edt.setText(s1.toString());
            } else if (id == R.id.btn4) {
                s1.append('4');
                edt.setText(s1.toString());
            } else if (id == R.id.btn5) {
                s1.append('5');
                edt.setText(s1.toString());
            } else if (id == R.id.btn6) {
                s1.append('6');
                edt.setText(s1.toString());
            } else if (id == R.id.btn7) {
                s1.append('7');
                edt.setText(s1.toString());
            } else if (id == R.id.btn8) {
                s1.append('8');
                edt.setText(s1.toString());
            } else if (id == R.id.btn9) {
                s1.append('9');
                edt.setText(s1.toString());
            } else if (id == R.id.btnPoint) {
                s1.append('.');
                edt.setText(s1.toString());
            }else if (id == R.id.btnneg) {
                s1.append('-');
                edt.setText(s1.toString());
            }

        } else {
            if (id == R.id.btn0) {
                s2.append('0');
                edt.setText(s2.toString());
            } else if (id == R.id.btn1) {
                s2.append('1');
                edt.setText(s2.toString());
            } else if (id == R.id.btn2) {
                s2.append('2');
                edt.setText(s2.toString());
            } else if (id == R.id.btn3) {
                s2.append('3');
                edt.setText(s2.toString());
            } else if (id == R.id.btn4) {
                s2.append('4');
                edt.setText(s2.toString());
            } else if (id == R.id.btn5) {
                s2.append('5');
                edt.setText(s2.toString());
            } else if (id == R.id.btn6) {
                s2.append('6');
                edt.setText(s2.toString());
            } else if (id == R.id.btn7) {
                s2.append('7');
                edt.setText(s2.toString());
            } else if (id == R.id.btn8) {
                s2.append('8');
                edt.setText(s2.toString());
            } else if (id == R.id.btn9) {
                s2.append('9');
                edt.setText(s2.toString());
            } else if (id == R.id.btnPoint) {
                s2.append('.');
                edt.setText(s2.toString());
            }else if (id == R.id.btnneg) {
                s2.append('-');
                edt.setText(s2.toString());
            }
        }
        if (!s1.equals("")&&!second) {
            if (id == R.id.btnAdd) {
                add = true;
                sub = false;
                divide = false;
                mul = false;
                second = true;
            } else if (id == R.id.btnSub) {
                sub = true;
                add = false;
                divide = false;
                mul = false;
                second = true;
            } else if (id == R.id.btnDivide) {
                divide = true;
                add = false;
                sub = false;
                mul = false;
                second = true;
            } else if (id == R.id.btnX) {
                mul = true;
                add = false;
                sub = false;
                divide = false;
                second = true;
            }
        }
        //phim CE
        if (id == R.id.btnCE) {
            if (!second) {
                s1.delete(0, s1.length());
                edt.setText(s1.toString());
            } else {
                s2.delete(0, s2.length());
                edt.setText(s2.toString());
            }
        }
        //phims BS
        if (id == R.id.btnBS) {
            if (!second) {
                if (!s1.toString().equals("")) {
                    s1.deleteCharAt(s1.length() - 1);
                    edt.setText(s1);
                }
            } else {
                if (!s2.toString().equals("")) {
                    s2.deleteCharAt(s1.length() - 1);
                    edt.setText(s2);
                }
            }



        }
        //phim =
        if (id == R.id.btnResult) {
            if(!s1.toString().equals("")&&!s2.toString().equals("")) {
                double operand1 = Double.parseDouble(s1.toString());
                double operand2 = Double.parseDouble(s2.toString());
                double result = 0.0;
                if (second) {
                    if (add) result = operand1 + operand2;
                    else if (sub) result = operand1 - operand2;
                    else if (mul) result = operand1 * operand2;
                    else if (divide) result = operand1 / operand2;
                    if(result>MAX){
                        edt.setText("out of range");
                    }else {
                        StringBuilder s = new StringBuilder(Double.toString(result));
                        if (s.length() > 13) s.delete(13, s.length());
                        edt.setText(s.toString());
                        s1.delete(0, s1.length());
                        s2.delete(0, s2.length());
                        second = false;
                    }
                }
            }



        }
        //phim c
        if(id==R.id.btnC){
            second=false;
            s1.delete(0, s1.length());
            s2.delete(0, s2.length());
            edt.setText("");
        }
    }
}
