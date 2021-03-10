package com.example.simplecrm_jitsi;

import android.content.Context;

import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;
import org.jitsi.meet.sdk.JitsiMeetUserInfo;

import java.net.URL;

public class JitsiActivity {

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
