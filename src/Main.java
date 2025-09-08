import java.util.Scanner;
//teeest
public class Main {
    public static void main(String[] args){
        //AuraTest
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        //Anderer Test
        while(true){
            calculator.calculator();
            System.out.println("Sind Sie ferig? (y/n)");
            char c = sc.next().charAt(0);
            if(c == 'y' || c == 'Y'){
                break;
            }
            else if(c == 'n' || c == 'N'){
                continue;
            }
            else{
                System.out.println("Die Eingabe ("+ c +") ist falsch");
                System.out.println("Versuchen Sie nochmal");
                char c1;
                while(true){
                    c1 = sc.next().charAt(0);
                    if(c1 == 'y'){
                        break;
                    }
                    else if(c1 == 'Y'){
                        break;
                    }
                    else if(c1 == 'n'){
                        break;
                    }
                    else if(c1 == 'N'){
                        break;
                    }
                    else{
                        System.out.println("Die Eingabe ("+ c1 +") ist falsch");
                        System.out.println("Versuchen Sie nochmal");
                        continue;
                    }
                }
                if(c1 == 'y' || c1 == 'Y'){
                    break;
                }
                else {
                    continue;
                }
            }
        }
    }
}