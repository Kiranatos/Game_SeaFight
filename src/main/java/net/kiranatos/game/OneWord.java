package net.kiranatos.game;

import java.util.Iterator;
import java.util.Map;

public class OneWord {
    
    private Map<String,String> characteristics;
    private String word = "<NONE>";
    private String translate = "<NONE>";
    private String transcription = "<NONE>";
    
    private OneWord(){}
    
    public OneWord (Map<String,String> characteristics) {
        this.characteristics = characteristics;
        word = characteristics.get("word");
        translate = characteristics.get("translate");
        transcription = characteristics.get("transcription");
    }
    
    public String getWord() { return this.word;}
    public String getTranslate() { return this.translate;}
    public String getTranscription() { return this.transcription;}
    public String getValue(String key) { return characteristics.get(key); }

    @Override
    public String toString() {        
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String,String>> it = characteristics.entrySet().iterator();	
        while ( it.hasNext() ) {	
            Map.Entry<String,String> pair = it.next();	
            String k = pair.getKey();	
            String v = pair.getValue();
            sb.append(k).append("=").append(v).append("\n");            
        }

        return sb.toString();
    }    
}
