public class advancedPatterns {

    public static void main(String[] args) {
        // hollow rectangle 
        System.out.println("Hollow Rectangle");
        for(int i= 0; i<4;i++){
            for(int j= 0;j<5;j++){
                if(i==0||i==3)
                    System.out.print("*");
                else if(j==0||j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //INVERTED & ROTATED HALF-PYRAMID
        System.out.println("Inverted and Rotated half pyramid");
        for(int i=1;i<=4;i++){
            for(int j=0;j<=(3-i);j++)
                System.out.print(" ");
            for(int k=0;k<i;k++)
                System.out.print("*");
            System.out.println();
            
        }

        System.out.println();

        //INVERTED HALF-PYRAMID with Numbers pattern
        System.out.println("Inverted half pyramid with no.");
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println();
        //FLOYD'S Triangle pattern
        System.out.println("Floyd's Triangle pattern");
        int x=1;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
               if((i+j)%2==0)
                System.out.print("1 ");
               else
                System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();

        //butterfly
        System.out.println("Butterfly");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=2*(4-i);k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=2*(4-i);k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Solid Rhombus
        System.out.println("Solid Rhombus");
        for(int i=0;i<=4;i++){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Hollow Rhombus
        System.out.println("Hollow Rhombus");
        for(int i=0;i<=4;i++){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                if(i==0||i==4)
                    System.out.print("*");
                else if(j==0||j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //DIAMOND pattern
        System.out.println("Diamond Pyramind");
        for(int i=0;i<=3;i++){
            for(int j=3-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=3-i;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            for(int j=2-i;j>=0;j--)
                System.out.print("*");
            for(int j=2-i;j>0;j--)
                System.out.print("*");
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        //NUMBER PYRAMID pattern
        System.out.println("Number Pyramind pattern");
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--)
                System.out.print(" ");
            for(int j=0;j<i;j++)
                System.out.print(i+" ");
            for(int j=5;j>i;j--)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        //PALINDROMIC Pattern with Numbers pattern
        System.out.println("PALINDROMIC Pattern with Numbers pattern");
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--)
                System.out.print(" ");
            for(int j=i;j>0;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            for(int j=5;j>i;j--)
                System.out.print(" ");
            System.out.println();
        }


    }
}