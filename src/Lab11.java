import java.io.*;
public class Lab11 {
    public static void main(String[] args) {
        rd();
    }
    public static void rd(){
        try(BufferedReader read = new BufferedReader(new FileReader("zxz.txt"))){
            String cod;
            boolean prov = false;
            while ((cod = read.readLine()) != null){
                boolean result = cod.matches("^(//.*)|(.*/\\*.*)|(.*\\*/)$");
                if(result){
                    boolean AnResult = cod.matches("^(.*\\*/)$");
                    boolean AnResult_2 = cod.matches("^(.*/\\*.*)$");
                    if(AnResult){
                        prov = false;
                    }
                    else if (AnResult_2){
                        prov = true;
                    }
                    else{
                        prov = false;
                    }
                }
                else if (!prov){
                    wr(cod);
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void wr(String cod){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("zxzz.txt", true))){
            wr.write(cod + "\n");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}