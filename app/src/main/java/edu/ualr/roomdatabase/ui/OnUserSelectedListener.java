package edu.ualr.roomdatabase.ui;

import edu.ualr.roomdatabase.db.entity.User;

/**
 * Created by irconde on 2019-11-09.
 */
public interface OnUserSelectedListener {
    void onUserSelected(User user, int index);
}
