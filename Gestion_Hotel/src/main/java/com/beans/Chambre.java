package com.beans;

import java.util.Scanner;

public class Chambre {

    private int NumeroCh;
    private int CatCh;
    private int NbPersonnes;


    public int DonnerNumero() {
        return NumeroCh;
    }

    public int DonnerCateg() {
        return CatCh;
    }

    public int DonnerNbPers() {
        return NbPersonnes;
    }


    public Chambre(int numeroCh, int catCh, int nbPersonnes) {
        NumeroCh = numeroCh;
        CatCh = catCh;
        NbPersonnes = nbPersonnes;
    }

    public int getNumeroCh() {
        return NumeroCh;
    }

    public void setNumeroCh(int numeroCh) {
        NumeroCh = numeroCh;
    }

    public int getCatCh() {
        return CatCh;
    }

    public void setCatCh(int catCh) {
        CatCh = catCh;
    }

    public int getNbPersonnes() {
        return NbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        NbPersonnes = nbPersonnes;
    }

    public int DonnerPrix(int[][] PtabPrix) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la categorie choisie");
        int categorie = sc.nextInt();
        System.out.println("Vous etes combien de personne ");
        int capacite = sc.nextInt();
        int valeur = -1;

        for (int i = 0; i < PtabPrix.length; i++) {

            for (int j = 0; j < PtabPrix[i].length; j++) {

                valeur = PtabPrix[capacite - 1][categorie - 1];
                if (valeur == 0) {
                    System.out.println("Pas de place");
                    System.out.println(valeur);
                    break;
                }

            }
            System.out.println("le prix : " + valeur);
            break;
        }
        return valeur;
    }

    public void AffichDescrip(String[] PtabDescript) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la categorie choisie");
        int categorie = sc.nextInt();

        String nom = PtabDescript[categorie - 1];

        for (int i = 0; i < PtabDescript.length; i++) {
            if (PtabDescript[i].equals(nom)) {
                System.out.println("La description : " + PtabDescript[i]);
            }
        }
    }



}

