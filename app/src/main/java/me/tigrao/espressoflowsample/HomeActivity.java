package me.tigrao.espressoflowsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView textView = findViewById(R.id.txt_home);

        textView.setText(getEmail());
    }

    @SuppressWarnings("ConstantConditions")
    private String getEmail() {
        Intent intent = getIntent();
        return intent.getExtras().getString(Intent.EXTRA_EMAIL);
    }

    public static Intent getIntent(final Context context, final String email) {
        return new Intent(context, HomeActivity.class)
                .putExtra(Intent.EXTRA_EMAIL, email);
    }
}
