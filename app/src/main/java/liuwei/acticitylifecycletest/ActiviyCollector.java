package liuwei.acticitylifecycletest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuwei on 7/12/17.
 */

public class ActiviyCollector {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void fininshAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
