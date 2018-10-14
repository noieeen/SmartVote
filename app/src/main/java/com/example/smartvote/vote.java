package com.example.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class vote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        Button check = findViewById(R.id.check_button);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText idenEditor = findViewById(R.id.iden_editText);
                String Idencard = idenEditor.getText().toString();

                String st1 = "1111111111111";
                String st2 = "2222222222222";

                if (idenEditor.length() != 13) {
                    Toast t = Toast.makeText(vote.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG);
                    t.show();
                } else {
                    String print = "";
                    if (Idencard.equals(st1) || Idencard.equals(st2))
                        print = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    else
                        print = "คุณไม่มีสิทธิเลือกตั้ง";

                    AlertDialog.Builder dialog = new AlertDialog.Builder(vote.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage(print);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.setCancelable(true);
                    dialog.show();
                }

            }
        });
    }
}
