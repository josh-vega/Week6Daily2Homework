package com.example.week6daily2homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week6daily2homework.elements.Address;
import com.example.week6daily2homework.elements.CalculatePayroll;
import com.example.week6daily2homework.elements.Employee;
import com.example.week6daily2homework.elements.Name;
import com.example.week6daily2homework.elements.Timesheet;
import com.flurry.android.FlurryAgent;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView tvName, tvPay, tvAddress;
    public HashMap<String, String> result;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "M3924K896RNR58JMQ7XZ");

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Employee employee = new Employee(new Name("Joshua", "Keanu", "Vega", ""),
                new Address("103 Falls Crest Drive", "LaGrange", "Georgia", "30240", "United States"),
                new Timesheet(7.5, true, 80));
        CalculatePayroll calculatePayroll = new CalculatePayroll();
        result = calculatePayroll.calculatePayroll(employee);
        tvName = findViewById(R.id.tvName);
        tvAddress = findViewById(R.id.tvAddress);
        tvPay = findViewById(R.id.tvPay);
    }

    public void onClick(View view) {
        FlurryAgent.logEvent("Button Clicked");

        tvName.setText(result.get("name"));
        tvAddress.setText(result.get("address"));
        tvPay.setText(result.get("pay"));

        Bundle bundle = new Bundle();
        bundle.putString("Clicked", "Button Clicked");
        mFirebaseAnalytics.logEvent("Clicked", bundle);
    }
}
