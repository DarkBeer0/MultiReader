package org.example;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class VoiceHandler {
    public void SendVoiceMessage(String message) {
        /*Voice[] voices = VoiceManager.getInstance().getVoices();
        for (Voice v: voices)
            System.out.println("Debug: " + v.getName());*/
        if (message == null || message.isEmpty())
            return;
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice == null)
        {
            System.out.println("Error: Voice is null!");
            return;
        }
        FileManager fileManager = new FileManager();
        voice.allocate();
        //System.out.println("Voice Settings: Rate - " + voice.getRate() + ", Pitch - " + voice.getPitch() + ", Volume - " + voice.getVolume());
        voice.speak(message);
    }
}
