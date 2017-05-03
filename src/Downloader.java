/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author ittraining
 */
public class Downloader {
    public static void download(String link){
        BufferedInputStream bf=null;
        FileOutputStream fos=null;
         try{
            URL url=new URL(link);
            URLConnection conn=url.openConnection();
            int size=conn.getContentLength();
            if(size>0){
                System.out.println("File Size:"+size);
            }
            else{
                System.out.println("Could not retrieve file size");
            }
            bf=new BufferedInputStream(url.openStream());
            String[] a=link.split("/");
            String filename=a[a.length-1];
            fos=new FileOutputStream("C:\\Users\\ittraining"+"/"+filename);
            byte[] data=new byte[1024];
            int count;
            double sumCount=0.0;
            while( (count=bf.read(data,0,1024))!=-1){
                //writing to the disk
                fos.write(data,0,count);
                //calculating percentage of download file
                sumCount+=count;
                    if (size>0){
                    System.out.println(sumCount/size*100+"%");
                }
            }
        }
        catch(Exception e){
            
        }
            
         }
        
 
}