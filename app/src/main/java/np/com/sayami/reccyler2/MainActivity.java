package np.com.sayami.reccyler2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Items> itemsList = new ArrayList<>();
    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.recycler1);
        itemAdapter= new ItemAdapter(itemsList);


        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);

        addData();




    }


    public void addData(){
        Items items = new Items("Rs. 150","Buff MOMO ");
        itemsList.add(items);
        items = new Items("Rs. 120","Buff Chowmein");
        itemsList.add(items);
        items = new Items("Rs. 90","Veg MOMO");
        itemsList.add(items);
        items = new Items("Rs. 90","Veg Chowmein ");
        itemsList.add(items);
        items = new Items("Rs. 140","Chicken MOMO ");
        itemsList.add(items);
        items = new Items("Rs. 130","Chicken Chowmein ");
        itemsList.add(items);


    }

}
