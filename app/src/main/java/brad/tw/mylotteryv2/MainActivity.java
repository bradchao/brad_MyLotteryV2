package brad.tw.mylotteryv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesg = (TextView)findViewById(R.id.textLottery);
    }

    public void createLottery(View v){
        Log.d("brad", "OK");
        mesg.setText("Lottery:" + (int)(Math.random()*49+1));

    }

}
