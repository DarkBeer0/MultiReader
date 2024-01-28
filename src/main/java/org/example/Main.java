package org.example;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {
    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        /*Voice[] voices = VoiceManager.getInstance().getVoices();
        for (Voice v: voices)
            System.out.println("Debug: " + v.getName());*/
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice == null)
        {
            System.out.println("Error: Voice is null!");
            return;
        }
        voice.allocate();
        System.out.println("Voice Settings: Rate - " + voice.getRate() + ", Pitch - " + voice.getPitch() + ", Volume - " + voice.getVolume());
        voice.speak("Hello, i am kevin16!");
    }
}