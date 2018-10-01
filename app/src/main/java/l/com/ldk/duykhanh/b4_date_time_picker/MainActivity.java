package l.com.ldk.duykhanh.b4_date_time_picker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        initDatePicker();
        initTimePicker();
    }

    private void initDatePicker() {
        Calendar calendar = Calendar.getInstance();
        int Year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);
        int day = calendar.get(calendar.DAY_OF_MONTH);
        datePicker.init(1999, 20, 10, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this," "+i2+" " + i1 + " " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initTimePicker(){
timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
    @Override
    public void onTimeChanged(TimePicker timePicker, int i, int i1) {
        Toast.makeText(MainActivity.this, i1+":"+i, Toast.LENGTH_SHORT).show();
    }
});
    }
}
