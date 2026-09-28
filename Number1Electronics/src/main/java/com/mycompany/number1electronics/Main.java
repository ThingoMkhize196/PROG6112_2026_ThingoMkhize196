/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author emeris
 */
public class Main {

    public static void main(String[] args) {
        String [] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };
    
    int [][] sales = {
        {1000,2000,3000},
        //Cape Town
        {2000,3000,4000},
        //Port Elizabeth
        {1500,1100,1200}
        //Pretoria
    };
    
        
        for (int i = 0; i < sales.length; i++)  {
            for (int j = 0; j < sales[i].length; j++)  {
                System.out.println(sales[i][j]);
                
                int total = sales[i][0] + sales[i][1] + sales[i][2];
                
                int totalSales = 0;
                String highestCity = "";
                if(total > totalSales)  {
                    totalSales = total;
                    highestCity = cities[i];
                }
            }
            System.out.println("------------------------------------------");
        System.out.println("-----------GAMING CONSOLE REPORT----------");
        System.out.println("------------------------------------------");
        System.out.println("                    PS5\t\tXBOX\t\tSWITCH");
        System.out.print((cities[0]));
        System.out.print("\t" + sales[0][0] + "\t\t");
        System.out.print(sales[0][1] + "\t\t");
        System.out.println(sales[0][2]);
        System.out.print((cities[1]));
        System.out.print("\t" + sales[1][0] + "\t\t");
        System.out.print(sales[1][1] + "\t\t");
        System.out.println(sales[1][2]);
        System.out.print((cities[2]));
        System.out.print("\t" + sales[2][0] + "\t\t");
        System.out.print(sales[2][1] + "\t\t");
        System.out.println(sales[2][2]);
        System.out.println("-------------------------------------------------");
        System.out.println("---------CONSOLE SALES FOR EACH CITY-------------");
        System.out.println("-------------------------------------------------");
        System.out.print((cities[i])+ "\t\t" + total[i]);
        System.out.print((cities[1])+ "\t\t" + total[i]);
        System.out.print((cities[2])+ "\t\t" + total[i]);
        }
        
    }
}
