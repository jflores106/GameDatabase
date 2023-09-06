/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.io.File; 
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author janet
 */
public class Database3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VideoGames","root","Janet1997");
        Statement stmt = con.createStatement();
        
        
        Scanner gameFile = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\game1.txt"));
        gameFile.nextLine();
        
        while(gameFile.hasNextLine())
        {
            String[] game = gameFile.nextLine().split(",");
            int gameID = Integer.parseInt(game[0]);
            String title = game[1];
            String genre = game[2];
            String rating = game[3];
            
            Boolean insertGame = stmt.execute("Insert Into Game values (" + gameID + ",'" + title + "','" + genre + "','" + rating + "')");
            
            
        }
        gameFile.close();
        
        
        Scanner gameMode = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\gameMode1.txt"));
        gameMode.nextLine();
        
        while(gameMode.hasNextLine())
        {
            String[] mode = gameMode.nextLine().split(",");
            String gm = mode[0];
            int gameID = Integer.parseInt(mode[1]);
            
            Boolean insertGameMode = stmt.execute("Insert Into GameMode values ('" + gm + "'," + gameID + ")");
        }
        gameMode.close();
        
        
        Scanner devsFile = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\Devs1.txt"));
        devsFile.nextLine();
        
        while(devsFile.hasNextLine())
        {
            
            String[] devs = devsFile.nextLine().split(",");
            
            int devID = Integer.parseInt(devs[0]);
            String devName = devs[1];
            int numEmp;
            
            if(devs.length == 2){
                numEmp = ThreadLocalRandom.current().nextInt(20, 500);   
            }
             else 
            {
                numEmp = Integer.parseInt(devs[2]);
            }
            
            Boolean insertDevs = stmt.execute("Insert Into DeveloperStudio values (" + devID + ",'" + devName + "'," + numEmp + ")");            
        }
        devsFile.close();
        
        
        Scanner platformFile = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\platform1.txt"));
        platformFile.nextLine();
        
        while(platformFile.hasNextLine())
        {
            
            String[] platform = platformFile.nextLine().split(",");
            
            int platformID = Integer.parseInt(platform[0]);
            String platformName = platform[1];
            String generation = platform[2];
            
            Boolean insertDevs = stmt.execute("Insert Into Platform values (" + platformID + ",'" + platformName + "','" + generation + "')");            
        }
        platformFile.close();
        
        
        Scanner release = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\releasedOn1.txt"));
        release.nextLine();
        
        while(release.hasNextLine())
        {
            
            String[] relOn = release.nextLine().split(",");
            
            int gameID = Integer.parseInt(relOn[0]); 
            int platformID = Integer.parseInt(relOn[1]); 
            String relDate = relOn[2]; 
        
            Boolean insertRelease = stmt.execute("Insert Into Released_On values (" + gameID + "," + platformID + ",'" + relDate + "')");            
        }
        release.close();
        
        
        Scanner devBy = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\devBY1.txt"));
        devBy.nextLine();
        
        while(devBy.hasNextLine())
        {
            
            String[] d = devBy.nextLine().split(",");
            
            int devID = Integer.parseInt(d[0]); 
            int gameID = Integer.parseInt(d[1]);
        
            Boolean insertDevBy = stmt.execute("Insert Into Developed_By values (" + devID + "," + gameID + ")");            
        }
        devBy.close();
        
        
        Scanner countryFile = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\country1.txt"));
        countryFile.nextLine();
        
        while(countryFile.hasNextLine())
        {
            
            String[] country = countryFile.nextLine().split(",");
            
            int countryID = Integer.parseInt(country[0]); 
            System.out.println(countryID);
            String countryName = country[1]; 
            System.out.println(countryName);
        
            Boolean insertCountry = stmt.execute("Insert Into Country values (" + countryID + ",'" + countryName + "')"); 
        }
        countryFile.close(); 
        
              
        Scanner banFile = new Scanner(new File("C:\\Users\\janet\\Desktop\\CS415-Project\\bannedIn1.txt"));
        banFile.nextLine();
        
        while(banFile.hasNextLine())
        {
            
            String[] ban = banFile.nextLine().split(",");
            
            int countryID = Integer.parseInt(ban[0]); 
            int gameID = Integer.parseInt(ban[1]); 
            String banReason = ban[2]; 
            System.out.println(banReason);
            Boolean insertBan = stmt.execute("Insert Into Banned_In values (" + countryID + "," + gameID + ",'" + banReason + "')");
        }
        banFile.close(); 
        
        
        }catch(Exception excep){
            
        } 
    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Queries().setVisible(true);
                    }
                });
    }
    
}
