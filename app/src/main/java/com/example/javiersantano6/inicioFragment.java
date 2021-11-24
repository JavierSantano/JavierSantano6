package com.example.javiersantano6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.javiersantano6.databinding.FragmentInicioBinding;


public class inicioFragment extends Fragment {
private FragmentInicioBinding binding;
    public inicioFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(getLayoutInflater());
        binding.btnIniPersonajes.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.action_inicioFragment_to_personajesFragment));
        binding.btnIniMonstruos.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.action_inicioFragment_to_monstruosFragment));
        setHasOptionsMenu(true);
        return binding.getRoot();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_navegacion,menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Navigation.findNavController(getView()).navigate(R.id.acercaDeFragment);
        return super.onOptionsItemSelected(item);
    }
}
