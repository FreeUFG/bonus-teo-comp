/*
 Copyright © 2013 Esdras Bispo Jr.
   
 This file is part of BWEvaluator.

 BWEvaluator is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 BWEvaluator is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with BWEvaluator.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.org.freeUFG.teoComp2013;

import java.util.Scanner;

public class BonusTeoComp {

    public static void main(String[] args) {
        System.out.println("==================== Marquina de Turing ====================");
        System.out.println("que lê uma cadeia de caracteres “1” e a transforma em uma cadeia"
                         + " \ncom extremos “1” e seu interior com “0”.\n"
                + "Toda cadeia tem que terminar com o valor de vazio “_”"
                + "Exemplo: 111111111_");
        System.out.print("\n\nInforme a cadeia: ");
        MaquinaTuring mt = new MaquinaTuring();
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        mt.iniciar(palavra);
    }
}
