package org.example;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {
    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        FileManager fileManager = new FileManager();
        String fileContent = fileManager.GetFileText();

        if (!fileManager.CheckFile())
            return;
        VoiceHandler voiceHandler = new VoiceHandler();
        voiceHandler.SendVoiceMessage(fileContent);
    }
}