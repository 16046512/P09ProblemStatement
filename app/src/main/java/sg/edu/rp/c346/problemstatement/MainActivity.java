package sg.edu.rp.c346.problemstatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    //Step 1b for ListView:Declare ListView Variable
    ListView lv;

    //Step 2 for ListView:Declare and ArrayAdapter variables
    ArrayList<Item> item;
    CustomAdapter caItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1C for ListView: Bind the ListView UI element to the ListView variable
        lv=(ListView)findViewById(R.id.lvMovie);

        //Step 3 for ListView: Creating instance of ArrayList
        item = new ArrayList<Item>();

        //Step 4 for ListView: Creating instance of ArrayAdapter, binding it to ArrayList
        caItem = new  CustomAdapter(this,R.layout.row,item);

        //Step 5 For listView: Bind the ArrayAdapter to ListView variable
        lv.setAdapter(caItem);

        //Step 6 for ListView:Populate the Listview with data

        Item item1 = new Item("War for the Planet of the Apes." ," A 2017 sequel of the Planet of the Apes science fiction franchise ","by French author Pierre Boulle's"); //Create a ToDoItem object named item1
        item.add(item1);  //Add the ToDoItem object to the toDoList ArrayList


        Item item2 = new Item("King Kong.","Movie about a giant ape, ","created by American filmmaker  Merian C. Cooper that first appear in 1930s.");
        item.add(item2);

    }
}
