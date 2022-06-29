import com.beans.Chambre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [][] TabPrix = new int[4][6];

        TabPrix = new int[][]{
                {100, 120, 130, 150, 0, 0},
                {130, 160, 170, 190, 0, 0},
                {170,200,210,230,270,350},
                {200,230,240,260,300,400}
        };

        String [] TabDescript = new String[6];

        TabDescript = new String[]{"Lavabo","WC Télévision","Cabine Douche, Télévision","WC, Cabine Douche,Télévision" ,"WC, Salle de bain + Douche, Télévision", "2 pièces, Salle de bain + douche, WC, Télévision"};

        int nombre_personne = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entrez la categorie choisie");
//        int categorie = sc.nextInt();
//        System.out.println("Vous etes combien de personne ");
//        int capacite = sc.nextInt();
//
////        int valeur = -1;
////
//        for(int i = 0; i<TabPrix.length;i++){
//
//            for (int j = 0;j<TabPrix[i].length;j++){
//
//                valeur = TabPrix[capacite-1][categorie-1] ;
//                if(valeur == 0 ){
//                    System.out.println("Pas de place");
//                    System.out.println(valeur);
//                    break;
//                }
//
//            }
//            System.out.println("le prix : "+valeur);break;
//        }

////        String nom = TabDescript[categorie-1];
//
//        for (int i=0; i< TabDescript.length;i++){
//            if (TabDescript[i].equals(nom) ){
//                System.out.println("La description : "+TabDescript[i]);
//            }
//        }





//        while (nombre_personne <= 4){
//
//            for (int i = 0; i < TabPrix.length; i++)
//            {
//                for (int j = 0; (TabPrix[i] != null && j < TabPrix[i].length); j++) {
//                    System.out.print(TabPrix[i][j] + "\t");
//                }
//
//                System.out.println();
//            }
//            for (int i = 0; i < TabDescript.length; i++)
//*

        Chambre[][] tabCh = new Chambre[][6][4];
        // affectation de valeurs dans le tableau

        Chambre[][][] = new Chambre(1,2,1);



        tabCh[2] = new Chambre(3,3,1);
        tabCh[3] = new Chambre(4,1);
        tabCh[4] = new Chambre(5,1,2);
        tabCh[5] = new Chambre(2,2);
        tabCh[6] = new Chambre(7,3,2);
        tabCh[7] = new Chambre(4,2);
        tabCh[8] = new Chambre(9,1,3);
        tabCh[9] = new Chambre(12,3);
        tabCh[10] = new Chambre(11,3,3);
        tabCh[11] = new Chambre(12,4,3);
        tabCh[12] = new Chambre(13,5,3);
        tabCh[13] = new Chambre(14,6,3);
        tabCh[14] = new Chambre(15,1,4);
        tabCh[15] = new Chambre(16,2,4);
        tabCh[16] = new Chambre(17,3,4);
        tabCh[17] = new Chambre(18,4,4);
        tabCh[18] = new Chambre(19,5,4);
        tabCh[19] = new Chambre(20,6,4);
        tabCh[20] = new Chambre(21,1,1);
        tabCh[21] = new Chambre(22,2,2);
        tabCh[22] = new Chambre(23,1,2);
        tabCh[23] = new Chambre(24,3,1);
        tabCh[24] = new Chambre(25,3,2);
        tabCh[25] = new Chambre(26,4,4);
        tabCh[26] = new Chambre(27,5,4);
        tabCh[27] = new Chambre(28,2,2);
        tabCh[28] = new Chambre(29,4,3);
        tabCh[29] = new Chambre(30,3,2);
        tabCh[30] = new Chambre(31,4,2);



    }
    }
