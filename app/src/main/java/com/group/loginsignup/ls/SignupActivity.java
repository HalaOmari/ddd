package com.group.loginsignup.ls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private EditText etName1;
    private EditText etUserName1;
    private EditText etpassword1;
    private EditText etConfirmePassword1;
    private Button btnSignup1;
    private UserDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etName1=(EditText)findViewById(R.id.etName1);
        etUserName1=(EditText)findViewById(R.id.etuserName1);
        etpassword1=(EditText)findViewById(R.id.etPassword1);
        etConfirmePassword1=(EditText)findViewById(R.id.etConfirmePassword1);
        btnSignup1=(Button)findViewById(R.id.btnSignup1);
        db= new UserDB(this);
    }

    public void creatUser(View view){

        String name=etName1.getText().toString();
        String username=etUserName1.getText().toString();
        String password=etpassword1.getText().toString();
        String confirmpassword=etConfirmePassword1.getText().toString();

        User user=db.getUser(username);
        if (user!= null)
        {
            Toast.makeText(this,"User already exists!",Toast.LENGTH_LONG).show();
            return;
        }

        if (password.equals(confirmpassword))
        {
            user=new User();
            user.setName(name);
            user.setUsername(username);
            user.setPassword(password);
            db.addUser(user);

            Toast.makeText(this,"User succesfully registered registered!",Toast.LENGTH_LONG).show();
        }


       /* if (password.equals(etConfirmePassword1))
            {
               user= new User (name,username,password)
            }
        else
            {
              Toast.makeText(context: this,text:"passwords is not equal",Toast.LENGTH_LONG).show();
            }*/



    }
}
