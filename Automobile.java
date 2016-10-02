// Created:(the Day after CSE and Physics finals were over) ?Monday, ?December ?24, ?2012, ??10:27:46 AM
//     use carefully as this piece of code wont
//        be able to handle the runtime errors e.g. InputMism.etc
//          the code is tried for errors initially only, the later part isn't.
// This is a game where u ride ur vehicles and you make or spend money.
// This piece of code is crappy you will get familiar with it as you continue to play.
// Try to answer these two questions after playing the game:
// How does a player make money?
// and when does his money decrease?
// There are bugs pls ignore them and have fun.
//   Coding is Fun and it takes time :) enjoy coding friends!!!

//Author: Safat Islam(12101066(BU))
//skyscraper1709@gmail.com
import java.util.Scanner;
import java.util.Random;
class TesterForWheels
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        Integer gate=new Integer(0);
        
        System.out.println("Enter\n 1 to open Garage\n 0 to Exit");
        while(true)
        {
            
            try
            {
                gate=k.nextInt(); if(gate instanceof Integer){break;}
            }
            catch(java.util.InputMismatchException ime)
            {
                System.out.println("Invalid Entry.\nPls Enter Again");k.next();
            }
        }
        
        while(true)
        {
            //
                Bicycle bc= new Bicycle();
                Motorbike mb=new Motorbike();
                Sedan sd =new Sedan();
            if(gate==1)
            {
                System.out.println("Welcome to ur Garage Sir."+
                                   "\nWhich one of ur transports would u like to use?"+
                                   "\nEnter\n the corresponding number to retrieve the vehicle of ur choice"+
                                   "\n1)Bicycle\n2)MotorBike\n3)Sedan\n4)Check Money\n0)Exit");
//
                int ck=k.nextInt();
                if(ck==1) 
                {
                        System.out.println("    < ");
                        System.out.println("  _/----||");
                        System.out.println("(__)  (__)");
                    while(true)
                    {
                        // Bicycle bc= new Bicycle();
                        
                        System.out.println("===========>Bicyle Ready\n Enter\n"+"1)Ride Bicycle\n2)Check Tires\n"
                                               +"3)InflateTires\n4)Ring Bell\n5)Check Lock\n"
                                               +"6)Open Lock\n7)Close Lock\n0)Return Bike");
                        int mK=k.nextInt();/*input hw far travel?*/
                        if(mK==1) { System.out.println("How far do u want to ride(km(s))?"); bc.run(k.nextInt());}
                        if(mK==2) { bc.checkTires();}
                        if(mK==3) { bc.inflateTires();}
                        if(mK==4) { bc.makeSound();}
                        if(mK==5) { bc.lockCheck();}
                        if(mK==6) { bc.openLock();}
                        if(mK==7) { bc.closeLock();}
                        if(mK==0) { System.out.println("bikeReturned");break;}
                    }
                }
                if(ck==2) 
                {
                        System.out.println("     <|   ");
                        System.out.println("  _//====|||");
                        System.out.println("(_._)  ((_._))");
                    while(true)
                    {
                        
                        System.out.println("==============>Bike Ready\n Enter\n"+"1)Ride Bike\n2)Check Tires\n"
                                               +"3)InflateTires\n4)Start Engine\n5)Switch engine off\n"
                                               +"6)refuel\n7)Jump\n8)Check Fuel\n9)Horn\n0)Return Bike");
                        int mK=k.nextInt();/*input hw lng travel?*/
                        if(mK==1) { System.out.println("How far do u want to ride(km(s))?"); mb.run(k.nextInt());}
                        if(mK==2) { mb.checkTires();}
                        if(mK==3) { mb.inflateTires();}
                        if(mK==4) { mb.start();}
                        if(mK==5) { mb.switchOff();}
                        if(mK==6) { mb.recharge();}
                        if(mK==7) { mb.jump();}
                        if(mK==8) {mb.checkFuel();}
                        if(mK==9) {mb.makeSound();}
                        if(mK==0) { System.out.println("bikeReturned");mb.switchOff();break;}
                    }
                }
                if(ck==3)
                {
                    System.out.println("        _______/|____"); 
                    System.out.println("       /     |     ||");   
                    System.out.println("      /______|___ {}|____");
                    System.out.println("     /_[]___-______-...._]");
                    System.out.println("    |((_._))        ((_._))");
                    while(true)
                    {
                        System.out.println("=========>Sedan Ready\n Enter\n"+"1)Ride your Mustang Gt 500KR \n2)Check Tires\n"
                                               +"3)InflateTires\n4)Start Engine\n5)Switch engine off\n"
                                               +"6)refuel\n7)Open door\n8)Close door\n9)Check door\n10)Check fuel\n11)Horn\n0)Return Sedan");
                        int mK=k.nextInt();
                        if(mK==1) { System.out.println("How far do u want to ride(km(s))?"); sd.run(k.nextInt());}
                        if(mK==2) { sd.checkTires();}
                        if(mK==3) { sd.inflateTires();}
                        if(mK==4) { sd.start();}
                        if(mK==5) { sd.switchOff();}
                        if(mK==6) { sd.recharge();}
                        if(mK==7) { sd.openDoor();}
                        if(mK==8) { sd.closeDoor();}
                        if(mK==9) { sd.checkDoor();}
                        if(mK==10) { sd.checkFuel();}
                        if(mK==11) {sd.makeSound();}
                        if(mK==0) { System.out.println("Sedan Returned");sd.switchOff();break;}
                    }
                }
                if(ck==4) 
                {
                    System.out.println("You have $"+Automobile.money+" cash.");
                }
                
                if(ck==0) { System.out.println("Thank you sir"); break;}        
            }
            
            if(gate==0)
            {
                System.out.println("Thank you sir");break;
            }
            if(gate>1 || gate<0)
            {
                System.out.println("Pls enter 0 or 1");
                try
                {
                    gate=k.nextInt();
                }
                catch(java.util.InputMismatchException ime)
                {
                    System.out.println("Invalid Entry.\nPls Enter Again");k.next();
                }
            }
        }
    }
}
class GiveScannerToEverybody
{
    static Scanner k=new Scanner(System.in);// its not neccesary to declare this class but i did.
}

