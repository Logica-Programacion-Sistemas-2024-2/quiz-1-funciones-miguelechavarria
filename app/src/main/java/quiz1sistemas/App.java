package quiz1sistemas;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
      
      
        Scanner scanner = new Scanner(System.in);

        int PRECIO_GENERAL = 10000;
        int PRECIO_VIP = 15000;

        int PRECIO_COMBO1  = 40000;
        int PRECIO_COMBO2 = 30000;
        int PRECIO_COMBO3 = 42000;

       
        double DESCUENTO_COMBO1 = 0.05;
        double DESCUENTO_COMBO2 = 0.06;
        double DESCUENTO_COMBO3 = 0.03;

        System.out.println("Ingrese el tipo de boleta (G para General, V para VIP): ");
        char tipoBoleta = scanner.next().charAt(0);

        System.out.println("Ingrese la cantidad de boletas: ");
        int cantidadBoletas = scanner.nextInt();

        
        System.out.println("Ingrese el número del combo que desea comprar (1, 2, 3): ");
        int numeroCombo = scanner.nextInt();

        
        System.out.println("Ingrese la cantidad de combos: ");
        int cantidadCombos = scanner.nextInt();

        
        int valorBoletas = (tipoBoleta == 'G' ? PRECIO_GENERAL : PRECIO_VIP) * cantidadBoletas;

   
        int precioComboSeleccionado = 0;
        double descuentoCombo = 0;

            switch (numeroCombo) {
                case 1:
                    precioComboSeleccionado = PRECIO_COMBO1;
                descuentoCombo = (tipoBoleta == 'V') ? DESCUENTO_COMBO1 : 0;
                    break;
                case 2:
                    precioComboSeleccionado = PRECIO_COMBO2;
                    descuentoCombo = (tipoBoleta == 'V') ? DESCUENTO_COMBO2 : 0;
                    break;
                case 3:
                precioComboSeleccionado = PRECIO_COMBO3;
                descuentoCombo = (tipoBoleta == 'V') ? DESCUENTO_COMBO3 : 0;
                    break;
                default:
                System.out.println("Combo no válido.");
                    return;
        }
    

        
                    double valorNetoCombo = precioComboSeleccionado * cantidadCombos;
                        double valorDescuentoCombo = valorNetoCombo * descuentoCombo;
                            double valorTotalCombo = valorNetoCombo - valorDescuentoCombo;

                double valorTotalFactura = valorBoletas + valorTotalCombo;
    

    

        System.out.println("\nFactura:");

        System.out.println("Tipo de silla comprada: " + (tipoBoleta == 'G' ? "General" : "VIP"));

        System.out.println("Cantidad de sillas compradas: " + cantidadBoletas);

        System.out.println("Valor total de boletas: $"+ valorBoletas);

        System.out.println("Número de Combo seleccionado: " + numeroCombo);

        System.out.println("Cantidad de combos comprados: " + cantidadCombos);

        System.out.println("Valor neto del total del combo: $" + valorNetoCombo);

        System.out.println("Valor del descuento del combo: $" + valorDescuentoCombo);

        System.out.println("Valor total de la factura: $" + valorTotalFactura);{
        
        
    
}

    
}
}
