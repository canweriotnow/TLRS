package org.decomplecting.tlrs.store;

import android.content.Context;

import com.cloudant.sync.datastore.DatastoreManager;
import com.cloudant.sync.datastore.Datastore;

import java.io.File;

/**
 * Created by jason on 11/1/16.
 */

public class TLRSManager {

    public TLRSManager(Context c) {
        File path = c.getApplicationContext().getDir("datastores", Context.MODE_PRIVATE);

    }
}
