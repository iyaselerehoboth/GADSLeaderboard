package com.iyaselerehoboth.gadsleaderboard.views.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.snackbar.Snackbar;
import com.iyaselerehoboth.gadsleaderboard.R;
import com.iyaselerehoboth.gadsleaderboard.databinding.ActivitySubmissionBinding;
import com.iyaselerehoboth.gadsleaderboard.databinding.DialogConfirmBinding;

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
        /*if (binding.etFirstName.getText().toString().trim().isEmpty()) {
            return true;
        } else if (binding.etLastName.getText().toString().trim().isEmpty()) {
            return true;
        } else if (binding.etEmailAddress.getText().toString().trim().isEmpty()) {
            return true;
        } else return binding.etProjectLink.getText().toString().trim().isEmpty();*/
        return false;
    }

    public void submitInputs() {
        DialogConfirmBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(SubmissionActivity.this), R.layout.dialog_confirm, null, false);

        Dialog dialog = new Dialog(this);
        dialog.setContentView(binding.getRoot());
        binding.imgBtnCancel.setOnClickListener(view -> dialog.dismiss());
        binding.btnPositive.setOnClickListener(view -> {
            Toast.makeText(SubmissionActivity.this, "we toasted", Toast.LENGTH_LONG).show();
        });
        dialog.setCancelable(false);
        dialog.show();
    }
}