package edu.ualr.roomdatabase.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import edu.ualr.roomdatabase.R;
import edu.ualr.roomdatabase.db.entity.User;
import edu.ualr.roomdatabase.viewmodel.UserViewModel;

// TODO 02. Create a new POJO class to define the entities in our database
// TODO 11. We create a DAO interface to define the query operations over the user entity
// TODO 24. Create a class that represents the database
// TODO 27. Typically we'll wrap the database with a viewmodel class to provide activities and
//  fragments an agnostic data access
public class MainActivity extends AppCompatActivity implements OnUserSelectedListener{

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String USER_LIST_FRAGMENT_TAG = "edu.ualr.roomdatabase.USER_LIST";
    private static final String BOTTOM_DIALOG_TAG = "edu.ualr.roomdatabase.BOTTOM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUserListFragment();
    }

    private void setupUserListFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragments_placeholder, new UserListFragment(), USER_LIST_FRAGMENT_TAG);
        transaction.commit();
    }

    @Override
    public void onUserSelected(User user, int index) {
        showBottomDialog(index);
    }

    private void showBottomDialog(int index) {
        UserDetailEditFragment dialog = UserDetailEditFragment.instance(index);
        dialog.show(getSupportFragmentManager(), BOTTOM_DIALOG_TAG);
    }
}
