import java.io.BufferedReader;
import java.io.FileReader;


public class READ {
    public String leer (String Archivo)//archivo
    {
        String texto="";
        try
        {
            BufferedReader leert =new BufferedReader(new FileReader(Archivo));
            String temp = "";
            String bfleer;
            while((bfleer= leert.readLine())!=null) //Cliclo de lectura
            {
                temp=temp+bfleer;//Guardar el texto del archivo 
            }
            texto=temp;
        }
        catch(Exception e)
        {
            System.out.print("ERORR.-ARCHIVO NO ENCONTRADO");

        }
        return texto;
    }
}
