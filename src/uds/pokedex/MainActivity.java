package uds.pokedex;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        if(findViewById(R.id.fragment_container) != null) {
            if(savedInstanceState != null) {
                return;
            }

            PokedexFragment firstFragment = new PokedexFragment();
            firstFragment.setArguments(getIntent().getExtras());
            getFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
        }
    }
}
