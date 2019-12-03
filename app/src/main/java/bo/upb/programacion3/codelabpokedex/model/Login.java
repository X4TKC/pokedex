package bo.upb.programacion3.codelabpokedex.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import bo.upb.programacion3.codelabpokedex.Objects.Users;
import bo.upb.programacion3.codelabpokedex.UI.UserLogged;

public class Login extends AndroidViewModel {
    public Login(@NonNull Application application) {
        super(application);
    }
//    public LiveData<Base> login(final String email, final String password) {
//        final MutableLiveData<Base> result = new MutableLiveData<>();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(4000);
//                    Users user = new Users();
//                    user.setUuid("1");
//                    user.setEmail(email);
//                    user.setStatus(true);
//
//                    UserLogged userLogged = ResponseMapper.mapUserToUserLooged(user);
//                    result.postValue(new Base(userLogged));
//                } catch (InterruptedException ex) {
//                    result.postValue(new Base("Interrupted", ex));
//                }
//            }
//        }).start();
//        return result;
//    }
}
