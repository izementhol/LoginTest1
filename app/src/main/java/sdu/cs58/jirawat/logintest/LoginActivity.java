package sdu.cs58.jirawat.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร

    EditText nameEditText,usernameEditText,passwodEditText;
    Button LonginButton;
    String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initial view ผูกตัวแปร java ให้รู้จักับ element บน xml
        nameEditText =findViewById(R.id.txtname);
        usernameEditText =findViewById(R.id.txtusername);
        passwodEditText =findViewById(R.id.txtpassword);
        LonginButton = findViewById(R.id.bntLogin);

        LonginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString().trim();

                Toast.makeText(getApplicationContext(),"Hello  "+nameString,Toast.LENGTH_SHORT).show();
            }
        });


    }//end method onCreate
}//end class
