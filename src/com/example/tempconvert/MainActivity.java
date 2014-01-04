package com.example.tempconvert;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	 public void convert(View view) {
	     // Do something
		 
		 EditText edittext = (EditText) findViewById(R.id.celsius);
		 String num = edittext.getText().toString();
		 TextView textview = (TextView) findViewById(R.id.result_text);
		 textview.setText(num);
	 
	 }
	 
	//@Override
	//public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		//return true;
	//}

}
