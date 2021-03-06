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

}