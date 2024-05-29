package paquete;

public class Principal {
    package paquete;

    public class Gelatina {
        //Atributos (caracteristicas)
        String color;                //tipo de dato  atributo;
        String sabor;


        /*Metodos (permite que establezcamos los valores de los atributos  ) */

        // uso el metodo getter para obtener el valor de los atributos

        public String getColor(){
            return this.color; //retorno el atributo color, para hacer referencia
            //al atributo color uso la palabra reservada this
        }
        public String getSabor(){
            return this.sabor; //retorno el atributo sabor,para hacer referencia
            //al atributo color uso la palabra reservada this
        }

        // Utilizo el metodo Setters para configurar el valor de los atributos

        //void porque no va a retornar nada
        public void setColor(String c){    //Con esto vamos a configurar un color especifico
            //Para ello usamos un argumento de tipo string con el nombre c
            this.color=c;         //Nuestro atributo va a ser igual al color de entrada de esta funcion

        }

        public void setSabor(String s){ //s se va a guardar en el atributo sabor
            this.sabor=s;
        }
        //Metodo para obtener toda la informacion de nuestros atributos

        public void mostrarInfo(){
            System.out.println("Información de la gelatina: ");
            System.out.println("Sabor: "+getSabor());
            System.out.println("Color: "+getColor());
        }

    }
}
