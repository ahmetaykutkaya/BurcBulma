import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
     Scanner input =new Scanner(System.in);

     int month,day;
     String burc = "";
     boolean error = false;

        System.out.print("Dogdugunuz ay : ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gun : ");
        day = input.nextInt();

        if (month == 1 ){
            if((day >= 1 ) && (day <=31)){
                if (day <= 21){
                    burc = "Oglak";
                }
                else{
                    burc ="Kova";
                }
            }else {
                error =true;
            }
        } else if (month == 2) {
            if ((day >= 1 ) && (day <=30)){
                if (day <= 19){
                    burc = "Kova";
                }
                else {
                    burc="Balik";
                }
            }else {
                error =true;
            }

        } else if (month==3) {
            if ((day >= 1 ) && (day <=30)) {
                if (day <= 20){
                    burc = "Balik";
                }
                else {
                    burc ="Koc";
                }
            }else {
                error =true;
            }
        } else if (month==4 ) {
            if ((day >= 1 ) && (day <=30)){
                if (day <=20){
                    burc ="Koc";
                }
                else{
                    burc ="Boga";
                }
            }else {
                error = true;
            }
        } else if (month==5 ) {
            if ((day >= 1 ) && (day <=30)){
                if (day <= 21){
                    burc ="Boga";
                }
                else{
                    burc ="ikizler";
                }
            }else {
                error=true;
            }
        }else if (month==6 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "ikizler";
                } else {
                    burc = "Yengec";
                }
            } else {
                error = true;
            }

        }else if (month==7 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            } else {
                error = true;
            }
        }else if (month==8 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            } else {
                error = true;
            }
        }else if (month==9 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            } else {
                error = true;
            }
        }else if (month==10 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                error = true;
            }
        }else if (month==11 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                error = true;
            }
        }else if (month==12 ) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "Yay";
                } else {
                    burc = "Yay";
                }
            } else {
                error = true;
            }
        }

        if (error){
            System.out.print("Hatalı giris yaptınızz...");
        }
        else {
            System.out.print("Burcunuz : "+burc);
        }
    }

}