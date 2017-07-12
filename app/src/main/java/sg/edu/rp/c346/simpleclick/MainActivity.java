package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //step 1:Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_part1);

        //step 2 : Link the field variables to UI components in layout
        tvDisplay = (TextView)findViewById(R.id.textViewDisplay);
        btnDisplay = (Button) findViewById(R.id.buttondisplay);
        etInput = (EditText) findViewById(R.id.EditTextInput);
        tbtn =(ToggleButton) findViewById(R.id.toggleButton);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action

                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your Code for the action here

                if (tbtn.isChecked()){
                       etInput.setEnabled(true);
                  }else{
                    etInput.setEnabled(false);
                }



            }
        });

    }


}
