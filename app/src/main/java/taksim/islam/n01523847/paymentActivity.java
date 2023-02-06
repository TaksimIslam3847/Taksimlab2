package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class paymentActivity extends Menu {
    Button button;
    EditText Name;
    EditText Number;
    String stringName;
    String stringNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Name = (EditText) findViewById(R.id.textInputEditText);
        Number = (EditText) findViewById(R.id.textInputEditText2);

        stringName = Name.getText().toString();
        stringNumber = Number.getText().toString();

        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringName.length() < 3) {
                    Name.setError(getString(R.string.minLen));
                } else if (stringNumber.length() != 17) {
                    Number.setError(getString(R.string.digiterror));
                }
                else  {
                    Toast.makeText(paymentActivity.this, R.string.success, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(paymentActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
