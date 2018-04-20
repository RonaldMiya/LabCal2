package rmiya.com.labcal2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import rmiya.com.labcal2.R;
import rmiya.com.labcal2.repositories.UserRepository;

public class RegisterUserActivity extends AppCompatActivity {

    private EditText username, fullname, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        username = findViewById(R.id.username_input);
        fullname = findViewById(R.id.fullname_input);
        email = findViewById(R.id.email_input);
        password = findViewById(R.id.password_input);

    }

    public void callRegisterUser(View view) {

        String userName = username.getText().toString();
        String fullName = fullname.getText().toString();
        String Email = email.getText().toString();
        String Password = password.getText().toString();

        if(userName.isEmpty() || fullName.isEmpty() || Email.isEmpty() || Password.isEmpty()){
            Toast.makeText(this, "You must complete these fields", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "username " + userName + "fullname " + fullName+ "email " + Email + "pass" + Password, Toast.LENGTH_SHORT).show();

        UserRepository.create( userName, Password, fullName, Email);
        finish();

    }
}
