package com.dvsir;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.dvsir.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void sendMsg(View view){
    	Intent intent = new Intent(this, DisplayMsgActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String msg= editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, msg);
    	startActivity(intent);
    }
}
