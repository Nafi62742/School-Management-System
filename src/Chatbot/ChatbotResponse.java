/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Chatbot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fahim
 */
public class ChatbotResponse {
    Date datetime;
    String time;
    DateFormat dayFormat = new SimpleDateFormat("EEEEE");
    DateFormat dateFormat = new SimpleDateFormat("dd");
    DateFormat monthFormat = new SimpleDateFormat("MMMMM");
    DateFormat yearFormat = new SimpleDateFormat("yyyy");
    String dayString,dateString,monthString,yearString;
    DateFormat timeFormat = new SimpleDateFormat("hh:mm 'o''clock' a");
    public ChatbotResponse() {
        datetime=new Date();
        dayString=dayFormat.format(datetime);
        dateString=dateFormat.format(datetime);
        monthString=monthFormat.format(datetime);
        yearString=yearFormat.format(datetime);
    }
    public String getResponse(String speech){
        if(speech!=null){
            if(speech.contains("how are you")){
                return ("I am fine, thank you.How are you ?");
            }else if(speech.contains("what time is it")){
                datetime=new Date();
                return ("It is "+timeFormat.format(datetime));
            }else if(speech.contains("what day is today")){
                return ("It is " + dayString + ", " + monthString +" "+dateString+", "+yearString);
            }else if(speech.contains("hey bot")){
                return ("Hello my friend, How can I help you?");
            }else if(speech.contains("hello")||speech.contains("hi")){
                return ("Hello....I'm chatbot.");
            }
        }else{
            return "";
        }
        return "";
    }
}
