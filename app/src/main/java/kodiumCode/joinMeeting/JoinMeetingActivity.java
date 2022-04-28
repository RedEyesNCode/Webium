package kodiumCode.joinMeeting;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import org.chromium.chrome.R;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;

public class JoinMeetingActivity extends AppCompatActivity {

    private AppCompatButton buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_meeting);
        initView();
    }

    private void initView(){

        buttonNext = findViewById(R.id.btnNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent joinMeetingIntent = new Intent(JoinMeetingActivity.this, ChromeLauncherActivity.class);
                startActivity(joinMeetingIntent);
            }
        });



    }
}