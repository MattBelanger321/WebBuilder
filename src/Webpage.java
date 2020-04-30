import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Webpage implements Global {
    private String title;
    private String background;
    public Webpage(String title){
        setTitle(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void build() {
        File userSite = new File(HTMLDIRECTORY+"\\index.html");
        PrintWriter pw = null;
        String tabs = "";
        try {
            pw = new PrintWriter(userSite);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(FILE_NOT_FOUND);
        }

        background = getBackground();

        pw.println(tabs + "<!DOCTYPE html>");
        pw.println(tabs+"<html>");
        tabs += "\t";
        pw.println(tabs+"<head>");
        tabs += "\t";
        pw.printf(tabs+"<title>%s</title>\n",title);
        pw.println(tabs+"<style>");
        tabs += "\t";
        pw.printf(tabs+"body {background-color: %s;}\n",background);
        tabs = tabs.substring(0,tabs.lastIndexOf("\t"));
        pw.println(tabs+"</style>");
        tabs = tabs.substring(0,tabs.lastIndexOf("\t"));
        pw.println("</head>");
        pw.println("<body>");
        tabs += "\t";
        pw.printf("<h1>MADE BY WEBSITE BUILDER %.1f</h1>\n",VERSION);
        tabs = tabs.substring(0,tabs.lastIndexOf("\t"));
        pw.println("</body>");
        tabs = tabs.substring(0,tabs.lastIndexOf("\t"));
        pw.println("<html>");
        pw.close();
    }

    private String getBackground() {
        Scanner scan = new Scanner(System.in);
        String color;
        while(true){
            System.out.println("Please choose a color (1-5): ");
            System.out.printf("1: lightblue\n2: red\n3:yellow\n4:green\n5:black");
            switch(scan.nextInt()){
                case 1:
                    color = "lightblue";
                    break;
                case 2:
                    color = "red";
                    break;
                case 3:
                    color = "yellow";
                    break;
                case 4:
                    color = "green";
                    break;
                case 5:
                    color = "black";
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    continue;
            }
            break;
        }
        return color;
    }
}
