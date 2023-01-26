package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt = findViewById(R.id.txt2);
        String msg2 = getIntent().getStringExtra("key");
        txt.setText(msg2);
    }
}