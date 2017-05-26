public class GalToLit{
    public static void main(String args[]){
        double galons,result;
        galons=10;
        for(galons=1;galons<100;galons++)
        {
            result=galons*3.7854;
           
            System.out.println("There are "+result+" liters in " +galons+" galons");
            if(galons%10==0)
            {
                System.out.println();
            }
        }
    }
}