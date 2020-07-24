package com.ash.societymanager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ash.societymanager.model.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class UploadMaintenaceFragment extends Fragment {


    public UploadMaintenaceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_upload_maintenance, container, false);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Maintenance");
        String month = myRef.push().getKey();

        User user = new User();
        user.setName("Ashwin");
        user.setAmount("1000");
        user.setDate("01/06/2020");
        user.setFlatNumber("101");
        myRef.child("January").child("1").setValue(user);

        return view;
    }

}
