package asalsayithread;

public class AsalSayiThread extends Thread
{
    int ilk, son;
    int sayidizisi[];
    
    public AsalSayiThread(int sayidizisi[], int ilk, int son)
    {
        this.sayidizisi = sayidizisi;
        this.ilk = ilk;
        this.son = son;
    }
    
    public void run()
    {
        for (int i=ilk; i<son; i++)
        {
            int sayac=0;
            for(int j=2; j<sayidizisi[i];j++)
            {
                if(sayidizisi[i]%j==0)
                    sayac++;
                if(sayac==1)
                    System.out.println("ASAL: "+sayidizisi[i]);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int sayidizisi[] = new int[10000];
        
        for(int i=0; i<sayidizisi.length; i++)
        {
            int random = (int)(Math.random()*100);
            sayidizisi[i] = random;
        }
        
        AsalSayiThread m1 = new AsalSayiThread(sayidizisi,0,2500);
        AsalSayiThread m2 = new AsalSayiThread(sayidizisi,2500,5000);
        AsalSayiThread m3 = new AsalSayiThread(sayidizisi,5000,7500);
        AsalSayiThread m4 = new AsalSayiThread(sayidizisi,7500,10000);
        
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        
    }
    
}
