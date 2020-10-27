//media aritmetica a x numere introduse de la taste si afisare in casuta dialog
package com.company;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int nr;
        int suma = 0;
        int mediaAritmetica;
        int numereTotale;

        numereTotale = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti numarul de numere dorite"));//casuta unde  se cer numerele

        for (int i = 1; i <= numereTotale; i++) {
            nr = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti numarul: ")); //introducerea nr intr-o casuta de dialog
            suma += nr;
        }

        mediaAritmetica = suma / numereTotale;
        JOptionPane.showMessageDialog(null, "Media aritmetica este " + mediaAritmetica); //afisarea mediei
    }
}
