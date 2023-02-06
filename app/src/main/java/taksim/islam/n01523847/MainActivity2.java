package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity2 extends Menu {
    RadioGroup Radiogroup;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Radiogroup = findViewById(R.id.radiogroup);
        imageButton = findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioid = Radiogroup.getCheckedRadioButtonId();
                switch(radioid){
                    case R.id.apartmentButton:
                        openapartmentActivity();
                        break;
                    case R.id.HomeButton:
                        openhouseActivity();
                        break;
                    default:
                        Toast.makeText(MainActivity2.this, "Please make a selection", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void openapartmentActivity(){
        Intent enterVisit = new Intent(this, apartmentActivity.class);
        startActivity(enterVisit);
    }
    private void openhouseActivity(){
        Intent enterVisit2 = new Intent(this, houseActivity.class);
        startActivity(enterVisit2);
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

