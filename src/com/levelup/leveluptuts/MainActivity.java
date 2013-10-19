package com.levelup.leveluptuts;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] myNames = {"Nissan", "Subaru", "Bmw", "Audi", "None"}; 
        final TextView textOne = (TextView) findViewById(R.id.textView1);
        final Button pushMe = (Button) findViewById(R.id.button1);       

        

        
        pushMe.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Random randGen = new Random(); 
				int rando = randGen.nextInt(5);
				textOne.setText(myNames[rando]);
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
