package org.decomplecting.tlrs.store;

import android.content.Context;
import android.util.Log;

import com.cloudant.sync.datastore.*;

import java.io.File;

/**
 * Created by jason on 11/1/16.
 */

public class TLRSManager {

    private static final String TAG = "TLRSManager"
    public static Datastore ds;

    public TLRSManager(Context c) {
        File path = c.getApplicationContext().getDir("datastores", Context.MODE_PRIVATE);
        DatastoreManager manager = DatastoreManager.getInstance(path.getAbsolutePath());
        try {
            Datastore ds = manager.openDatastore("tLRS_db");
        }
        catch(DatastoreNotCreatedException e) {
            Log.e(TAG, "Storage Fail!", e);
        }
    }
}
