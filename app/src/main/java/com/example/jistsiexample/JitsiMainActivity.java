package com.example.jistsiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;
import org.jitsi.meet.sdk.JitsiMeetUserInfo;

import java.net.URL;

public class JitsiMainActivity extends AppCompatActivity {

    String url = "https://meet.jit.si";
    EditText username, room_name;
    Button start_meeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        room_name = findViewById(R.id.room_name);

        start_meeting = findViewById(R.id.start_meeting);
        start_meeting.setOnClickListener(v -> {
            try {
                //startMeeting();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void startMeeting(Context context, String url, String username, String room_name) throws Exception {

        JitsiMeetUserInfo jitsiMeetUserInfo = new JitsiMeetUserInfo();
        jitsiMeetUserInfo.setDisplayName(username);
        jitsiMeetUserInfo.setEmail("vishnu@simplecrm.com");

        JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()
                .setServerURL(new URL(url))
                .setAudioMuted(false)
                .setAudioOnly(false)
                .setRoom(room_name)
                .setVideoMuted(false)
                .setUserInfo(jitsiMeetUserInfo)
                .setFeatureFlag("toolbox.enabled", true)
                .setFeatureFlag("filmstrip.enabled", true)
                .setWelcomePageEnabled(false)
                .build();

        JitsiMeetActivity.launch(context, options);
        //JitsiMeet.setDefaultConferenceOptions(defaultOptions);
    }
}