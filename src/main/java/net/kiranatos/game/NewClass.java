package net.kiranatos.game;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class NewClass {    
    public static void main(String[] args) {                
        Character c = new Character('t');        
        char ch = c.charValue();
        boolean b = Character.isDefined('8'); //выясняет, определен ли символ в кодировке Unicode
        b = Character.isLowerCase('A'); //False
        b = Character.isJavaIdentifierStart('+'); //выясняет, можно ли использовать символ в идентификаторах        
        
        BigInteger bi = new BigInteger("111111111111111111111111111");
        BigInteger ai = new BigInteger("555555555555555555555555555");
        System.out.println("Length is " + bi.bitLength());        
        System.out.println("Sum is " + bi.add(ai));
        System.out.println("Max is " + bi.max(ai));
        
        BigDecimal a01 = new BigDecimal("345.7896e-4"); // 0.03457896
        BigDecimal b01 = new BigDecimal(new BigInteger("256789"), 4); //25.6789
        System.out.println("Sum = " + a01.add(b01));
        System.out.println("a/b = " + a01.divide(b01, BigDecimal.ROUND_UP));
        System.out.println("a/b = " + a01.divide(b01, BigDecimal.ROUND_DOWN));
        System.out.println("возвращает порядок числа = " + a01.scale());
        
        Class c1 = null, c2 = null;
        String str = "string";
        c1 = str.getClass();
        try{
            c2 = Class.forName("java.lang.String");
            System.out.println("Is primitive " + c1.isPrimitive());
            System.out.println("Package " + c1.getPackage());
            System.out.println("Superclass " + c1.getSuperclass());
        }catch(Exception e){}
    }
}