package net.kiranatos.game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFromFiles {   
    
    private static BufferedReader readerFile;
    //"F:\\003_NetBeans\\MyProjects\\SeaFight\\proba2.txt"
    
    public void setFile(String path) {
        try {
            readerFile = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException er)
        {
            System.err.println("Файл: " + path + " не найден!");
        }
    }
    
    public Map<String,OneWord> getListOfTheWords() throws IOException
    {
        String s = readerFile.readLine();
        String keyWord = null;
        Map<String,OneWord> list = new HashMap<String,OneWord>();
        Map<String,String> oneWord = new HashMap<String,String>();
        while ( s != null ) 
        {
            String[] s1 = s.split("=");
            
            if (s1[0].equals("id")) {
                
                if (keyWord!=null) list.put(keyWord, new OneWord(oneWord));
                oneWord = new HashMap<String,String>();
            }
            if (s1[0].equals("word")) keyWord = s1[1];
            
            oneWord.put(s1[0], s1[1]);
            
            s = readerFile.readLine();            
        }
        
        return list;
    }
    
    /*
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        GUITest gt = new GUITest();
        gt.makeWindow();
        
        
        String s = readerFile.readLine();
        while ( s != null ) 
        {
            System.out.println("..." + s);
            s = readerFile.readLine();
            gt.setLabel(s);
        }        
    }*/
    
}

//file.write(System.getProperty( "line.separator" ).getBytes());
