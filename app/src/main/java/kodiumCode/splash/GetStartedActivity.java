package kodiumCode.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.chromium.chrome.R;

import kodiumCode.joinMeeting.JoinMeetingActivity;

public class GetStartedActivity extends AppCompatActivity  {
    private ImageView forwardImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        initView();







    }
    private void  initView(){
        forwardImageView = findViewById(R.id.ivJoinMeetingIcon);
        forwardImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent joinMeetingIntent = new Intent(GetStartedActivity.this, JoinMeetingActivity.class);
                startActivity(joinMeetingIntent);
            }
        });



    }
}