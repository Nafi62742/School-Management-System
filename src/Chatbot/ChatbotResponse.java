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
    int totalHomeworks;
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
    public ChatbotResponse(int totalHomeworks) {
        datetime=new Date();
        dayString=dayFormat.format(datetime);
        dateString=dateFormat.format(datetime);
        monthString=monthFormat.format(datetime);
        yearString=yearFormat.format(datetime);
        this.totalHomeworks=totalHomeworks;
        System.out.println("Total homeworks="+totalHomeworks);
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
            }else if(speech.contains("hello")||speech.contains("hi")||speech.contains("who are you")){
                return ("Hi my friend....I'm chatbot. Speed sixteen Megahertz, memory 8 Gigabytes.");
            }else if(speech.contains("homework")||speech.contains("how many homework do i have")){
                switch (totalHomeworks) {
                    case 0:
                        return ("You have no homework to do. Enjoy your free time.");
                    case 1:
                        return ("You have only one homework to do. Hurry up!");
                    default:
                        return ("You have "+totalHomeworks+" to do. Hurry up! I wish I could help you in your homeworks.");
                }
            }else if(speech.contains("thank you")){
                return ("You are most welcome.");
            }else if(speech.contains("welcome")){
                return ("It is my pleasure.");
            }
        }else{
            return "";
        }
        return "";
    }
}
