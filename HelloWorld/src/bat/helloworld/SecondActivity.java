package bat.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondActivity extends Activity {
	//@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	
		// Make sure we're running on Honeycomb or higher to use ActionBar APIs
       // if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
           // getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
