package liuwei.acticitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button normal=(Button)findViewById(R.id.start_normal_activity);
        Button dialog=(Button)findViewById(R.id.start_dialog_activity);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent1);
            }
        });
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent2);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("dd","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("dd","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("dd","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("dd","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("dd","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("dd","onRestart");
    }
}
