public class Zeichnen {

    public void baum(int ebenen) {

        int gelb = -1;
        int breite = ebenen * 2 - 1;
        for(int i = 0; i < ebenen; i++) {

            gelb += 2;
            for(int j = 0; j < (breite - gelb) / 2; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < gelb; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    public void raute(int ebenen) {

        int gelb = -1;
        int breite = ebenen - 1;

        for(int i = 0; i < (ebenen - 1) / 2; i++) {

            gelb += 2;
            for(int j = -1; j < (breite - gelb) / 2; j++) {
                System.out.print("_");
            }
            for(int k = 0; k < gelb; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int l = 0; l <= breite; l++) {
            System.out.print("*");
        }
        System.out.println();

        gelb += 2;

        for(int m = 0; m < (ebenen - 1) /2 ; m++) {

            gelb -= 2;
            for(int j = -1; j < (breite - gelb) / 2; j++) {
                System.out.print("_");
            }
            for(int k = 0; k < gelb; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }


    public void raute2(int ebenen) {

        boolean erreicht = false;

        int gelb = 1;

        for(int i = 0; i < ebenen; i++) {

            int leer = (ebenen - gelb) / 2;

            for(int j = 0; j < leer; j++) {
                System.out.print("_");
            }
            for(int k = 0; k < gelb; k++) {
                System.out.print("*");
            }

            if(ebenen == gelb) {
                erreicht = true;
            }

            if(!erreicht) {
                gelb += 2;
            }
            else {
                gelb -= 2;
            }

            System.out.println();
        }

        System.out.println();
    }


    public void zeichenY(int hoehe, int breite) {

        int breiteStrich = breite/2;
        int posRechts = breite;
        int posLinks = 0;

        for(int i = 0; i < hoehe; i++) {

            if(posLinks <= posRechts) {

                for (int j = 0; j < posLinks; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < posRechts; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                posLinks++;
                posRechts -= 2;
                System.out.println();
            }
            else {

                for(int l = 0; l <= breiteStrich; l++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        System.out.println();
    }
}
