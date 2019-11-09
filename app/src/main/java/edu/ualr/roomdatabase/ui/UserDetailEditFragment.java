package edu.ualr.roomdatabase.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;

import edu.ualr.roomdatabase.R;
import edu.ualr.roomdatabase.db.entity.User;
import edu.ualr.roomdatabase.viewmodel.UserViewModel;

/**
 * Created by irconde on 2019-11-09.
 */
public class UserDetailEditFragment extends BottomSheetDialogFragment implements View.OnClickListener {

    private static final String USER_INDEX_KEY = "user_index";

    private EditText nameET;
    private EditText lastNameET;
    private EditText streetET;
    private EditText stateET;
    private EditText cityET;
    private EditText postCodeET;
    private MaterialButton saveBtn;

    private UserViewModel mViewModel;

    private UserDetailEditFragment(){}

    public static UserDetailEditFragment instance(int index) {
        UserDetailEditFragment instance = new UserDetailEditFragment();
        Bundle arguments = instance.getArguments();
        if (arguments != null) {
            arguments.clear();
        } else {
            arguments = new Bundle();
        }
        arguments.putInt(USER_INDEX_KEY, index);
        instance.setArguments(arguments);
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View parent =  inflater.inflate(R.layout.user_detail_fragment, container, false);
        nameET = parent.findViewById(R.id.first_name_et);
        lastNameET = parent.findViewById(R.id.last_name_et);
        streetET = parent.findViewById(R.id.street_et);
        stateET = parent.findViewById(R.id.state_et);
        cityET = parent.findViewById(R.id.city_et);
        postCodeET = parent.findViewById(R.id.postcode_et);
        saveBtn = parent.findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(this);
        return parent;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = ViewModelProviders.of(this.getActivity()).get(UserViewModel.class);
        int userIndex = getArguments().getInt(USER_INDEX_KEY);
        User user = mViewModel.getUsers().getValue().get(userIndex);
        nameET.setText(user.getName());
        lastNameET.setText(user.getLastName());
        streetET.setText(user.getAddress().getStreet());
        stateET.setText(user.getAddress().getState());
        cityET.setText(user.getAddress().getCity());
        postCodeET.setText(String.valueOf(user.getAddress().getPostCode()));
    }

    @Override
    public void onClick(View view) {
        // TODO 39. Call the update method when the user taps the save button in the bottom dialog
        String name = nameET.getText().toString();
        String lastName = lastNameET.getText().toString();
        String street = streetET.getText().toString();
        String state = stateET.getText().toString();
        String city = cityET.getText().toString();
        int postCode = Integer.valueOf(postCodeET.getText().toString());
        int userIndex = getArguments().getInt(USER_INDEX_KEY);
        mViewModel.updateUser(name, lastName, street, state, city, postCode, userIndex);
        dismiss();
    }
}
