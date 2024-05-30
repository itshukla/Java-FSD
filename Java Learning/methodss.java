class computer{
    public void  playMusic(){
        System.out.println("playing music...!");
    }
    public String getMePen(int cost){

        if(cost >= 10)
            return "pen";
        
        return "no pen";
    }
}



public class methodss {

    public static void main(String[] args) {
        computer com = new computer(); 
        com.playMusic();
        String str = com.getMePen(9);
        System.out.println(str);
    }
}
