package com.mycompany.praktikum_1dan2;

/**
 *
 * @author Kepin
 */
class Bagian_2 {
    public static void main (String[]args) {

        int umur = 20;
        String nama = "kevin";
        float tinggi = 175.5f;
        boolean mahasiswa = true ;
        System.out.println("nama   : "+nama);
        System.out.println("umur   : "+umur);
        System.out.println("tinggi : "+tinggi);
        System.out.println("status : "+mahasiswa);
        
        //operator dasar aritmatika
        int a= 20;
        int b= 23;
        int c= a+b;
        
        //Operator Aritmatika
        System.out.println("Operator aritmatika dasar");
        System.out.println("a tambah b :"+(a+b));
        System.out.println("a kurang b:"+(a-b));
        System.out.println("a bagi b:"+(a/b));
        System.out.println("a kali b :"+(a*b));
        System.out.println("a tambah c :"+(a+c));
        
        
        // Operator Perbandingan
        System.out.println("ini adalah operator perbandingan");
        System.out.println(a == b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        
        
        // array 1 dimensi
        int[] var1 = new int[10]; //10 elemen array

        
        var1[5] = 65;
        var1[9] = 10;

        
        var1[0] = var1[5] + var1[9];  

        // Menampilkan hasil
        System.out.println("var1[0]: " + var1[0]);  
        // Array 2 Dimensi
        System.out.println("array 2 dimensi");
        int twoDim [][] = new int[2][]; 
        twoDim[0] = new int[2]; 
        twoDim[1] = new int[3]; 
         
        twoDim[0][0] = 1 ; 
        twoDim[0][1] = 4 ; 
        twoDim[1][0] = 1 ; 
        twoDim[1][1] = 4 ; 
        twoDim[1][2] = 4 ; 
        System.out.println(twoDim[0][0]); 
        System.out.println(twoDim[0][1]); 
        System.out.println(twoDim[1][0]); 
        System.out.println(twoDim[1][1]);
        System.out.println(twoDim[1][2]);
        
        System.out.println("Array 2 Dimensi (Matriks)");

        // Deklarasi dan inisialisasi array 2D (3x3)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan isi array dalam bentuk matriks
        for (int i = 0; i < matrix.length; i++) { // Loop baris
            for (int j = 0; j < matrix[i].length; j++) { // Loop kolom
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        
        int month = 4; 
        String season; 

        if (month == 12 || month == 1 || month == 2) { 
            season = "Dingin"; 
        } else if (month == 3 || month == 4 || month == 5) { 
            season = "Hujan Gede"; 
        } else if (month == 6 || month == 7 || month == 8) { 
            season = "Panas"; 
        } else if (month == 9 || month == 10 || month == 11) { 
            season = "Gugur"; 
        } else { 
            season = "Tidak diketahui"; 
        } 

        System.out.println("Bulan April masuk musim " + season + ".");
        
        }
    
    }
}