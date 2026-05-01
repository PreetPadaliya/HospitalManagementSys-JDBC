import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number :");
        int n = input.nextInt();
        int ans = 0;
        int a = (n/7)+1;
        int add=1;
        for(int i=0; i<=a; i++){
            for(int j=1+i; j<=7+i && add<=n; j++){
                ans = ans + j;
                add++;
            }

        }
        System.out.println(ans);




    }
}
