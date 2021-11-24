package com.example.javiersantano6;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.javiersantano6.databinding.FragmentDelecionadosBinding;


public class delecionadosFragment extends Fragment {

private FragmentDelecionadosBinding binding;
    public delecionadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding= FragmentDelecionadosBinding.inflate(getLayoutInflater());
        setHasOptionsMenu(true);
      String nombreNPC = delecionadosFragmentArgs.fromBundle(getArguments()).getNombrePasar();
      binding.nomNPC.setText(nombreNPC.toString());
        //binding.nomEnCorrecto.setText(nombreUsuario.toString());
        return binding.getRoot();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_compartir,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        compartirInfo();
        return super.onOptionsItemSelected(item);
    }

    private Intent compartirInternet(){
        String nombreNPC = delecionadosFragmentArgs.fromBundle(getArguments()).getNombrePasar();
        Intent intentCompartido =new Intent(Intent.ACTION_SEND);
        intentCompartido.setType("text/plain").putExtra(Intent.EXTRA_TEXT,nombreNPC+"\n");
        return intentCompartido;
    }
    private  void  compartirInfo(){
        startActivity(compartirInternet());
    }
}