package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final char ADDTION = '+';
    private static final char SUSTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char PERCENT = '%';

    private char currentSymbol;

    private double firstValue = Double.NaN;
    private double secondValue;
    private TextView inputDisplay, outputDisplay;
    private DecimalFormat decimalFormat;
    private MaterialButton button0,
            button1,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            buttonDot,
            buttonAdd,
            buttonSub,
            buttonMultiply,
            buttonDivide,
            buttonPercent,
            buttonClear,
            buttonOFF,
            buttonEqual;


@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    decimalFormat = new DecimalFormat("#.############");

    inputDisplay = findViewById(R.id.input);
    outputDisplay = findViewById(R.id.output);

    button0 = findViewById(R.id.btn0);
    button1 = findViewById(R.id.btn1);
    button2 = findViewById(R.id.btn2);
    button3 = findViewById(R.id.btn3);
    button4 = findViewById(R.id.btn4);
    button5 = findViewById(R.id.btn5);
    button6 = findViewById(R.id.btn6);
    button7 = findViewById(R.id.btn7);
    button8 = findViewById(R.id.btn8);
    button9 = findViewById(R.id.btn9);

    buttonAdd = findViewById(R.id.add);
    buttonSub = findViewById(R.id.subtract);
    buttonDivide = findViewById(R.id.division);
    buttonDot = findViewById(R.id.btnPoint);
    buttonMultiply = findViewById(R.id.multiply);
    buttonClear = findViewById(R.id.clear);
    buttonOFF = findViewById(R.id.off);
    buttonEqual = findViewById(R.id.equal);
    buttonPercent = findViewById(R.id.percent);

}
}