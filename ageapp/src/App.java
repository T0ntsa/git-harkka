public class App {
    public static void main(String[] args) throws Exception {


        int ika = 65;


        // Tulostusehdot
        
        if (ika > 0 && ika < 18) {

            System.out.println("Olet alaikäinen");
                
                if (ika >= 15) {
                    if (ika == 16 || ika == 17) {
                        System.out.println("Saat ajaa kevaria");
                    }
                    else {
                        System.out.println("Saat ajaa mopoa"); 
                    }
                }            
            }
            
            else if (ika == 18) {
                System.out.println("Olet nyt täysi-ikäinen. Saat nyt ajaa autoa");
            }

            else if (isTenthNumber(ika)) {
                if (ika == 100){
                    System.out.println("On-");
                    System.out.println("nit-");
                    System.out.println("telut satkusta");
                }
                else {
                    System.out.println("Onnea vuosikymmenistä");
                }
            }
    
            
            // Tehtävä 7: 40–50 -vuotiaille toivota parasta keski-ikää


            else if (ika >= 58 && ika <= 64) {
                System.out.println("MENE VARHAISELÄKKEELLE");
            }

            else if (ika >= 65) {
            System.out.println("Olet eläkeläinen, GG");
            }
            
            else {
            System.out.println("Olet aikuinen");
            }
    }

    public static boolean isTenthNumber(int number) {
        return number % 10 == 0;
    }
    
}
