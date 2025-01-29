import java.util.*;
public class MachineLearning {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String one = "Hello! Welcome to my simple chatbot. Let's get to know each other.";
        for(int i = 0; i < one.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(one.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line
        
        String askname = "What is your name? ";
        for(int i = 0; i < askname.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(askname.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line

        System.out.print(":");
        String name = s.next();

        String meet = "Nice to meet you " + name;
        for(int i = 0; i < meet.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(meet.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line

        String intro = "Allow me to introduce myself I am Jarvis";
        for(int i = 0; i < intro.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(intro.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line

        String askage = "How old are you " + name + "?";
        for(int i = 0; i < askage.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(askage.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line

        System.out.print(":");
        int age = s.nextInt();

        String ages = "I am 19 years old";
        for(int i = 0; i < ages.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(ages.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();//new line

        String two = "What school do you go to?";    
        for(int i = 0; i < two.length(); i++){
            try{
                Thread.sleep(50);
                System.out.print(two.charAt(i));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        } 
        System.out.println();//new line

        System.out.print(": ");
        String ask1 = s.next();
        
        if(ask1.equalsIgnoreCase("STI")){ //
            String three = "wow STI'iers! what branch ka?";
            for(int i = 0; i < three.length(); i++){
                try{
                    Thread.sleep(50);
                    System.out.print(three.charAt(i));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();//new line

            System.out.print(": ");
            String ask2 = s.next();
                
            String four = "wow, STI " + ask2 + " branch ka pala. STI Global is mine.";
            for(int i = 0; i < four.length(); i++){
                try{
                    Thread.sleep(50);
                    System.out.print(four.charAt(i));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();//new line

            String five = "By the way, are you HS, SHS, or College?";
            for(int i = 0; i < five.length(); i++){
                try{
                    Thread.sleep(50);
                    System.out.print(five.charAt(i));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();//new line

            System.out.print(": ");
            String ask3 = s.next();
            if(ask3.equalsIgnoreCase("HS")){
                String six = "oh so you're currently "+ ask3 + ". good work and keep it up. Keep learning!";
                for(int i = 0; i < six.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(six.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                String seven = "I'm currently 2nd year College and looking forward to graduate. I know it's hard but keep learning. Kaya kabahan kana HAHAHAHAHAHAHAHA!!";
                for(int i = 0; i < seven.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(seven.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

            } else if (ask3.equalsIgnoreCase("SHS")){
                String eight = "oh so you're currently " + ask3 + ". what strand did you take? ";
                for(int i = 0; i < eight.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(eight.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                System.out.print(": ");
                String ask4 = s.next();

                String nine = "oh " + ask4 + ". that's good soon you will be College.";
                for(int i = 0; i < nine.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(nine.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                String ten = "I'm currently 2nd year College 2 more years to go I will be graduating. I know it's hard but keep learning. Kaya kabahan kana HAHAHAHAHAHAHAHA!!";
                for(int i = 0; i < ten.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(ten.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line
            } else if (ask3.equalsIgnoreCase("College")){
                String eleven = "oh " + ask3 + ". what course did you take? BS?";
                for(int i = 0; i < eleven.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(eleven.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                System.out.print(": ");
                String ask5 = s.next();

                if(ask5.equalsIgnoreCase("BSIT") || ask5.equalsIgnoreCase("IT")){
                    String twelve = "oh " + ask5 + ". same. What year kana? 1? 2? 3? 4?";
                    for(int i = 0; i < twelve.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(twelve.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    System.out.print(": ");
                    String ask6 = s.next();

                    String thirteen = "I see, year " + ask6 + " ka pala.";
                    for(int i = 0; i < thirteen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(thirteen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    String fourteen = "Me: Year 2, still learning and enjoying kahit stressed na. Goodluck nalang satin matira matibay HAHAHAHAHAHA";
                    for(int i = 0; i < fourteen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(fourteen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line
                } else {
                    String fifthteen = "oh " + ask5 + " that's nice. Mine is BSIT.";
                    for(int i = 0; i < fifthteen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(fifthteen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    String sixteen = "What year kana? 1? 2? 3? 4?.......";
                    for(int i = 0; i < sixteen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(sixteen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    System.out.print(": ");
                    String ask7 = s.next();

                    String seventeen = "I see, year " + ask7 + " ka na pala.";
                    for(int i = 0; i < seventeen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(seventeen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    String eighteen = "Me: Year 2, still learning and enjoying kahit stressed na. Goodluck nalang satin";
                    for(int i = 0; i < eighteen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(eighteen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                }
                
            }
            // if line ended
        } else {
            String nineteen = "wow "+ ask1 +". Mine is STI";
            for(int i = 0; i < nineteen.length(); i++){
                try{
                    Thread.sleep(50);
                    System.out.print(nineteen.charAt(i));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();//new line
     
            String twenty = "By the way, are you HS, SHS, or College?";
            for(int i = 0; i < twenty.length(); i++){
                try{
                    Thread.sleep(50);
                    System.out.print(twenty.charAt(i));
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();//new line

            System.out.print(": ");
            String ask8 = s.next();
            if(ask8.equalsIgnoreCase("HS")){
                String six = "oh so you're currently "+ ask8 + ". good work and keep it up. Keep learning!";
                for(int i = 0; i < six.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(six.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                String twentyone = "I'm currently 2nd year College and looking forward to graduate. I know it's hard but keep learning. Kaya kabahan kana HAHAHAHAHAHAHAHA!!";
                for(int i = 0; i < twentyone.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(twentyone.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

            } else if (ask8.equalsIgnoreCase("SHS")){
                String twentytwo = "oh so you're currently " + ask8 + ". what strand did you take? ";
                for(int i = 0; i < twentytwo.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(twentytwo.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                System.out.print(": ");
                String ask9 = s.next();

                String twentythree = "oh " + ask9 + ". that's good soon you will be College.";
                for(int i = 0; i < twentythree.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(twentythree.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                String twentyfour = "I'm currently 2nd year College 2 more years to go I will be graduating. I know it's hard but keep learning. Kaya kabahan kana HAHAHAHAHAHAHAHA!!";
                for(int i = 0; i < twentyfour.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(twentyfour.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line
            } else if (ask8.equalsIgnoreCase("College")){
                String twentyfive = "oh " + ask8 + ". what course did you take? BS?";
                for(int i = 0; i < twentyfive.length(); i++){
                    try{
                        Thread.sleep(50);
                        System.out.print(twentyfive.charAt(i));
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println();//new line

                System.out.print(": ");
                String ask10 = s.next();

                if(ask10.equalsIgnoreCase("BSIT") || ask10.equalsIgnoreCase("IT")){
                    String twentysix = "oh " + ask10 + ". same. What year kana? 1? 2? 3? 4?";
                    for(int i = 0; i < twentysix.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(twentysix.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    System.out.print(": ");
                    String ask11 = s.next();

                    String twentyseven = "I see, year " + ask11 + " ka pala.";
                    for(int i = 0; i < twentyseven.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(twentyseven.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    String twentyeight = "Me: Year 2, still learning and enjoying kahit stressed na. Goodluck nalang satin matira matibay HAHAHAHAHAHA";
                    for(int i = 0; i < twentyeight.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(twentyeight.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line
                } else {
                    String twentynine = "oh " + ask10 + " that's nice. Mine is BSIT.";
                    for(int i = 0; i < twentynine.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(twentynine.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    String thirty = "What year kana? 1? 2? 3? 4?.......";
                    for(int i = 0; i < thirty.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(thirty.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    System.out.print(": ");
                    String ask12 = s.next();

                    String seventeen = "I see, year " + ask12 + " ka na pala.";
                    for(int i = 0; i < seventeen.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(seventeen.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                    String thirtyone = "Me: Year 2, still learning and enjoying kahit stressed na. Goodluck nalang satin";
                    for(int i = 0; i < thirtyone.length(); i++){
                        try{
                            Thread.sleep(50);
                            System.out.print(thirtyone.charAt(i));
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println();//new line

                }
                
            }
        }
    }
}
