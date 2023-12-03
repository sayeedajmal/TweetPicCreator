package com.strong.tweetpiccreator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.strong.tweetpiccreator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding MainBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainBind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(MainBind.getRoot());
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder( R.id.navigation_newTweet, R.id.navigation_Setting).build();

        NavController navController = Navigation.findNavController(this, R.id.navigation);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(MainBind.bottomNavigationView, navController);
    }
}