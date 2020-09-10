/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Chatbot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class TextToSpeech {
    private static final String voiceName="kevin16";
    Voice voice;
    public TextToSpeech() {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        voice = VoiceManager.getInstance().getVoice(voiceName);
    }
    public void speek(String text){
        if (voice != null) {
            voice.allocate();// Allocating Voice
            try {
                voice.setRate(160);// Setting the rate of the voice
                voice.setPitch(150);// Setting the Pitch of the voice
//                voice.setVolume(3);// Setting the volume of the voice
                voice.speak(text);// Calling speak() method

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            throw new IllegalStateException("Cannot find voice: "+voiceName);
        }
    }
    
}
