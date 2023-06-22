//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n){
    if(n < 0){
        return null;
    }
    else if(n === String){
        return 0;
    }
    let suma = 0;
    for(let i = 1; i <= n; i++){
        suma += i;
    }
    return suma;
}

//devuelve la suma del primer y último número en el array
function sumFirstLast(arr){
    if(arr.length < 2){
        return null;
    }
    else if(arr == Boolean){
        return NaN;
    }
    let suma = 0;
    suma = arr[0] += arr[arr.length-1];
    return suma;
}

//Ejercicio 2
//Ya sea en el mismo archivo o en uno diferente, crea una prueba o función que devuelva la suma del número más grande y el más pequeño del array
//  Por ejemplo, sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12
//  Una vez que hayas escrito la prueba, ejecútala (sin escribir toda la función para asegurarte de que fallen todas las pruebas), luego completa la función cerciorándote de que pase todas las pruebas. 

    function sumMaxMin(arr){

        if(arr.length < 2){
        return false
        }

        let max = arr[0]; min = arr[0];
        for(let i in arr){
            if(arr[i] > max){
                max = arr[i];
            }

            else if (arr[i] < min){
                min = arr[i];
            }
        }
        return max+min;
    }
describe("Sum1toN", function() { 
    it("Deberia retornar 3 cuando se le pase 2 como argumento", function() { 
        expect(Sum1toN(2)).toEqual(3); 
    }); 
    it("Deberia retornar 6 cuando se le pase 3 como argumento", function() { 
        expect(Sum1toN(3)).toEqual(6); 
    }); 
    it("Deberia retornar 10 cuando se le pase 4 como argumento", function() { 
        expect(Sum1toN(4)).toEqual(10); 
    });
    it("Deberia retornar null cuando se le pase un numero negativo como argumento", function() {
        expect(Sum1toN(-1)).toEqual(null);
    });
    it("Deberia retornar 0 cuando se le pase un string como argumento", function(){
        expect(Sum1toN("hola")).toEqual(0);
    })
});
describe("sumFirstLast", function() { 
    it("Deberia retornar 3 cuando se le pase [1,2] como argumento", function() { 
        expect(sumFirstLast([1,2])).toEqual(3); 
    }); 
    it("Deberia retornar 10 cuando se le pase [2,3,8] como argumento", function() { 
        expect(sumFirstLast([2,3,8])).toEqual(10); 
    }); 
    it("Deberia retornar -10 [-6,23,3,-4]", function() { 
        expect(sumFirstLast([-6,23,3,-4])).toEqual(-10); 
    });
    it("Deberia retornar null cuando se le pase un arreglo de largo inferior a 2 como argumento", function() {
        expect(sumFirstLast([1])).toEqual(null);
    })
    it("Deberia retornal not a number cuando se le pase un boleano como argumento", function() {
        expect(sumFirstLast(false)).toEqual(NaN);
    })
});
describe("sumMaxMin", function() {
    it("Deberia retornar 12 si se le pasa [2,4,6,7,3,10] como argumento", function() {
        expect(sumMaxMin([2,4,6,7,3,10])).toEqual(12);
    }) 
    it("Deberia retornar false si el largo del arreglo es inferior a 2", function() {
        expect(sumMaxMin([3])).toEqual(false);
    })
    it("Deberia retornar -12 si se le pasa [-2,-5,-10] como argumento", function() {
        expect(sumMaxMin([-2,-5,-10])).toEqual(-12);
    })
    
})
