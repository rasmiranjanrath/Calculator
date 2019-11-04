package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText viewHolder;
    private TextView result;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dot;
    private Button zero;
    private Button equals;
    private Button divide;
    private Button multiply;
    private Button add;
    private Button substract;
    private Button clear;
    private Button delete;

    private static String  [] operations = {"+","-","*","/"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewHolder=findViewById(R.id.editText);
        result=findViewById(R.id.infoTextView);
        one=findViewById(R.id.buttonOne);
        two=findViewById(R.id.buttonTwo);
        three=findViewById(R.id.buttonThree);
        four=findViewById(R.id.buttonFour);
        five=findViewById(R.id.buttonFive);
        six=findViewById(R.id.buttonSix);
        seven=findViewById(R.id.buttonSeven);
        eight=findViewById(R.id.buttonEight);
        nine=findViewById(R.id.buttonNine);
        dot=findViewById(R.id.buttonDot);
        zero=findViewById(R.id.buttonZero);
        equals=findViewById(R.id.buttonEqual);
        divide=findViewById(R.id.buttonDivide);
        multiply=findViewById(R.id.buttonMultiply);
        add=findViewById(R.id.buttonAdd);
        substract=findViewById(R.id.buttonSubtract);
        clear=findViewById(R.id.buttonClear);
        delete=findViewById(R.id.buttonDelete);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('1');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('2');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('3');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('4');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('5');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('6');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('7');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('8');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('9');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('0');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                char dot =viewHolderBuilder.charAt(viewHolderBuilder.length()-1);
                if(dot != '.'){
                    viewHolderBuilder.append('.');
                }
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('+');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('-');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('*');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder viewHolderBuilder= new StringBuilder(viewHolder.getText().toString());
                viewHolderBuilder.append('/');
                viewHolder.setText(viewHolderBuilder.toString());
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=viewHolder.getText().toString();
                try{
                    Double finalResult = compute(data);
                    result.setText(finalResult.toString());
                    result.setTextColor(getResources().getColor(R.color.colorPrimary));
                }catch(Exception e){
                    result.setText("Invalid Expression");
                    result.setTextColor(getResources().getColor(R.color.Red));
                }


            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String viewData =viewHolder.getText().toString();
                viewHolder.setText((viewData == null || viewData.length()==0) ? "" :viewData.replaceAll(".$", ""));

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewHolder.setText("");
                result.setText("");
            }
        });
    }
    static double compute(String equation) throws  Exception{
        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }


}
