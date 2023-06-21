import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {

        Path arquivo = Path.of("/Users/pedro/desktop/teste.txt");
        try{
            Files.createFile(arquivo);

        }catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
