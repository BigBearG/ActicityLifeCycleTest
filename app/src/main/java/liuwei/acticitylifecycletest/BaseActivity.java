package liuwei.acticitylifecycletest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by liuwei on 7/12/17.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActiviyCollector.addActivity(this);
        Log.d("Tag","baseActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActiviyCollector.removeActivity(this);
    }
}
