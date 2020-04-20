package com.example.orderhere;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Ordpg extends Activity {
	ArrayList<String> selection=new ArrayList<String>();
	TextView Order;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ordpg);
		Order=(TextView)findViewById(R.id.Final_result);
		Order.setEnabled(false);
	}
	public void selectionitem(View view)
	{
	boolean checked=((CheckBox) view).isChecked();
	switch (view.getId())
	{
	case R.id.checkBox1:
		if(checked){
			selection.add("TableNo:1");
		}
		else
		{
			selection.remove("TableNo:1");
		}
		break;
	case R.id.checkBox2:
		if(checked){
			selection.add("TableNo:2");
		}
		else
		{
			selection.remove("TableNo:2");
		}
		break;
	case R.id.checkBox3:
		if(checked){
			selection.add("TableNo:3");
		}
		else
		{
			selection.remove("TableNo:3");
		}
		break;
	case R.id.checkBox4:
		if(checked){
			selection.add("TableNo:4");
		}
		else
		{
			selection.remove("TableNo:4");
		}
		break;
	case R.id.checkBox5:
		if(checked){
			selection.add("TableNo:5");
		}
		else
		{
			selection.remove("TableNo:5");
		}
	case R.id.checkBox6:
		if (checked){
			selection.add("Chicken Soup");
		}
		else
		{
			selection.remove("Chicken Soup");
		}
	
	case R.id.checkBox7:
		if(checked){
			selection.add("Creamy Chicken Soup");
		}
		else
		{
			selection.remove("Creamy Chicken Soup");
		}
		break;
	case R.id.checkBox8:
		if(checked){
			selection.add("Mutton Soup");
		}
		else
		{
			selection.remove("Mutton Soup");
		}
		break;
	case R.id.checkBox9:
		if(checked){
			selection.add("Corn Chicken Stock");
		}
		else
		{
			selection.remove("Corn Chicken Stock");
		}
		break;
	case R.id.checkBox10:
		if(checked){
			selection.add("Clear Soup");
		}
		else
		{
			selection.remove("Clear Soup");
		}
		break;
	case R.id.checkBox11:
		if(checked){
			selection.add("Creamy Corn Soup");
		}
		else
		{
			selection.remove("Creamy Corn Soup");
		}
		break;
	case R.id.checkBox12:
		if(checked){
			selection.add("Tomato Soup");
		}
		else
		{
			selection.remove("Tomato Soup");
		}
		break;
	case R.id.checkBox13:
		if(checked){
			selection.add("Mushroom Soup");
		}
		else
		{
			selection.remove("Mushroom Soup");
		}
		break;
	case R.id.checkBox14:
		if(checked){
			selection.add("Spinach Soup");
		}
		else
		{
			selection.remove("Spinach Soup");
		}
		break;
	}
		
	}
	public void  finalview(View view)
	{
		String final_soup_selection="";
	    for(String Sets: selection)
	    {
	    final_soup_selection=final_soup_selection+Sets+"\n";	
	    }
	    Order.setText(final_soup_selection);
	    Order.setEnabled(true);
	    String s="9444307815";
	    String s1=Order.getText().toString();
	    try
	    {
	    
	    SmsManager m=SmsManager.getDefault();
	    m.sendTextMessage(s, null, s1, null, null);
	    Toast.makeText(getApplicationContext(), "order placed .please wait for few minutes.", Toast.LENGTH_LONG).show();
	    
	    }
	    catch(Exception e)
	    {
	    	Toast.makeText(getApplicationContext(), "sorry try again", Toast.LENGTH_LONG).show();
	    }
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ordpg, menu);
		return true;
	}

}
