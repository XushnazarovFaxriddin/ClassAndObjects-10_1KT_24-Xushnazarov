package com.example.classandobjects_10_1kt_24_xushnazarov;



import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = findViewById(R.id.textView);
        Button button2 = findViewById(R.id.button2);
        EditText editorText = findViewById(R.id.editTextText);
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        button2.setOnClickListener(v -> {
                    String name = editorText.getText().toString();
                    if (name.isEmpty()) {
                        editorText.setError("Name is required");
                        return;
                    }
                    if(editTextNumber.getText().toString().isEmpty()){
                        editTextNumber.setError("Age is required");
                        return;
                    }
                    int age = Integer.parseInt(editTextNumber.getText().toString());
                    Person person1 = new Person(name, age);
                    String introduction1 = person1.getIntroduction();
                    textView.setText(introduction1);
                });
    }
}