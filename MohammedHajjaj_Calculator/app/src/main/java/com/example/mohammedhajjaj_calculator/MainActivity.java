package com.example.mohammedhajjaj_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Show;
    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9;
    Button dev,multi,min,sum,Result,Clear;


    char x;
    String msg,Fullnumber;
    double number,fnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Show=findViewById(R.id.Show);
        num0=findViewById(R.id.num0);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6=findViewById(R.id.num6);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);

        dev=findViewById(R.id.dev);
        multi=findViewById(R.id.multi);
        min=findViewById(R.id.min);
        sum=findViewById(R.id.sum);
        Result=findViewById(R.id.Result);
        Clear=findViewById(R.id.Clear);


        Fullnumber="";

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="0";
                Show.setText(Show.getText()+msg);
                Fullnumber+='0';
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="1";
                Show.setText(Show.getText()+msg);
                Fullnumber+='1';
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="2";
                Show.setText(Show.getText()+msg);
                Fullnumber+='2';
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="3";
                Show.setText(Show.getText()+msg);
                Fullnumber+='3';
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="4";
                Show.setText(Show.getText()+msg);
                Fullnumber+='4';
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="5";
                Show.setText(Show.getText()+msg);
                Fullnumber+='5';
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="6";
                Show.setText(Show.getText()+msg);
                Fullnumber+='6';
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="7";
                Show.setText(Show.getText()+msg);
                Fullnumber+='7';
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="8";
                Show.setText(Show.getText()+msg);
                Fullnumber+='8';
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg="9";
                Show.setText(Show.getText()+msg);
                Fullnumber+='9';
            }
        });


        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x='/';
                Show.setText(Show.getText() + "/");
                number=Double.parseDouble(Fullnumber);
                Fullnumber="";
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x='*';
                Show.setText(Show.getText() + "*");
                number=Double.parseDouble(Fullnumber);
                Fullnumber="";

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x='-';
                Show.setText(Show.getText() + "-");
                number=Double.parseDouble(Fullnumber);
                Fullnumber="";

            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x='+';
                Show.setText(Show.getText() + "+");
                number=Double.parseDouble(Fullnumber);
                Fullnumber="";

            }
        });

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x=='/'){

                   fnum=number/Double.parseDouble(Fullnumber);
                   Show.setText(""+fnum);
                }else if (x=='*'){

                    fnum=number*Double.parseDouble(Fullnumber);;
                    Show.setText(""+fnum);

                }else if (x=='-'){

                    fnum=number-Double.parseDouble(Fullnumber);;
                    Show.setText(""+fnum);

                }else if (x=='+'){

                    fnum=number+Double.parseDouble(Fullnumber);;
                    Show.setText(""+fnum);

                }



            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x='\0';
                msg="";
                Fullnumber="";
                number=0.00;
                fnum=0.00;
                Show.setText("");
            }
        });



    }



}

