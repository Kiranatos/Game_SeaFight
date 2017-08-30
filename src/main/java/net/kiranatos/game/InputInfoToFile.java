package net.kiranatos.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class InputInfoToFile {
    
    private static List<String> characteristicList;
    private static Map<String,String> charactiriasticPair;
    private static int index;

    
    public static void main(String[] args) throws IOException {
        System.out.println("Записать новый (N) файл или дописать в существующий (R) ?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toLowerCase();
        
        
        if ((str.equals("N"))|(str.equals("n"))) {
            System.out.println("Введите имя нового файла:");
            str = reader.readLine();
            FileWriter file = new FileWriter (new File(str));
            //FileOutputStream file = new FileOutputStream (str);
            
            System.out.println("Какие атрибуты должны быть у слов?\n(id и word добавляются по умолчанию)");
            separateWords(reader.readLine());
            
            index = 1;
            System.out.println("\nВведите 1-е слово:");
            String word = reader.readLine();            
            while (!word.equals("exit")) {
                
                charactiriasticPair = new TreeMap <String,String>();
                for (String atr : characteristicList) {
                    System.out.print(atr + "=");
                    String c = reader.readLine();
                    charactiriasticPair.put(atr, c);
                }
                
                file.write("id=" + index + "\n");
                file.write("word=" + word + "\n");
                
                Iterator<Map.Entry<String,String>> it = charactiriasticPair.entrySet().iterator();
                while ( it.hasNext() ) {
                    Map.Entry<String,String> pair = it.next();
                    String k = pair.getKey();
                    String v = pair.getValue(); 
                    file.write(k + "=" + v + "\n");                    
                }
                
                System.out.println("\nВведите " + ++index +" слово:");
                word = reader.readLine();
            }
            file.close();
            
        } else if ((str.equals("R"))|(str.equals("r"))) {
                System.out.println("Ещё не реализовано!");
        }
     

    }
    
    private static void separateWords(String s) {        
        String[] sMatrix = s.split(" ");
        characteristicList = new ArrayList <String>( Arrays.asList(sMatrix));
        
        
    }
    
}
