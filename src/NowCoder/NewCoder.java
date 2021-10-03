package NowCoder;

import java.util.Scanner;

public class NewCoder {
    public static void main4(String[] args) {
        //打印线段图案
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            for(;n>0;n--) System.out.print("*");
            System.out.println("");
        }
    }


    public static void main5(String[] args){
        //打印正方形图案
        //* * * *
        //* * * *
        //* * * *
        //* * * *
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args){
        //打印直角三角形图案
        //*
        //* *
        //* * *
        //* * * *
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main1(String[] args) {
        //打印用“*”组成的翻转直角三角形图案。
        //多组输入，一个整数（2~20），表示翻转直角三角形直角边的长度，即“*”的数量，也表示输出行数。
        //针对每行输入，输出用“*”组成的对应长度的翻转直角三角形，每个“*”后面有一个空格。
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){//打印行数 共n行
                for(int j=n;j>=i;j--){//打印每一行的*个数 从第一行n个开始  到  第n行1个
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main2(String[] args) {
        //打印用“*”组成的带空格直角三角形图案
        //多组输入，一个整数（2~20），表示直角三角形直角边的长度，即“*”的数量，也表示输出行数。
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=n-i;j>0;j--){
                    System.out.print("  ");
                }
                for(int k=i;k>0;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main3(String[] args) {
        //打印金字塔图形
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

}
