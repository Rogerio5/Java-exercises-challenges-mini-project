package Desafios2;



import Desafios2.modelos.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2020);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(carro);

        System.out.println("JSON do veículo:");
        System.out.println(json);
    }
}

