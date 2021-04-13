package edu.jsu.mcis.cs408.project2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TabLayoutContainer container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (TabLayoutContainer)getSupportFragmentManager().findFragmentById(R.id.fragment);

        // Create and initialize shared ViewModel

        CrosswordViewModel model = new ViewModelProvider(this).get(CrosswordViewModel.class);
        model.init(this);

    }

}