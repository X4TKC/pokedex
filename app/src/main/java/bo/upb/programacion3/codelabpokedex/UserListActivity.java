package bo.upb.programacion3.codelabpokedex;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.List;

import bo.upb.programacion3.codelabpokedex.Objects.Users;
import bo.upb.programacion3.codelabpokedex.utils.UsersUtils;

public class UserListActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listview;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_list);
        initViews();
        initToolbar();

        final List<Users> usersList = UsersUtils.getUsers();
        UsersListViewAdapter adapter = new UsersListViewAdapter(this, usersList);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Users user = usersList.get(position);
                Intent intent = new Intent(UserListActivity.this, PokemonDetailsActivity.class);
                intent.putExtra(Constants.POKEMON_SELECTED, gson.toJson(user));
                startActivity(intent);
            }
        });
        listview.setAdapter(adapter);
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        listview = findViewById(R.id.listViewMyPokemons);
    }

    private void initToolbar() {
        toolbar.setTitle(R.string.drawer_button_my_users);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorWhite));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
