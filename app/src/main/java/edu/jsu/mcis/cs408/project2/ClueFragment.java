package edu.jsu.mcis.cs408.project2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ClueFragment extends Fragment implements TabFragment {

    private final String FRAGMENT_TITLE = "Clues";

    private CrosswordViewModel model;

    private TextView across, down;

    public ClueFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Get Shared Model Reference

        model = new ViewModelProvider(requireActivity()).get(CrosswordViewModel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_clue, container, false);

        across = (TextView)root.findViewById(R.id.aContainer);
        down = (TextView)root.findViewById(R.id.dContainer);

        // Update the view
        updateClues();

        return root;

    }

    private void updateClues() {

        String cluesAcross = model.getCluesAcross().getValue();
        String cluesDown = model.getCluesDown().getValue();

        across.setText(cluesAcross);
        down.setText(cluesDown);

    }

    public String getTabTitle() { return FRAGMENT_TITLE; }

}