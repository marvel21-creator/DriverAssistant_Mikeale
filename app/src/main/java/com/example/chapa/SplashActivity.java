package com.example.chapa;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay for 3 seconds (3000 milliseconds) before starting MainActivity
        new Handler().postDelayed(() -> {
            // Start MainActivity
            Intent intent = new Intent(SplashActivity.this, PaymentActivity.class);
            startActivity(intent);
            finish();  // Close the SplashActivity
        }, 5000);  // 3-second delay
    }
}