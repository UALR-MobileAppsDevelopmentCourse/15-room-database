package edu.ualr.roomdatabase.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.ualr.roomdatabase.R;
import edu.ualr.roomdatabase.adapter.UserListAdapter;
import edu.ualr.roomdatabase.data.DataGenerator;
import edu.ualr.roomdatabase.db.entity.User;
import edu.ualr.roomdatabase.viewmodel.UserViewModel;

/**
 * Created by irconde on 2019-11-09.
 */
public class UserListFragment extends Fragment implements UserListAdapter.OnUserDeletedListener, OnUserSelectedListener {

    private RecyclerView mRecyclerView;
    private UserListAdapter mAdapter;
    private UserViewModel mUserViewModel;
    private OnUserSelectedListener mListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.user_list_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView(view);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnUserSelectedListener) {
            mListener = (OnUserSelectedListener) context;
        }
    }

    private void initRecyclerView(View parent){
        mAdapter = new UserListAdapter();
        mAdapter.setUserDeletionListener(this);
        mAdapter.setUserSelectionListener(this);
        mRecyclerView = parent.findViewById(R.id.user_recycler_view);
        mUserViewModel = ViewModelProviders.of(this.getActivity()).get(UserViewModel.class);
        // TODO 35. Initialize the database
        mRecyclerView.setAdapter(mAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onUserDeleted(User user) {
        // TODO 37. Delete the user from the database when the X button is tapped
    }

    @Override
    public void onUserSelected(User user, int index) {
        mListener.onUserSelected(user, index);
    }
}
