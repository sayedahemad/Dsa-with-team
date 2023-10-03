class Pattern{

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
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

    static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i*2+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int i=n-2;i>=0;i--){
            for(int j=1;j<=i*2+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
            for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }        
    }

    static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++){
                if(k==1 || k==i || i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for(int i=1,num=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for(int i=1;i<=n;i++){
            int num=n;
            for(int j=1;j<=i;j++){
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2+1;k++){
                if(i%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2+1;k++){
                if(i%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }        
    }

    static void pattern18(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j) % 2 ==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }

    static void pattern21(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=12;j++){
                if(j<=i)
                    System.out.print("S");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        for(int i=0;i<n;i++){
            int num=i+1;
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i*2+1;j++){
                if(j<=i)
                    System.out.print(num--);
                else
                    System.out.print(num++);
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            int num=i+1;
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i*2+1;j++){
                if(j<=i)
                    System.out.print(num--);
                else
                    System.out.print(num++);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        pattern22(5);
    }
}