package org.decomplecting.tlrs.client;
import java.util.ArrayList;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by jason on 11/1/16.
 */

public interface ILrsService {
    @GET("statements?statementId={statementId}")
    Call<ArrayList<UUID>> getStatement();

}
