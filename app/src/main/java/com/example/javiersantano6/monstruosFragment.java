package com.example.javiersantano6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javiersantano6.databinding.FragmentDelecionadosBinding;
import com.example.javiersantano6.databinding.FragmentMonstruosBinding;
import com.example.javiersantano6.databinding.FragmentPersonajesBinding;


public class monstruosFragment extends Fragment {
private FragmentMonstruosBinding binding;


    public monstruosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentMonstruosBinding.inflate(getLayoutInflater());


        binding.btnBestias.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnBestias.getText().toString()));
        });
        binding.btnMalditos.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnMalditos.getText().toString()));
        });
        binding.btnDraconido.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnDraconido.getText().toString()));
        });
        binding.btnNecrofafos.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnNecrofafos.getText().toString()));
        });
        binding.btnHibridos.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnHibridos.getText().toString()));
        });
        binding.btnInsectoides.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnInsectoides.getText().toString()));
        });
        binding.btnRelictos.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnRelictos.getText().toString()));
        });
        binding.btnEspectros.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnEspectros.getText().toString()));
        });
        binding.btnVampiros.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(monstruosFragmentDirections.
                    actionMonstruosFragmentToDelecionadosFragment(binding.btnVampiros.getText().toString()));
        });


        return binding.getRoot();
    }





}