package me.vote4.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public double buffer = 0;
    public char lastOperation = '+';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView in = findViewById(R.id.textView);
        in.setText("0");

        final Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("1");
                }
                else {
                    in.setText(in.getText() + "1");
                }
            }
        });

        final Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("2");
                }
                else {
                    in.setText(in.getText() + "2");
                }
            }
        });

        final Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("3");
                }
                else {
                    in.setText(in.getText() + "3");
                }
            }
        });

        final Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("4");
                }
                else {
                    in.setText(in.getText() + "4");
                }
            }
        });

        final Button b5 = findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("5");
                }
                else {
                    in.setText(in.getText() + "5");
                }
            }
        });

        final Button b6 = findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("6");
                }
                else {
                    in.setText(in.getText() + "6");
                }
            }
        });

        final Button b7 = findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("7");
                }
                else {
                    in.setText(in.getText() + "7");
                }
            }
        });

        final Button b8 = findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("8");
                }
                else {
                    in.setText(in.getText() + "8");
                }
            }
        });

        final Button b9 = findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("9");
                }
                else {
                    in.setText(in.getText() + "9");
                }
            }
        });

        final Button b0 = findViewById(R.id.button10);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (in.getText().toString() == "0") {
                    in.setText("0");
                }
                else {
                    in.setText(in.getText() + "0");
                }
            }
        });

        final Button bComma = findViewById(R.id.button11);
        bComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!in.getText().toString().contains(".")) {
                    in.setText(in.getText() + ".");
                }
            }
        });

        final Button clear = findViewById(R.id.button21);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.setText("0");
                buffer = 0;
            }
        });

        final Button multiple = findViewById(R.id.button12);
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (lastOperation) {
                    case '+':
                        buffer += Double.parseDouble(in.getText().toString());
                        break;
                    case '-':
                        buffer -= Double.parseDouble(in.getText().toString());
                        break;
                    case '*':
                        buffer *= Double.parseDouble(in.getText().toString());
                        break;
                    case '/':
                        buffer /= Double.parseDouble(in.getText().toString());
                        break;
                }
                in.setText("0");
                lastOperation = '*';
            }
        });

        final Button add = findViewById(R.id.button13);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (lastOperation) {
                    case '+':
                        buffer += Double.parseDouble(in.getText().toString());
                        break;
                    case '-':
                        buffer -= Double.parseDouble(in.getText().toString());
                        break;
                    case '*':
                        buffer *= Double.parseDouble(in.getText().toString());
                        break;
                    case '/':
                        buffer /= Double.parseDouble(in.getText().toString());
                        break;
                }
                in.setText("0");
                lastOperation = '+';
            }
        });

        final Button minus = findViewById(R.id.button14);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (lastOperation) {
                    case '+':
                        buffer += Double.parseDouble(in.getText().toString());
                        break;
                    case '-':
                        buffer -= Double.parseDouble(in.getText().toString());
                        break;
                    case '*':
                        buffer *= Double.parseDouble(in.getText().toString());
                        break;
                    case '/':
                        buffer /= Double.parseDouble(in.getText().toString());
                        break;
                }
                in.setText("0");
                lastOperation = '-';
            }
        });

        final Button divide = findViewById(R.id.button15);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (lastOperation) {
                    case '+':
                        buffer += Double.parseDouble(in.getText().toString());
                        break;
                    case '-':
                        buffer -= Double.parseDouble(in.getText().toString());
                        break;
                    case '*':
                        buffer *= Double.parseDouble(in.getText().toString());
                        break;
                    case '/':
                        buffer /= Double.parseDouble(in.getText().toString());
                        break;
                }
                in.setText("0");
                lastOperation = '/';
            }
        });

        final Button eq = findViewById(R.id.button16);
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (lastOperation) {
                    case '+':
                        buffer += Double.parseDouble(in.getText().toString());
                        break;
                    case '-':
                        buffer -= Double.parseDouble(in.getText().toString());
                        break;
                    case '*':
                        buffer *= Double.parseDouble(in.getText().toString());
                        break;
                    case '/':
                        buffer /= Double.parseDouble(in.getText().toString());
                        break;
                }
                in.setText(String.valueOf(buffer));
                buffer = 0;
                lastOperation = '+';
            }
        });
    }

}
