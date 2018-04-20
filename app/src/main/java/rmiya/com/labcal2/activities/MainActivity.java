package rmiya.com.labcal2.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import rmiya.com.labcal2.R;
import rmiya.com.labcal2.models.User;
import rmiya.com.labcal2.repositories.UserRepository;

public class MainActivity extends AppCompatActivity {

    private static final int REGISTER_FORM_REQUEST = 100;



    private SharedPreferences sharedPreferences;
    private EditText usernameinpt;
    private EditText passwordinpt;
    private ProgressBar progressBar;
    private View loginPanel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameinpt = findViewById(R.id.username_input);
        passwordinpt = findViewById(R.id.password_input);
        progressBar = findViewById(R.id.progressbar);
        loginPanel = findViewById(R.id.login_panel);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        String username = sharedPreferences.getString("username", null);
        if (username != null) {
            usernameinpt.setText(username);
            passwordinpt.requestFocus();
        }

        if(sharedPreferences.getBoolean("islogged", false)){
            goProducts();
        }

    }

    public void callLogin(View view) {

        loginPanel.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

        String username = usernameinpt.getText().toString();
        String password = passwordinpt.getText().toString();

        if(username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "You must complete these fields", Toast.LENGTH_SHORT).show();
            return;
        }

//        UserRepository.list(username, password);

        UserRepository.login(username, password);

//        if(user == null){
//            Toast.makeText(this, "Username or password invalid", Toast.LENGTH_SHORT).show();
//            loginPanel.setVisibility(View.VISIBLE);
//            progressBar.setVisibility(View.GONE);
//            return;
//        }
//
//        Toast.makeText(this, "Welcome " + user.getFullname(), Toast.LENGTH_SHORT).show();
//
//        // Save to SharedPreferences
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        boolean success = editor
//                .putString("username", user.getUsername())
//                .putBoolean("islogged", true)
//                .commit();

        // Go to Dashboard
        goProducts();
    }

    private void goProducts() {
        startActivity(new Intent(this, ProductosActivity.class));
        finish();
    }

    public void callRegisterFormUser(View view) {

        startActivityForResult(new Intent(this, RegisterUserActivity.class), REGISTER_FORM_REQUEST);

    }
}
