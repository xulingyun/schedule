package com.example.schedule;

import java.util.Calendar;
import java.util.Date;

import com.common.Enum.Week;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static final Long delayMillis = 4000l;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Calendar cal = Calendar.getInstance();
		Date a = new Date(System.currentTimeMillis());
		cal.setTime(a);
		int i = cal.get(Calendar.DAY_OF_WEEK)-1;
		String day = null;
		tv = (TextView)findViewById(R.id.tv);
		tv.setText(Week.Friday.toString());
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(MainActivity.this, MainShow.class);
				startActivity(intent);
				finish();
			}
		}, delayMillis);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
