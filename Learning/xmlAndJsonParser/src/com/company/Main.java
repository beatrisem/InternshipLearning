package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.replaceAll(" ", "");

        //if in xml format then converts to json syntax
        if(s.startsWith("<")){
            //key: value pair
            String[] keyVals = s1.split(">", 2);
            String key1 = keyVals[0];
            String val2 = keyVals[1];

            //get 2nd value without closing tag
            String[] val2upd = val2.split("<", 2);
            String val2actual = val2upd[0];

            //only get the actual string values
            String extract1 = key1.replaceAll("[^a-zA-Z0-9]+","");
            String extract2 = val2.replaceAll("[^a-zA-Z0-9.]+","");

            //checks if the second value exists
            if(extract2.equals("")){
                System.out.println("{\"" + extract1 + "\":null}");
            }
            //prints out the key value in json
            else{
                System.out.println("{\"" + extract1 + "\": \""+val2actual+"\"}");
            }

            //if in json then converts to xml syntax
        }else{
            //gets key and value
            String[] keyVals = s1.split(":", 2);
            String key1 = keyVals[0];
            String val2 = keyVals[1];

            //only the values without whitespace or special chars
            String extract1 = key1.replaceAll("[^a-zA-Z0-9]+","");
            String extract2 = val2.replaceAll("[^a-zA-Z0-9.]+","");
            //checks if the 2nd val exists
            if(extract2.contains("null")){
                System.out.println("<"+extract1+"/>");
            }
            //prints out in xml syntax
            else{
                System.out.println("<"+extract1+">"+extract2+"</"+extract1+">");
            }
        }

    }
}
