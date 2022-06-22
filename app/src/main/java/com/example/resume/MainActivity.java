package com.example.resume;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationCompat;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Spinner placespinner;
    String[] placeArray = {"Gujrat", "Maharashtra", "Madhyapradesh", "Rajasthan", "Kashmir", "Keral", "Tamilnadu", "Haidrabad", "Panjab", "Hariyana"};
    EditText edtFName, edtLName, edtEmail, edtAddress, edtPhoneNumber, edtSkill, edtLanguage, edtEducation, edtAwards, edtAboutYourSelf, edtWorkExperience, edtprofession;
    AppCompatButton btnSubmit;
    String gender = "";
    String checkbox = "";
    RadioGroup radiogroup;
    CheckBox cbtravelling, cbsinging, cbreading, cbwriting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showplace();
        initview();
    }

    private void initview() {

        edtFName = findViewById(R.id.edtFName);
        edtLName = findViewById(R.id.edtLName);
        edtEmail = findViewById(R.id.edtEmail);
        edtAddress = findViewById(R.id.edtAddress);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
        edtSkill = findViewById(R.id.edtSkill);
        edtLanguage = findViewById(R.id.edtLanguage);
        edtEducation = findViewById(R.id.edtEducation);
        edtprofession = findViewById(R.id.edtprofession);
        edtAwards = findViewById(R.id.edtAwards);
        edtAboutYourSelf = findViewById(R.id.edtAboutYourSelf);
        edtWorkExperience = findViewById(R.id.edtWorkExperience);
        btnSubmit = findViewById(R.id.btnSubmit);
        cbtravelling = findViewById(R.id.cbtravelling);
        cbsinging = findViewById(R.id.cbsinging);
        cbreading = findViewById(R.id.cbreading);
        cbwriting = findViewById(R.id.cbwriting);
        radiogroup = findViewById(R.id.radiogroup);
        placespinner = findViewById(R.id.placespinner);

        /* spinner */

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, placeArray);
        placespinner.setAdapter(adapter);

        /*  On click listener */

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Spinner get value from click*/

                String placeArray = placespinner.getSelectedItem().toString();
//                Toast.makeText(MainActivity.this, "==>" + placeArray, Toast.LENGTH_SHORT).show();


                /* get value from edittext */

                checkbox = "";
                String firstName = edtFName.getText().toString();
                String lastName = edtLName.getText().toString();
                String email = edtEmail.getText().toString();
                String address = edtAddress.getText().toString();
                String phoneNumber = edtPhoneNumber.getText().toString();
                String skill = edtSkill.getText().toString();
                String language = edtLanguage.getText().toString();
                String education = edtEducation.getText().toString();
                String awards = edtAwards.getText().toString();
                String aboutYourSelf = edtAboutYourSelf.getText().toString();
                String workExperience = edtWorkExperience.getText().toString();
                String profession = edtprofession.getText().toString();

                /*Check Box*/

                if (cbtravelling.isChecked()) {
                    checkbox +=  cbtravelling.getText().toString();
                }
                if (cbsinging.isChecked()) {
                    checkbox +=  cbsinging.getText().toString();
                }
                if (cbreading.isChecked()) {
                    checkbox +=  cbreading.getText().toString();
                }
                if (cbwriting.isChecked()) {
                    checkbox +=  cbwriting.getText().toString();
                }

//                Toast.makeText(MainActivity.this, "ceckbox is =" + checkbox, Toast.LENGTH_SHORT).show();

                /* Condition check */


                if (firstName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your First Name", Toast.LENGTH_SHORT).show();
                } else if (lastName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your Last Name", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter yout Mail Id", Toast.LENGTH_SHORT).show();
                } else if (address.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your address", Toast.LENGTH_SHORT).show();
                } else if (phoneNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your Phone Number", Toast.LENGTH_SHORT).show();
                } else if (skill.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your Skill", Toast.LENGTH_SHORT).show();
                } else if (language.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Language", Toast.LENGTH_SHORT).show();
                } else if (education.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your Education", Toast.LENGTH_SHORT).show();
                } else if (profession.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your profession", Toast.LENGTH_SHORT).show();
                } else if (awards.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your Awards", Toast.LENGTH_SHORT).show();
                } else if (aboutYourSelf.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter about your self", Toast.LENGTH_SHORT).show();
                } else if (workExperience.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your work experience", Toast.LENGTH_SHORT).show();
                } else if (gender.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter your gender", Toast.LENGTH_SHORT).show();
                } else if (placeArray.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Select your state", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, resumeDesignActivity.class);
                    i.putExtra("firstName", firstName);
                    i.putExtra("lastName", lastName);
                    i.putExtra("email", email);
                    i.putExtra("address", address);
                    i.putExtra("phoneNumber", phoneNumber);
                    i.putExtra("skill", skill);
                    i.putExtra("language", language);
                    i.putExtra("education", education);
                    i.putExtra("awards", awards);
                    i.putExtra("aboutYourSelf", aboutYourSelf);
                    i.putExtra("workExperience", workExperience);
                    i.putExtra("profession", profession);
                    i.putExtra("gender", gender);
                    i.putExtra("checkbox", checkbox);
                    i.putExtra("placeArray", placeArray);
                    startActivity(i);
                }
            }
        });

        /*Gender*/

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = radiogroup.findViewById(i);
                if (radioButton.getText().equals("male")) {
                    gender = "male";
                } else if (radioButton.getText().equals("female")) {
                    gender = "female";
                } else {
                    gender = "other";
                }
            }
        });


    }

        /* Spinner */

    private void showplace() {

        placespinner = findViewById(R.id.placespinner);
        spinnerActivity adapter2 = new spinnerActivity(this, placeArray);
        placespinner.setAdapter(adapter2);

    }

    /*Alert Dialog Box*/

    public void onBackPressed() {
        AlertDialog.Builder object=new AlertDialog.Builder(MainActivity.this);
        object.setTitle("Exit Alert");
        object.setMessage("Are you sure you want to Exit?");
        object.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "yes button is clicked", Toast.LENGTH_SHORT).show();
                MainActivity.this.finish();
            }
        });

        object.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "No button is clicked", Toast.LENGTH_SHORT).show();
                dialogInterface.cancel();
            }
        });

        AlertDialog d=object.create();
        d.setCancelable(false);
        d.show();

    }

}


