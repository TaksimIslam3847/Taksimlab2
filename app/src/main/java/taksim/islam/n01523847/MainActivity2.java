package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity2 extends Menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView txt = findViewById(R.id.txt2);
        String msg2 = getIntent().getStringExtra("key");
        txt.setText(msg2);
    }
    @Override
    public  void onBackPressed(){
        View parentLayout =
                findViewById(android.R.id.content);
        Snackbar.make(parentLayout, R.string.sure,
                        Snackbar.LENGTH_LONG)
                .setAction(R.string.yes,
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {finish();} }) .show();

    }

}