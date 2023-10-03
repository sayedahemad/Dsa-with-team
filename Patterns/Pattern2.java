

public class Pattern2 {

    static void pattern23(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    static void pattern24(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }

    static void pattern25(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2!=0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }

    static void pattern26(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i)
                    System.out.print(1);
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern27(int n){
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=n;j++){
                if(num==10)
                    num=1;
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int i=n;i>=1;i--){
            int num=n-i+1;
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(num++);
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            int num=n-i+1;
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(num++);
            System.out.println();
        }
    }

    static void pattern31(char ch){
        int condition=ch-'A';
        char alpha='A';
        for(int i=1;i<=condition;i++){
            for(int j=1;j<=condition-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++){
                if(k==1 || k==i)
                    System.out.print(alpha+" ");
                else
                    System.out.print("  ");
            }
            alpha++;
            System.out.println();
        }
        alpha--;
        alpha--;
        for(int i=condition-1;i>=1;i--){
            for(int j=1;j<=condition-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++){
                if(k==1 || k==i)
                    System.out.print(alpha+" ");
                else
                    System.out.print("  ");
            }
            alpha--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern31('P');
    }
}
