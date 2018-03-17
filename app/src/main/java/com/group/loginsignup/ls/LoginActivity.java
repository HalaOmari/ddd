package com.group.loginsignup.ls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUserName ;
    private EditText etpassword;
    private Button btnLogin;
    private Button btnSignup;
    private UserDB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etpassword=(EditText)findViewById(R.id.etpassword);
        etUserName=(EditText)findViewById(R.id.etUserName);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnSignup=(Button)findViewById(R.id.btnSignup);
        db= new UserDB(this);

    }

    public void checkNamePassword(View view) {

        String username=etUserName.getText().toString();
        String password=etpassword.getText().toString();

        User user= db.getUser(username);
        if (user==null)
        {
            Toast.makeText(this,"User does not exist!",Toast.LENGTH_LONG).show();
            return;
        }

        if(password.equals(user.getPassword()))
        {
            Intent i=new Intent(this,NewsFeedActivity.class);
            startActivity(i);
        }





       /* if(username.equals("admin")&&password.equals("admin"))
        {
            Intent i=new Intent(this,NewsFeedActivity.class);
            startActivity(i);
        }

       else
        {
            Toast.makeText(this, "username or password is incorect",Toast.LENGTH_LONG).show();
        }*/

    }


}
