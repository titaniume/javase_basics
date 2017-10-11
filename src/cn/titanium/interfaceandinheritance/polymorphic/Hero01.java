package cn.titanium.interfaceandinheritance.polymorphic;

public class Hero01 {
	 public String name; 
	    protected float hp;
	 
	    public void useItem(Item i){
	        i.effect();
	    }
	    
	    public void kill(Mortal m){
	    	m.die();
	    }
	 
	    public static void main(String[] args) {
	         
	    	Hero01 garen =  new Hero01();
	        garen.name = "盖伦";
	     
	        LifePotion lp =new LifePotion();
	        MagicPotion mp =new MagicPotion();
	         
	        garen.useItem(lp);
	        garen.useItem(mp);   
	        
	        
	        APHero ap = new APHero();
	        ADHero ad = new ADHero();
	        ADAPHero adp = new ADAPHero();
	        
	        garen.kill(ap);
	        garen.kill(ad);
	        garen.kill(adp);
	         
	    }
}