class Automobile extends GiveScannerToEverybody
{
    boolean tires=true; int distance=0;double tireHealth=20.0; static double money=200;
    
    void run(int a)
    {
        
        if(tireHealth>0.5)
        {
            tireHealth=tireHealth-(a*0.4);
            
            distance=distance+a;
        }
        else{System.out.println("You have bad tires\nPls repair your tires");}
        System.out.println("Your Current Mileage is: "+distance+"km");
    }
    void checkTires()
    {
        if(tires){System.out.println("Tires ok");}
        else{System.out.println("Pls repair ur tires");}
    }
    void inflateTires()
    {
        tires=true; tireHealth=20.0;
        System.out.println("Tires inflated");
        
    }
    void returnVehicle()
    {
        System.out.println("Vehicle Returned");
    }
}
class PoweredVehicle extends Automobile
{
    boolean engine=false; Double fuel=10.0;
    void run(int a)
    {
        if(engine && tires)
        {
            if(fuel>=0.5)
            {
                fuel=fuel-(a*.075);
                Random r =new Random();
            
            int rn=1+(int)(r.nextDouble()*(10-1+1));
            if(rn<=3) {System.out.println("Unfortunately Your tires got busted pls repair!!!");tires=false;engine=false;}
            if(rn>7){System.out.println("There is a pedestrian ahead, automatic Horn Activated\n        Pooop Poooop!!!!!");}
                distance=distance+a;
            }
            else
            {
                switchOff();System.out.println("You are low on fuel. Minimum fuel required: 0.51Litre\n Pls refuel");fuel=0.5;
            }
            System.out.println("Your Current Mileage is: "+distance+"km");
        }
        else
        {
            if(tires==false){System.out.print("At first pls repair ur tires and then ");}
            System.out.println("=================== Pls Start ur Engine,\n Stop wasting ur energy pushing the accelerator.\n");
        }
    }
    void start()
    {
        engine=true;
        System.out.println("Engine Started");
    }
    void switchOff()
    {
        engine=false;
        System.out.println("Engine Switched Off");
    }
    void recharge()
    {
        if(money>10)
        {
            System.out.println("How much to refuel sir? ");
            int fl=0;
            fl=k.nextInt();
            //fuel=0.5;
            if(fl>0)
            {
                if((fuel+fl)<=30)
                {
                    fuel=fuel+fl;
                }
                else{fuel=30.0;System.out.println("MaxLimit is 30, rest wasted!!!");}
                money=money-10;
                System.out.println(" Recharged"+"\nFuel Available: "+fuel+"litres");
                //introduce max limit
            }
            else{System.out.println("Sir,Are you nuts??");}
        }
        else{System.out.println("You dont have enough to recharge Ride."
                                    +"\n Ride ur Bicycle for a few days save money"
                                    +"and come back later");}
    }
    void checkFuel()
    {
        System.out.println("Available Fuel: "+fuel+" Litres");
    }
}
class Sedan extends PoweredVehicle
{
    boolean door; int distance=0;
    void openDoor()
    {
        door=true;
        System.out.println("Door opened");
    }
    void closeDoor()
    {
        door=false;
        System.out.println("Door closed");
    }
    void checkDoor()
    {
        if(door)
        {System.out.println("pls close the door its open");} else{System.out.println("door is closed");}
    }
    void makeSound()
    {
        System.out.println("Peeeeep Peeeeeeeeeep move outofta way");
    }
}
class Bicycle extends Automobile
{
    void run(int a)
    {//lock thing
        if(!lock)
        {
        if(tireHealth>0.5)
        {
            tireHealth=tireHealth-(a*0.4);
            distance=distance+a;
        }
        else{System.out.println("You have bad tires\nPls repair your tires");}
        System.out.println("Your Current Mileage is: "+distance+"km");
        money=money+a*0.125;   //<==earn money;
        }
        else{System.out.println("Open the Lock before u ride");}
    }
    boolean lock;
    
    void lockCheck()
    {
        if(lock) {System.out.println("Secured");}else{System.out.println("lockOpen");}
    }
    void openLock(){lock=false;System.out.println("Lock Opened");} 
    void closeLock(){lock=true;System.out.println("Locked");}
    void makeSound() {System.out.println("crinnng criiiiingg!!!!! pls move out of the way");}
}
class Motorbike extends PoweredVehicle
{
    int height,distance=0;
    void jump()
    {
        System.out.println("How much in meters(m)??");boolean heightFixer=true;
        while(heightFixer) 
        {
            try{   height=(int)k.nextDouble(); }
            catch(java.util.InputMismatchException ime){System.out.println("pls enter valid data");k.next(); continue; }
            if(height>0)
            {
                if(height<=10){System.out.println("Woooooooooooo!!!! That was a great Jump !!! Max height reached "
                                                      +height+"m");money=money+height*10;}
                else{System.out.println("Cannot jump that high");}
                heightFixer=false;
            }
            else
            {
                System.out.println("Pls enter the correct height to jump, i am not a drill");
                continue;
            }
        }
    }
    void makeSound()
    {
        System.out.println("Keeeeek Keeeeeeeeeek move outofta way");
    }
}