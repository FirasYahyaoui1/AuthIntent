package com.example.authintent;
import com.example.authintent.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginDisplayActivity extends AppCompatActivity {
    final String Extra_Login = "user_login";
    final String Extra_password = "user_password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);
        Intent intent=getIntent();
        TextView loginDisplay=findViewById(R.id.email_display);
        TextView passwordDisplay=findViewById(R.id.password_display);
        if(intent !=null){
            loginDisplay.setText(intent.getStringExtra(Extra_Login));
            passwordDisplay.setText(intent.getStringExtra(Extra_password));

        }
    }
}
