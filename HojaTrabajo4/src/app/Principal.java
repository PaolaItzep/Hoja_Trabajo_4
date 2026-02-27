package app;

import calculator.InfixToPostfix;
import calculator.PostfixCalculator;
import factory.StackFactory;
import stack.Stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in);
             Scanner fileReader = new Scanner(new File("datos.txt"))) {

            if (!fileReader.hasNextLine()) {
                System.out.println("El archivo está vacío.");
                return;
            }

            String infix = fileReader.nextLine();
            System.out.println("Expresión leída: " + infix);

            StackFactory factory = StackFactory.getInstance();

            System.out.println("Seleccione implementación (vector / arraylist / lista): ");
            String tipo = input.nextLine();

            Stack<Integer> stackInt;
            Stack<Character> stackChar;

            if (tipo.equalsIgnoreCase("lista")) {

                System.out.println("Seleccione tipo de lista (simple / doble): ");
                String tipoLista = input.nextLine();

                stackInt = factory.getStack("lista", tipoLista);
                stackChar = factory.getStack("lista", tipoLista);

            } else {

                stackInt = factory.getStack(tipo, null);
                stackChar = factory.getStack(tipo, null);
            }

            // Convertir infix → postfix
            InfixToPostfix converter = new InfixToPostfix(stackChar);
            String postfix = converter.convert(infix);

            System.out.println("Postfix: " + postfix);

            // Evaluar postfix
            PostfixCalculator calculator = new PostfixCalculator(stackInt);
            int result = calculator.evaluate(postfix);

            System.out.println("Resultado: " + result);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo datos.txt");
        }
    }
}