package com.iyaselerehoboth.gadsleaderboard.views.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.snackbar.Snackbar;
import com.iyaselerehoboth.gadsleaderboard.R;
import com.iyaselerehoboth.gadsleaderboard.databinding.ActivitySubmissionBinding;

public class SubmissionActivity extends AppCompatActivity {
    ActivitySubmissionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_submission);

        binding.imgBtnBack.setOnClickListener(view -> onBackPressed());

        binding.btnSubmit.setOnClickListener(view -> {
            if (!isInputsEmpty()) {
                //Submit Details
                submitInputs();
            } else {
                //Warn about empty inputs.
                Snackbar.make(binding.cl, "Kindly fill in all inputs", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public boolean isInputsEmpty() {
        if (binding.etFirstName.getText().toString().trim().isEmpty()) {
            return true;
        } else if (binding.etLastName.getText().toString().trim().isEmpty()) {
            return true;
        } else if (binding.etEmailAddress.getText().toString().trim().isEmpty()) {
            return true;
        } else return binding.etProjectLink.getText().toString().trim().isEmpty();
    }

    public void submitInputs() {

    }
}