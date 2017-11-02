package edu.cnm.deepdive.eb.flashme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import edu.cnm.deepdive.eb.flashme.fragments.DeckFragment;
import edu.cnm.deepdive.eb.flashme.fragments.DeckMemberFragment;

// TODO

public class DeckActivity extends AppCompatActivity {
   FragmentManager manager = getSupportFragmentManager();
   Fragment fragment = manager.findFragmentById(R.id.fragment_container);

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
      mainScreenDeckFragment();
  }

  private void mainScreenDeckFragment() {
    if (fragment == null) {
      fragment = new DeckFragment();
      Bundle args = new Bundle();
      fragment.setArguments(args); // bundle
      manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
  }

  public void goToDeckFragment(View view) {
    fragment = new DeckFragment();
    Bundle args = new Bundle();
    fragment.setArguments(args); // bundle
    manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
  }

  public void goToDeckMemberFragment(View view) {
//      startActivity(new Intent(DeckActivity.this, CardActivity.class));
        fragment = new DeckMemberFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args); // bundle
        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();

    }

  @Override
  public void onBackPressed() {
//    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//    if (drawer.isDrawerOpen(GravityCompat.START)) {
//      drawer.closeDrawer(GravityCompat.START);
//    } else {
      super.onBackPressed();
//    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
    }

    return super.onOptionsItemSelected(item);
  }

//  @SuppressWarnings("StatementWithEmptyBody")
//  @Override
//  public boolean onNavigationItemSelected(MenuItem item) {
//    // Handle navigation view item clicks here.
//    int id = item.getItemId();
//
//    switch (id) {
//      case R.id.nav_deck:
//        startActivity(new Intent(DeckActivity.this, DeckActivity.class));
//        break;
//      case R.id.nav_deck_member:
//        startActivity(new Intent(this, DeckActivity.class));
//        break;
//      case R.id.nav_card_create:
//        startActivity(new Intent(this, CardActivity.class));
//        break;
//    }

//    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//    drawer.closeDrawer(GravityCompat.START);
//    return true;
  }



//  private void setupTools() {

//
//    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//    drawer.setDrawerListener(toggle);
//    toggle.syncState();
//
//    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//    navigationView.setNavigationItemSelectedListener(this);
//  }





//}
