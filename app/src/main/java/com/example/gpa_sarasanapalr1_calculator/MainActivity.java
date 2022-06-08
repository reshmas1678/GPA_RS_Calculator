package com.example.gpa_sarasanapalr1_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    Button compute;
    EditText course1, course2, course3, course4, course5, avg;
    double n1, n2, n3, n4, n5,n6;
    Boolean isFieldsNotEmpty = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.linearlayout);
        course1 = (EditText) findViewById(R.id.editTextTextPersonName);
        course2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        course3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        course4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        course5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        avg = (EditText) findViewById(R.id.editTextTextPersonName7);
        compute = (Button) findViewById(R.id.button);


        //Compute Gpa Button Click
        compute.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(compute.getText().equals("Compute GPA")) {
                    isFieldsNotEmpty = checkAllFields();
                    if (isFieldsNotEmpty) {
                        n1 = Double.parseDouble(course1.getText().toString());
                        n2 = Double.parseDouble(course2.getText().toString());
                        n3 = Double.parseDouble(course3.getText().toString());
                        n4 = Double.parseDouble(course4.getText().toString());
                        n5 = Double.parseDouble(course5.getText().toString());
                        avg.setText((n1 + n2 + n3 + n4 + n5) / 5 + "");
                        n6 = Double.parseDouble(avg.getText().toString());

                        if (n6 < 2.4) {
                            mConstraintLayout.setBackgroundColor(Color.RED);
                        } else if (n6 >= 2.44 && n6 <= 3.16) {
                            mConstraintLayout.setBackgroundColor(Color.YELLOW);
                        } else if (n6 >= 3.2 && n6 <= 4) {
                            mConstraintLayout.setBackgroundColor(Color.GREEN);
                        } else {
                            mConstraintLayout.setBackgroundColor(Color.GRAY);
                        }
                        compute.setText("Clear Form");
                    } else {
                        mConstraintLayout.setBackgroundColor(Color.GRAY);
                        compute.setText("Compute GPA");
                    }
                } else {
                    course1.setText("");
                    course2.setText("");
                    course3.setText("");
                    course4.setText("");
                    course5.setText("");
                    avg.setText("");
                    compute.setText("Compute GPA");
                    mConstraintLayout.setBackgroundColor(Color.GRAY);
                }
            }
        });


        //Setting back the compute button to 'Compute GPA'
        course1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count > 0)
                    compute.setText("Compute GPA");
                mConstraintLayout.setBackgroundColor(Color.WHITE);
                avg.setText("");



            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        //Setting back the compute button to 'Compute GPA'
        course2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count > 0)
                    compute.setText("Compute GPA");
                mConstraintLayout.setBackgroundColor(Color.WHITE);
                avg.setText("");

            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        //Setting back the compute button to 'Compute GPA'
        course3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count > 0)
                    compute.setText("Compute GPA");
                mConstraintLayout.setBackgroundColor(Color.WHITE);
                avg.setText("");

            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        //Setting back the compute button to 'Compute GPA'
        course4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count > 0)
                    compute.setText("Compute GPA");
                mConstraintLayout.setBackgroundColor(Color.WHITE);
                avg.setText("");

            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        //Setting back the compute button to 'Compute GPA'
        course5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count > 0)
                    compute.setText("Compute GPA");
                mConstraintLayout.setBackgroundColor(Color.WHITE);
                avg.setText("");

            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private Boolean checkAllFields() {
        boolean fieldValidationFlag = true;

        if (course1.length() == 0) {
            course1.setError("This Field is Required");
            fieldValidationFlag = false;
        } else if (checkIfGpaIsValid(course1)){
            course1.setError("GPA should be between 0 and 4");
            fieldValidationFlag = false;
            course1.setTextColor(Color.RED);
        } else {
            course1.setTextColor(Color.BLACK);

        }

        if (course2.length() == 0) {
            course2.setError("This Field is Required");
            fieldValidationFlag = false;
        } else if (checkIfGpaIsValid(course2)){
            course2.setError("GPA should be between 0 and 4");
            fieldValidationFlag = false;
        }

        if (course3.length() == 0) {
            course3.setError("This Field is Required");
            fieldValidationFlag = false;
        } else if (checkIfGpaIsValid(course3)){
            course3.setError("GPA should be between 0 and 4");
            fieldValidationFlag = false;
        }


        if (course4.length() == 0) {
            course4.setError("This Field is Required");
            fieldValidationFlag = false;
        } else if (checkIfGpaIsValid(course4)){
            course4.setError("GPA should be between 0 and 4");
            fieldValidationFlag = false;
        }

        if (course5.length() == 0) {
            course5.setError("This Field is Required");
            fieldValidationFlag = false;
        } else if (checkIfGpaIsValid(course5)){
            course5.setError("GPA should be between 0 and 4");
            fieldValidationFlag = false;
        }

        return fieldValidationFlag;
    }

    private boolean checkIfGpaIsValid(EditText courseGpa){
        double courseGapInDouble = Double.parseDouble(courseGpa.getText().toString());
        if(!(courseGapInDouble >=0 && courseGapInDouble <=4)){
            return true;
        }
        return false;
    }

}