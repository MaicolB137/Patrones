/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtubeex.Proxy;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class YouTubeManager {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CachedYouTubeClass proxy = new CachedYouTubeClass();
        int video=0, inf=0 ,opc;
        System.out.println("1. descargar video: \n"
                + "2. informacion del video: \n"
                + "3 listar los videos: ");
        opc=in.nextInt();
        switch(opc){
            case 1:
                System.out.println("ingrese el video que quiere descargar: ");
                video=in.nextInt();
                proxy.downloadVideo(video);
                break;
            case 2:
                System.out.println("ingrese el video del que quieres saber la informacion: ");
                inf=in.nextInt();
                proxy.getInfo(inf);
                break;
            case 3:
                proxy.listVideo();
                break;
        }
    }
}
