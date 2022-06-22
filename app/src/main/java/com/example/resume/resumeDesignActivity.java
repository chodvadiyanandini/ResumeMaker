package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class resumeDesignActivity extends AppCompatActivity {

    TextView txtfname, txtlname, txtemail, txtaddress, txtphone, txtskill, txtlanguage, txteducation, txtawards, txtself, txtwork, txtprofession,txtgender,txtcheckbox,txtplaceArray;
    String fname, lname, email, address, phone, skill, language, education, awards, self, work, profession,gender,checkbox,placeArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_design);

        txtfname = findViewById(R.id.txtfname);
        txtlname = findViewById(R.id.txtlname);
        txtemail = findViewById(R.id.txtemail);
        txtaddress = findViewById(R.id.txtaddress);
        txtphone = findViewById(R.id.txtphone);
        txtskill = findViewById(R.id.txtskill);
        txtlanguage = findViewById(R.id.txtlanguage);
        txteducation = findViewById(R.id.txteducation);
        txtawards = findViewById(R.id.txtawards);
        txtself = findViewById(R.id.txtself);
        txtwork = findViewById(R.id.txtwork);
        txtprofession = findViewById(R.id.txtprofession);
        txtgender = findViewById(R.id.txtgender);
        txtcheckbox = findViewById(R.id.txtcheckbox);
        txtplaceArray = findViewById(R.id.txtplaceArray);

        if (getIntent() != null) {
            fname = getIntent().getStringExtra("firstName");
            lname = getIntent().getStringExtra("lastName");
            email = getIntent().getStringExtra("email");
            address = getIntent().getStringExtra("address");
            phone = getIntent().getStringExtra("phoneNumber");
            skill = getIntent().getStringExtra("skill");
            language = getIntent().getStringExtra("language");
            education = getIntent().getStringExtra("education");
            awards = getIntent().getStringExtra("awards");
            self = getIntent().getStringExtra("aboutYourSelf");
            work = getIntent().getStringExtra("workExperience");
            profession = getIntent().getStringExtra("profession");
            gender = getIntent().getStringExtra("gender");
            checkbox = getIntent().getStringExtra("checkbox");
            placeArray = getIntent().getStringExtra("placeArray");


            txtfname.setText(fname);
            txtlname.setText(lname);
            txtemail.setText(email);
            txtaddress.setText(address);
            txtphone.setText(phone);
            txtskill.setText(skill);
            txtlanguage.setText(language);
            txteducation.setText(education);
            txtawards.setText(awards);
            txtself.setText(self);
            txtwork.setText(work);
            txtprofession.setText(profession);
            txtgender.setText(gender);
            txtcheckbox.setText(checkbox);
            txtplaceArray.setText(placeArray);
        }
    }
}