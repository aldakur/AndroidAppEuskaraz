package euskaraz.androidapp.aldakur.net.androidappeuskaraz;

import android.app.Application;

/**
 * When your application is launched this class is loaded before all of your activies.
 * And the instance of this class will live through whole application lifecycle.
 * <p/>
 * Created by gunhansancar on 16/02/15.
 */

public class MainApplication extends Application{
    //Application es un descendiente de Context
    @Override
    public void onCreate() {
        super.onCreate();
        //LocaleHelper.onCreate mirará si hay algún idioma establecido en el XML de preferencias
        //Si en el XML de las preferencias no hay ningun idioma establecido, se pondra eu.
        LocaleHelper.onCreate(this, "eu");
    }
}
