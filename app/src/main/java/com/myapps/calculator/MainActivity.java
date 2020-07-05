package com.myapps.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

        //Declaration Button
        Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
        Button btnA, btnE, btnS;
        TextView msg;
        CharSequence displayText="", firstNumber = "", secondNumber = "", operationCurrent = "";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //Intialization Button

            btn0 = (Button) findViewById(R.id.btn0);
            btn0.setOnClickListener(MainActivity.this);

            btn1 = (Button) findViewById(R.id.btn1);
            btn1.setOnClickListener(MainActivity.this);

            btn2 = (Button) findViewById(R.id.btn2);
            btn2.setOnClickListener(MainActivity.this);

            btn3 = (Button) findViewById(R.id.btn3);
            btn3.setOnClickListener(MainActivity.this);

            btn4 = (Button) findViewById(R.id.btn4);
            btn4.setOnClickListener(MainActivity.this);

            btn5 = (Button) findViewById(R.id.btn5);
            btn5.setOnClickListener(MainActivity.this);

            btn6 = (Button) findViewById(R.id.btn6);
            btn6.setOnClickListener(MainActivity.this);

            btn7 = (Button) findViewById(R.id.btn7);
            btn7.setOnClickListener(MainActivity.this);

            btn8 = (Button) findViewById(R.id.btn8);
            btn8.setOnClickListener(MainActivity.this);

            btn9 = (Button) findViewById(R.id.btn9);
            btn9.setOnClickListener(MainActivity.this);

            btnA = (Button) findViewById(R.id.btnA);
            btnA.setOnClickListener(MainActivity.this);

            btnS = (Button) findViewById(R.id.btnS);
            btnS.setOnClickListener(MainActivity.this);

            btnE = (Button) findViewById(R.id.btnE);
            btnE.setOnClickListener(MainActivity.this);

            msg = (TextView) findViewById(R.id.editTextDisplay) ;
            msg.setText(displayText);
            //Here MainActivity.this is a Current Class Reference (context)
        }

        @Override
        public void onClick(View v) {
            displayText = msg.getText();
            if(v == btn0)
                displayText = displayText + "0";
            else if(v == btn1)
                displayText = displayText + "1";
            else if(v == btn2)
                displayText = displayText + "2";
            else if(v == btn3)
                displayText = displayText + "3";
            else if(v == btn4)
                displayText = displayText + "4";
            else if(v == btn5)
                displayText = displayText + "5";
            else if(v == btn6)
                displayText = displayText + "6";
            else if(v == btn7)
                displayText = displayText + "7";
            else if(v == btn8)
                displayText = displayText + "8";
            else if(v == btn9)
                displayText = displayText + "9";
            else if(v == btnA) {
                firstNumber = displayText;
                displayText = "";
                operationCurrent = "Add";
            }
            else if(v == btnS) {
                firstNumber = displayText;
                displayText = "";
                operationCurrent = "Sub";
            }
            else if(v == btnE){
                secondNumber = displayText;
                double firstN = Double.parseDouble(firstNumber.toString());
                double secondN = Double.parseDouble(secondNumber.toString());
                double resultN = 0.0;
                if(operationCurrent == "Add")
                    resultN = firstN + secondN;
                if(operationCurrent == "Sub")
                    resultN = firstN - secondN;

                displayText = Double.toString(resultN);
                operationCurrent = "";
                firstNumber = "";
                secondNumber = "";
            }

            msg.setText(displayText);
            return;
        }
}
