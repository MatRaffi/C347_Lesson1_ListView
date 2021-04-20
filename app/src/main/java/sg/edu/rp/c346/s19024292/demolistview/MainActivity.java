package sg.edu.rp.c346.s19024292.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvFood);

        // Create a few food objects in Food array
        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee", false));
        food.add(new Food("Rocky Choc", true));
        food.add(new Food("Kid Cat Choc", true));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new FoodAdapter(this, R.layout.row, food);
        lv.setAdapter(aa);
    }

}



