package com.example.javiersantano6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javiersantano6.databinding.FragmentPersonajesBinding;


public class personajesFragment extends Fragment {

  private FragmentPersonajesBinding binding;

    public personajesFragment() {
        // Required empty public constructor
    }
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding= FragmentPersonajesBinding.inflate(getLayoutInflater());
      binding.btnGeralt.setOnClickListener(v->{
            Navigation.findNavController(getView()).navigate(personajesFragmentDirections.
            actionPersonajesFragmentToDelecionadosFragment(binding.btnGeralt.getText().toString()));
      });
       binding.btnYennefer.setOnClickListener(v->{
           Navigation.findNavController(getView()).navigate(personajesFragmentDirections.
                   actionPersonajesFragmentToDelecionadosFragment(binding.btnYennefer.getText().toString()));
       });
       binding.btnCiri.setOnClickListener(v->{
           Navigation.findNavController(getView()).navigate(personajesFragmentDirections.
                   actionPersonajesFragmentToDelecionadosFragment(binding.btnCiri.getText().toString()));
       });
       binding.btnJaskier.setOnClickListener(v->{
           Navigation.findNavController(getView()).navigate(personajesFragmentDirections.
                   actionPersonajesFragmentToDelecionadosFragment(binding.btnJaskier.getText().toString()));
       });
       binding.btnVesemir.setOnClickListener(v->{
           Navigation.findNavController(getView()).navigate(personajesFragmentDirections.
                   actionPersonajesFragmentToDelecionadosFragment(binding.btnVesemir.getText().toString()));
       });
       binding.btnSardinilla.setOnClickListener(v->{
           Navigation.findNavController(getView()).navigate(personajesFragmentDirections.
                   actionPersonajesFragmentToDelecionadosFragment(binding.btnSardinilla.getText().toString()));
       });

       return binding.getRoot();



    }
}