package com.example.dat.demobottom.Database;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;

import java.util.ArrayList;
import java.util.List;

public class RingToneHelper {
    public static List<Ringtone> fetchAvailableRingtones(Context context) {

        List<Ringtone> ringtones = new ArrayList<>();
        RingtoneManager mgr = new RingtoneManager(context);
        mgr.setType(RingtoneManager.TYPE_ALL);

        int n = mgr.getCursor().getCount();
        for (int i = 0; i < n; i++) {
            ringtones.add(mgr.getRingtone(i));
        }

        return ringtones;

    }
}
