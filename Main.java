package atividade.crud.psc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            mostrarMenu();
        }
        // Menu para interatividade com o usuário
        public static void mostrarMenu(){

            Scanner menu = new Scanner(System.in);
            int opcao ;

            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");opcao = menu.nextInt();


            switch (opcao) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    System.out.println("Sessão Finalizada!");
                    menu.close();
            }
        }
    }
