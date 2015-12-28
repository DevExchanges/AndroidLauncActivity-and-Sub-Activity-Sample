package info.devexchanges.photopicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        TextView textView = (TextView) findViewById(R.id.text);

        Intent intent = this.getIntent();
        String receivedString = intent.getStringExtra("TEXT");

        textView.setText(receivedString);
    }
}
