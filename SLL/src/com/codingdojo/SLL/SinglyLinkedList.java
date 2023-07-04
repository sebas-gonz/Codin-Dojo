package com.codingdojo.SLL;

public class SinglyLinkedList {
	
	public Node puntero;
	
	//Crear un método constructor para establecer head en null para los objetos de su SinglyLinkedList.
	
	public SinglyLinkedList() {
		this.puntero = null;
	}

	// Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar
	// nodos a la lista.
	public void add(int value) {
		Node nuevoNodo = new Node(value);

		if (puntero == null) {
			puntero = nuevoNodo;
		} else {
			Node actual = puntero;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevoNodo;
		}
	}
	
	 //Crear un método remove() que removerá un nodo del final de su lista.

	public void remove() {
		if (puntero == null) {
			return;
		} else if (puntero.siguiente == null) {
			puntero = null;
		} else {
			Node actual = puntero;
			Node anterior = actual;
			while(actual.siguiente!= null) {
				anterior = actual;
				actual = actual.siguiente;
			}
			anterior.siguiente = null;
			actual = anterior;
			
			
		}

	}
	//Crear un método printValues() que mostrará en pantalla todos los valores de cada nodo de la lista en el mismo orden que fue creada.
	
	public void printValues() {
		Node actual = puntero;

		while (actual != null) {
			System.out.println(actual.valor);
			actual= actual.siguiente;
		}
	}
	
	//Implementar un método find(int) que retornará el primer nodo con el valor dado en los parámetros.
	
	public void find(int valor) {
        Node actual = puntero;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.valor == valor) {
               System.out.println(actual.valor);
               encontrado = true;

            }
            actual = actual.siguiente;
        }
        if(encontrado == false) {
        System.out.println("No se encuentra el valor");
        }
	}
	
	//Implementar un método removeAt(int) que removerá un nodo después de n nodos, donde n es el parámetro
	//Por ejemplo, si n es 0 removerá el primer nodo, si n es 1 removerá el segundo nodo. Similar a los arrays.
	
	 public void removeAt(int numero) {
	        if (puntero == null || numero < 0) {
	            
	            return;
	        } else if (numero == 0) {
	          
	            puntero = puntero.siguiente;
	        } else {
	            Node actual = puntero;
	            int contador = 0;
	            while (actual != null && contador < numero) {
	                if (contador == numero - 1 && actual.siguiente != null) {
	                    actual.siguiente = actual.siguiente.siguiente;
	                     System.out.println("\n Nodo eliminado");
	                    break;
	                }
	                actual = actual.siguiente;
	                contador++;
	            }
	        }
	 }
}
