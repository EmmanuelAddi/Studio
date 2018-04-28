package emmanuel.travel254;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by emmanuel on 4/9/18.
 */

public class ProgressBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadingpage);
        Thread Addi = new Thread() {

                @Override
                public void run() {
                try {
                    sleep(4000);
                    Intent Emmanuel = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(Emmanuel);
                    finish();


                } catch (
                        InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Addi.start();
    }
}
