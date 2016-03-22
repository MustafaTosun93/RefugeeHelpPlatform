package com.mustafatosun.refugeesupport.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.mustafatosun.refugeesupport.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Refugee extends ListFragment implements AdapterView.OnItemClickListener {
ListView list;
   // public List<String> itemList = new ArrayList<String>s();
   // public HashMap<String, String> item = new HashMap<String, String>();

    // TODO: Rename and change types and number of parameters

    public Refugee() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        item.put("title","Electronic"); item.put("sub", "Mobile Phone");
        item.put("title","Wear"); item.put("sub","Trousers");
        item.put("title","Wear"); item.put("sub","Shoes");
        item.put("title","Stationery"); item.put("sub","Books");
        item.put("title","Furniture"); item.put("sub","Fridge");
        itemList.add(item);*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_refugee, container, false);
    }
    @Override
    public void onViewCreated (View view, Bundle savedInstanceState) {
      /*  ListAdapter adapter = new SimpleAdapter(
                getActivity().getApplicationContext(), itemList,
                R.layout.refugee_list_item, new String[] { "title", "sub"},
                new int[] { R.id.ref_list_title, R.id.ref_list_sub });
*/

        ListView listView = getListView();
      //  listView.setAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }
    public void onButtonPressed(Uri uri) {
        System.exit(0);
        }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {

    }
}


