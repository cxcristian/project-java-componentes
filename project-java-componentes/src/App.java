public class App {
    public static void main(String[] args) throws Exception {
        
        // Creaacion de la instancia de Vehiculo
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", "ABC-123", 2022);

        //  Creacion de las instancias para todo ese poco de componentes-clases  con datos 
        Motor motor = new Motor("Gasolina", "2.0L", 169);
        Transmision transmision = new Transmision("Automatica", 10, "Delantera");
        Chasis chasis = new Chasis("Monocasco", 1300, 1.78, 4.63, 1.43);
        Neumatico neumaticos = new Neumatico("Michelin", 16, 32.0);
        SistemaFrenos frenos = new SistemaFrenos("Discos Ventilados", "Activo", true, 4);
        SistemaElectrico sistemaElectrico = new SistemaElectrico(12, true, true);
        RegistroVehicular registro = new RegistroVehicular("ABC-123xd", "Cristian Gato", "2022-01-15");
        Mantenimiento mantenimiento = new Mantenimiento("Cambio de aceite", "2023-11-10", 75.50, true);
        Sensor sensores = new Sensor(60.0, 90.5, 32.5, 15.2);

        //  Asignacion de cada componente al vehículo usando  setters
        miVehiculo.setMotor(motor);
        miVehiculo.setTransmision(transmision);
        miVehiculo.setChasis(chasis);
        miVehiculo.setNeumatico(neumaticos);
        miVehiculo.setSistemaFrenos(frenos);
        miVehiculo.setSistemaElectrico(sistemaElectrico);
        miVehiculo.setRegistroVehicular(registro);
        miVehiculo.setMantenimiento(mantenimiento);
        miVehiculo.setSensor(sensores);

        // Imprimir todos los asquerosos detalles del vehículo y sus componentes
        System.out.println("=============================================");
        System.out.println("      DETALLES COMPLETOS DEL VEHÍCULO");
        System.out.println("=============================================");
        System.out.println("Vehiculo creado exitosamente!");
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Modelo: " + miVehiculo.getModelo());
        System.out.println("Año: " + miVehiculo.getAnio());
        System.out.println("Matricula Vehículo: " + miVehiculo.getMatricula());
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles del Registro Vehicular:");
        System.out.println("  - Matrícula Registro: " + miVehiculo.getRegistroVehicular().getMatricula());
        System.out.println("  - Propietario: " + miVehiculo.getRegistroVehicular().getPropietario());
        System.out.println("  - Fecha de Registro: " + miVehiculo.getRegistroVehicular().getFechaRegistro());
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles del Motor:");
        System.out.println("  - Tipo: " + miVehiculo.getMotor().getTipo());
        System.out.println("  - Cilindrada: " + miVehiculo.getMotor().getCilindrada());
        System.out.println("  - Potencia: " + miVehiculo.getMotor().getPotencia() + " HP");
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles de la Transmisión:");
        System.out.println("  - Tipo: " + miVehiculo.getTransmision().getTipo());
        System.out.println("  - Marchas: " + miVehiculo.getTransmision().getMarchas());
        System.out.println("  - Tracción: " + miVehiculo.getTransmision().getTraccion());
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles del Chasis:");
        System.out.println("  - Tipo: " + miVehiculo.getChasis().getTipo());
        System.out.println("  - Peso: " + miVehiculo.getChasis().getPeso() + " kg");
        System.out.println("  - Ancho: " + miVehiculo.getChasis().getAncho() + " m");
        System.out.println("  - Largo: " + miVehiculo.getChasis().getLargo() + " m");
        System.out.println("  - Alto: " + miVehiculo.getChasis().getAlto() + " m");
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles de los Neumáticos:");
        System.out.println("  - Marca: " + miVehiculo.getNeumatico().getMarca());
        System.out.println("  - Tamaño: " + miVehiculo.getNeumatico().getTamaño() + " pulgadas");
        System.out.println("  - Presión: " + miVehiculo.getNeumatico().getPresion() + " PSI");
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles del Sistema de Frenos:");
        System.out.println("  - Tipo: " + miVehiculo.getSistemaFrenos().getTipo());
        System.out.println("  - Estado: " + miVehiculo.getSistemaFrenos().getEstado());
        System.out.println("  - ABS: " + (miVehiculo.getSistemaFrenos().getAbs() ? "Si" : "No"));
        System.out.println("  - Discos: " + miVehiculo.getSistemaFrenos().getDiscos());
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Detalles del Sistema Eléctrico:");
        System.out.println("  - Batería: " + miVehiculo.getSistemaElectrico().getBateria() + "V");
        System.out.println("  - Luces: " + (miVehiculo.getSistemaElectrico().getLuces() ? "Encendidas" : "Apagadas"));
        System.out.println("  - Estado de Sensores: " + (miVehiculo.getSistemaElectrico().getEstadoSensores() ? "Activos" : "Inactivos"));
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Estado de los Sensores:");
        System.out.println("  - Velocidad: " + miVehiculo.getSensor().getVelocidad() + " km/h");
        System.out.println("  - Temperatura del motor: " + miVehiculo.getSensor().getTemperatura() + " °C");
        System.out.println("  - Presión de neumáticos: " + miVehiculo.getSensor().getPresion() + " PSI");
        System.out.println("  - Nivel de combustible: " + miVehiculo.getSensor().getNivelCombustible() + " %");
        System.out.println("---------------------------------------------");

        System.out.println("\n>> Estado del Último Mantenimiento:");
        System.out.println("  - Descripción: " + miVehiculo.getMantenimiento().getDescripcion());
        System.out.println("  - Fecha: " + miVehiculo.getMantenimiento().getFecha());
        System.out.println("  - Costo: $" + miVehiculo.getMantenimiento().getCosto());
        System.out.println("  - Realizado: " + (miVehiculo.getMantenimiento().isRealizado() ? "Si" : "No"));
        System.out.println("=============================================");
    }
}