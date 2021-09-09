public class Encadeado {

    public void encadeado(){

        for(int x = 0; x < 5; x++){
            for(int y = 1; y <= x; y++){
                System.out.print(x*y + " ");
            }
            System.out.println("");
        }

    }
    
}