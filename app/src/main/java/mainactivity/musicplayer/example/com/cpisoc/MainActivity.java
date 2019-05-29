package mainactivity.musicplayer.example.com.cpisoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1, recyclerView2, recyclerView3, recyclerView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = findViewById(R.id.listRes1);
        recyclerView2 = findViewById(R.id.listRes2);
        recyclerView3 = findViewById(R.id.listRes3);

        recyclerView4 = findViewById(R.id.listRes4);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView3.setLayoutManager(linearLayoutManager3);

        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView4.setLayoutManager(linearLayoutManager4);

        recyclerView1.setAdapter(new Aaptar());
        recyclerView2.setAdapter(new Aaptar());
        recyclerView3.setAdapter(new Aaptar());

        recyclerView4.setAdapter(new AaptarList());

    }
}