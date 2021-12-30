import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
    

        

        LogEntry ent1 = new LogEntry("Angela", Date.from(Instant.now()));
        LogEntry ent2 = new LogEntry("Pedro", Date.from(Instant.now()));
        LogEntry ent3 = new LogEntry("Maria", Date.from(Instant.now()));
        LogEntry ent4 = new LogEntry("Maria", Date.from(Instant.now()));

        Map <String, LogEntry> mapa = new HashMap<>();


        mapa.put("angela", ent1);
        mapa.put("pedro", ent2);
        mapa.put("maria", ent3);
        mapa.put("maria", ent4);

        print(mapa);

        String path = "C:\\Users\\delta\\Desktop\\int.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String s: mapa.keySet()){
                System.out.println(s);
                LogEntry l = mapa.get(s);
            

                bw.write(l.getNome() + ", " + l.getMoment());
                bw.newLine();
               
            }

        }catch(IOException ex){
           ex.printStackTrace();
          
        }

       
    }
    public static void print(Map<String, LogEntry> log){
        log.forEach((chave, conteudo) -> {
            System.out.println("Chave: " + chave + " Conteudo: " + conteudo);
        });
    }
}