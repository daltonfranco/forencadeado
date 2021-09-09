public class Encadeado {

    public void encadeado(int h){

        for(int x = 0; x < (h+2); x++){
            for(int y = 1; y <= x; y++){
                System.out.print(x*y + " ");
            }
            System.out.println("");
        }

    }
    
}