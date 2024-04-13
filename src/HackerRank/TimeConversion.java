package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {

    public static String timeConversion(String s){

        String[] timeArray = s.split(":|(?<=\\d)(?=[AP]M)");

        Integer jam = Integer.parseInt(timeArray[0]);
        Integer menit = Integer.parseInt(timeArray[1]);
        Integer detik = Integer.parseInt(timeArray[2]);
        String time = timeArray[3];


        String hasil = "";
        if (time.equals("PM")){


            if (jam >= 12){
                Integer newJam =   12;
                Integer newMenit = menit;
                Integer newDetik = detik;
                if(newJam < 10 && newMenit < 10 && newDetik < 10 ){
                    hasil = "0" +  newJam + "0" + newMenit + "0" + newDetik;
                }

                else if (newJam < 10 && menit < 10){
                    hasil = "0" +  newJam + ":0" + newMenit + ":" + newDetik;

                } else if (newJam < 10 && detik < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":0" + newDetik;
                } else if (newDetik < 10 && newMenit < 10 ) {
                    hasil = newJam + ":0" + newMenit + ":0" + newDetik;
                }else if (newMenit < 10){
                    hasil = newJam + "0:" + newMenit + ":" +newDetik;
                } else if (newDetik < 10) {
                    hasil = newJam + ":" + newMenit + ":0" +newDetik;
                } else if (newJam < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":" +newDetik;
                }else {
                    hasil = newJam + ":" + newMenit + ":" + newDetik;
                }

            }else {
                Integer newJam =   12 + jam;
                Integer newMenit = menit;
                Integer newDetik = detik;
                if(newJam < 10 && newMenit < 10 && newDetik < 10 ){
                    hasil = "0" +  newJam + "0" + newMenit + "0" + newDetik;
                }

                else if (newJam < 10 && menit < 10){
                    hasil = "0" +  newJam + ":0" + newMenit + ":" + newDetik;

                } else if (newJam < 10 && detik < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":0" + newDetik;
                } else if (newDetik < 10 && newMenit < 10 ) {
                    hasil = newJam + ":0" + newMenit + ":0" + newDetik;
                }else if (newMenit < 10){
                    hasil = newJam + ":0" + newMenit + ":" +newDetik;
                } else if (newDetik < 10) {
                    hasil = newJam + ":" + newMenit + ":0" +newDetik;
                } else if (newJam < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":" +newDetik;
                }else {
                    hasil = newJam + ":" + newMenit + ":" + newDetik;
                }

            }


        }else {

            if (jam >= 12){
                Integer newJam =   jam -12;
                Integer newMenit = menit;
                Integer newDetik = detik;

                if(newJam < 10 && newMenit < 10 && newDetik < 10 ){
                    hasil = "0" +  newJam + ":0" + newMenit + ":0" + newDetik;
                }

                else if (newJam < 10 && menit < 10){
                    hasil = "0" +  newJam + ":0" + newMenit + ":" + newDetik;

                } else if (newJam < 10 && detik < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":0" + newDetik;
                } else if (newDetik < 10 && newMenit < 10 ) {
                    hasil = newJam + ":0" + newMenit + ":0" + newDetik;
                }else if (newMenit < 10){
                    hasil = newJam + "0:" + newMenit + ":" +newDetik;
                } else if (newDetik < 10) {
                    hasil = newJam + ":" + newMenit + ":0" +newDetik;
                } else if (newJam < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":" +newDetik;
                }
            }else {
                Integer newJam =   jam;
                Integer newMenit = menit;
                Integer newDetik = detik;

                if(newJam < 10 && newMenit < 10 && newDetik < 10 ){
                    hasil = "0" +  newJam + "0" + newMenit + "0" + newDetik;
                }

                else if (newJam < 10 && menit < 10){
                    hasil = "0" +  newJam + ":0" + newMenit + ":" + newDetik;

                } else if (newJam < 10 && detik < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":0" + newDetik;
                } else if (newDetik < 10 && newMenit < 10 ) {
                    hasil = newJam + ":0" + newMenit + ":0" + newDetik;
                }else if (newMenit < 10){
                    hasil = newJam + "0:" + newMenit + ":" +newDetik;
                } else if (newDetik < 10) {
                    hasil = newJam + ":" + newMenit + ":0" +newDetik;
                } else if (newJam < 10) {
                    hasil = "0" + newJam + ":" + newMenit + ":" +newDetik;
                }

            }

        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = "07:05:45PM";


        System.out.println( TimeConversion.timeConversion(time));  ;

    }
}
