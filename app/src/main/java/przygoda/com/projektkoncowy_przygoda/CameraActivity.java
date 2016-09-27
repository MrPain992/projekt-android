package przygoda.com.projektkoncowy_przygoda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.tvCamera);
        textView.setText(bundle.getString("saveLocation"));
    }
}