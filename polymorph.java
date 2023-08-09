// public class Item {
//     int weight;
// }

// public class Bag {
//     int currentWeight;
//     boolean canAddItem (Item item);
// }

// boolean canAddItem(Item item) {
//     if (Bag.currentWeight+Item.weight>20){
//         return false
//     }
// }

https://dpaste.org/uTrWT 
https://dpaste.org/uTrWT
About History New snippet
Java Expires in: 4 weeks, 1 day
Delete Now
Raw
Slim
class Item {
    public int weight;
    public Item(int weight){
        this.weight=weight;
    }
}
 
// Sub class
class Pen extends Item {
    public String color;
    public Pen(int weight, String color){
        super(weight); 
        this.color=color;
    }
     
}

class Book extends Item {
    public String author;
    public Book(int weight, String author){
        super(weight); 
        this.author=author;
    }
}

class Coin extends Item {
    public int amount;
    public Coin(int weight, int amount){
        super(weight); 
        this.amount=amount;
    }
}

class Keyboard extends Item {
    public int price;
    public Keyboard(int weight, int price){
        super(weight); 
        this.price=price;
    }
}

class Glass extends Item {
    public int volume;
    public Glass(int weight, int volume){
        super(weight); 
        this.volume=volume;
    }
}

class Laptop extends Item {
    public int price;
    public Laptop(int weight, int price){
        super(weight); 
        this.price=price;
    }
}


class Bag {
    public Item i;
    public int currentWeight=0;
    public Bag(){
        
    }
    public boolean  checkPossible(Item i){
        // System.out.println(i.weight);
         if(currentWeight+i.weight>18){
            // System.out.println("Sorry your bag is full");
            return false;
         }
         else{
            // System.out.println("Added to the bag.");
            currentWeight+=i.weight;
            return true;
         }
    }
}



class HelloWorld {
    public static void main(String[] args) {
        
        Item[] items = new Item[6] ; 
        
        Item pen = new Pen(2,"Black");
        items[0]=pen;
        
        Item book = new Book(10,"J. K. Rowling");
        items[1]=book;
        
        Item coin = new Coin(8,200);
        items[2]=coin;
        
        Item keyboard = new Keyboard(2,200);
        items[3]=keyboard;
        
        Item glass = new Glass(5,150);
        items[4]=glass;
        
        Item laptop = new Laptop(16,50000);
        items[5]=laptop;
        
        
        
        String newline = System.lineSeparator();
        System.out.println("From Forward"+newline);
        Bag b=new Bag();
        boolean ans;
        for(int i=0;i<6;i++){
            ans=b.checkPossible(items[i]); 
            if(ans==true){
                System.out.println("Added to the bag");
            }
            else{
                System.out.println("Sorry your bag is full");
            }
        }
        
        System.out.println("--"+newline);
        System.out.println("--"+newline);
        System.out.println("From Backward"+newline);
        Bag d=new Bag();
        for(int i=5;i>=0;i--){
            ans=d.checkPossible(items[i]); 
            if(ans==true){
                System.out.println("Added to the bag");
            }
            else{
                System.out.println("Sorry your bag is full");
            }
        }
        
        
        
    }
}
Copy Snippet
Edit Snippet
 Wordwrap
class Item {
    public int weight;
    public Item(int weight){
        this.weight=weight;
    }
}
 
// Sub class
class Pen extends Item {
    public String color;
    public Pen(int weight, String color){
        super(weight); 
        this.color=color;
    }
     
}
​
class Book extends Item {
    public String author;
    public Book(int weight, String author){
        super(weight); 
        this.author=author;
    }
}
​
class Coin extends Item {
    public int amount;
    public Coin(int weight, int amount){
        super(weight); 
        this.amount=amount;
    }
}
​
class Keyboard extends Item {
    public int price;
    public Keyboard(int weight, int price){
        super(weight); 
        this.price=price;
    }
}
​
class Glass extends Item {
    public int volume;
    public Glass(int weight, int volume){
        super(weight); 
        this.volume=volume;
    }
}
​
class Laptop extends Item {
    public int price;
    public Laptop(int weight, int price){
        super(weight); 
        this.price=price;
    }
}
​
​
class Bag {
    public Item i;
    public int currentWeight=0;
    public Bag(){
        
    }
    public boolean  checkPossible(Item i){
        // System.out.println(i.weight);
         if(currentWeight+i.weight>18){
            // System.out.println("Sorry your bag is full");
            return false;
         }
         else{
            // System.out.println("Added to the bag.");
            currentWeight+=i.weight;
            return true;
         }
    }
}
​
​
​
class HelloWorld {
    public static void main(String[] args) {
        
        Item[] items = new Item[6] ; 
        
        Item pen = new Pen(2,"Black");
        items[0]=pen;
        
        Item book = new Book(10,"J. K. Rowling");
        items[1]=book;
        
        Item coin = new Coin(8,200);
        items[2]=coin;
        
        Item keyboard = new Keyboard(2,200);
        items[3]=keyboard;
        
        Item glass = new Glass(5,150);
        items[4]=glass;
        
        Item laptop = new Laptop(16,50000);
        items[5]=laptop;
        
        
        
        String newline = System.lineSeparator();
        System.out.println("From Forward"+newline);
        Bag b=new Bag();
        boolean ans;
        for(int i=0;i<6;i++){
            ans=b.checkPossible(items[i]); 
            if(ans==true){
                System.out.println("Added to the bag");
            }
            else{
                System.out.println("Sorry your bag is full");
            }
        }
        
        System.out.println("--"+newline);
        System.out.println("--"+newline);
        System.out.println("From Backward"+newline);
        Bag d=new Bag();
        for(int i=5;i>=0;i--){
            ans=d.checkPossible(items[i]); 
            if(ans==true){
                System.out.println("Added to the bag");
            }
            else{
                System.out.println("Sorry your bag is full");
            }
        }
        
        
        
    }
}