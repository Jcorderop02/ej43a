/*
 * Copyright [2021] [Juan Cordero]
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package aplicacion;

import dominio.Asignatura;
import dominio.Curso;

/**
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 19/10/21
 */
public class Principal {
    public static void main(String[] args){
        Asignatura mates = new Asignatura();
        mates.setNombre("Mates");
        Asignatura pr1 = new Asignatura();
        pr1.setNombre("Programacion I");

        Curso primero = new Curso();
        primero.setNombre("Primero");
        primero.addAsignatura(mates);
        primero.addAsignatura(pr1);

        System.out.println(primero);

    }
}

/*
 * Ejemplo de como crear ArrayList, añadir valores a la ArrayList y como imprimir lo que contiene la ArrayList con un bucle
 */

        /*import java.util.ArrayList;
        /*
         * Crea una Arraylist de Strings
         */
        /*ArrayList<String> textos = new ArrayList<>();
        Añades strings a la ArrayList
        textos.add("Camiseta");
        textos.add("Pantalon");
        Haces print de la posicion 0 de la ArrayList (Camiseta)
        System.out.println(textos.get(0));*/

        //int i = 0;

        /*
         * Bucle para imprimir lo que contiene la ArrayList
         */
        /*while(i < textos.size()){
            System.out.println(textos.get(i));
            i++;*/
