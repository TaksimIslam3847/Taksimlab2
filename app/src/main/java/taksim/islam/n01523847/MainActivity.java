package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeactivity(View view){
        Toast.makeText(this, R.string.taksim_islam, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        String name = getString(R.string.taksim_islam);
        intent.putExtra("key",name);
        startActivity(intent);


    }}

