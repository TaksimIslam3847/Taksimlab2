package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends Menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeactivity(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);


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

