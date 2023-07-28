
package matrisintranspozu;

import java.util.Arrays;
import java.util.Scanner;

public class MatrisinTranspozu {

    public static void main(String[] args) {
      
        Scanner scanner= new Scanner(System.in);
        
        int rows,columns;
        
        System.out.print("Matrisin satir sayisini girin: ");
        rows=scanner.nextInt();
        
        System.out.print("Matrisin sutun sayisini girin: ");
        columns=scanner.nextInt();
        
        int[][] matrix=new int[rows][columns];
        int[][]transpose= new int[columns][rows];
        
        System.out.println("Matrisin satir sutun degerlerini giriniz: ");
        
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                matrix[i][j]=scanner.nextInt();
            }
            
            System.out.println();
        }
        
        //Matrisin kendisini yazdirma
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        //Matrisin transpozunu bulma
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                transpose[j][i]=matrix[i][j];
            }
            System.out.println();
        }
        
        //Matrisin transpozunu yazdırma
        System.out.println("Matrisin transpozu: ");
        
        for(int[] t : transpose){
            System.out.println(Arrays.toString(t));
        }
        
              
    }
    
}
