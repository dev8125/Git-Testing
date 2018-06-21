public class WorldCup {

    public void theBest(){
        int random = (int) Math.random();
        if(random==0)
            System.out.println("Spain Wins!");
        if(random==1)
            System.out.println("Mexico Wins!");
        if(random*2 > .05){
            System.out.println("ICELAND FOR THE WIN");
        }

    }
}
