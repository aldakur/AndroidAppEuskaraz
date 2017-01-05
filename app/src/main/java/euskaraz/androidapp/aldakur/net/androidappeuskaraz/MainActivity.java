package euskaraz.androidapp.aldakur.net.androidappeuskaraz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = (TextView) findViewById(R.id.hello);

        Button btn_language_eu = (Button) findViewById(R.id.btn_language_eu);
        Button btn_language_es = (Button) findViewById(R.id.btn_language_es);
        Button btn_language_en = (Button) findViewById(R.id.btn_language_en);

        btn_language_eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocaleHelper.setLocale(getApplicationContext(), "eu");
                updateViews();

            }
        });

        btn_language_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocaleHelper.setLocale(getApplicationContext(), "es");
                updateViews();

            }
        });

        btn_language_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocaleHelper.setLocale(getApplicationContext(), "en");
                updateViews();

            }
        });

    }

    private void updateViews() {
        tvHello.setText(R.string.hello);

    }
}
