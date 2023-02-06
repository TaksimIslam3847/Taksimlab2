package taksim.islam.n01523847;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class apartmentActivity extends Menu {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);
    }

    public void paymentPage(View view) {
        Intent intent = new Intent(this,paymentActivity.class);
        startActivity(intent);
    }
}