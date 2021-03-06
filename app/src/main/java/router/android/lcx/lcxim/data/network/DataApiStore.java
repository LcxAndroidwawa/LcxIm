package router.android.lcx.lcxim.data.network;

import router.android.lcx.lcxim.data.network.model.Result;
import router.android.lcx.lcxim.data.network.model.Login;
import rx.Observable;

/**
 * Created by lichenxi on 2017/5/15.
 */

public interface DataApiStore {

       Observable<Login.LoginResponse> login(String region, String phone, String password);
}
