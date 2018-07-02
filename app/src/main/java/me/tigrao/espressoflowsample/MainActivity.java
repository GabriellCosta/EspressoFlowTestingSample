package me.tigrao.espressoflowsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private static final String EMAIL = "tigrao@gmail.com";
    private static final String PASSWORD = "12345678";

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.edt_email);
        password = findViewById(R.id.edt_password);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final String email = this.email.getText().toString();
        if (EMAIL.equals(email)
                && PASSWORD.equals(password.getText().toString())) {
                startActivity(HomeActivity.getIntent(this, email));
        }
    }
}
