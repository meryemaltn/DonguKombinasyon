import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int nFacto=1;
		int rFacto=1;
        int difFacto=1;
        
        Scanner inp=new Scanner(System.in);
        System.out.println("n De�erini Giriniz: ");
        int n=inp.nextInt();
        
        System.out.println("r De�erini Giriniz: ");
        int r=inp.nextInt();
        int dif=n-r;
        
        for(int i=1;i<=n;i++){
            
        	nFacto=nFacto*i;
        }
        System.out.println("n Say�s�n�n Fakt�riyeli : " + nFacto);
        
        for(int j=1; j<=r; j++){
            
        	rFacto=rFacto*j;
        }
        System.out.println("r Say�s�n�n Fakt�riyeli : " + rFacto);
        
        for(int k=1; k<=dif; k++){
            
        	difFacto=difFacto*k;
        }
        System.out.println("(n-r)'nin Fakt�riyeli : " + difFacto);
        
        int x = rFacto*difFacto;
        int comb = nFacto/x;
        
        System.out.println(n + " Say�s�n�n " + r + "'li Kombinasyonu = " + comb);
        }
}
	