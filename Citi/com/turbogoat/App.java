package com.turbogoat;

import com.turbogoat.view.ConsoleService;

import java.util.*;

import static java.lang.System.*;


public class App {


    private static final String NAH = "Take me back so i can see the cooler stuff you worked out!";
    private static final String SHOW_PROCESS_OF_COMPLETED_ORIGINAL = "Need a rundown? ";

    private static final String[] SUB_MENU = {SHOW_PROCESS_OF_COMPLETED_ORIGINAL, NAH};


    private static final String MAIN_MENU_OPTION_1 = "View unaltered version (to compare)";
    private static final String MAIN_MENU_OPTION_2 = "My most efficient attempt";
    private static final String MAIN_MENU_OPTION_3 = "My favorite way!";
    private static final String MAIN_MENU_OPTION_4 = "A short message";
    public static final String MAIN_MENU_LOG_OUT = "Courtesy exit option";

    private static final String[] MAIN_MENU_OPTIONS = {
            MAIN_MENU_OPTION_1,
            MAIN_MENU_OPTION_2,
            MAIN_MENU_OPTION_3,
            MAIN_MENU_OPTION_4,
            MAIN_MENU_LOG_OUT};


    private ConsoleService console;

    public App(ConsoleService consoleService) {
        this.console = consoleService;

    }


    public static void main(String[] args) {
        App app = new App(new ConsoleService(in, out));
        app.run();

    }


    public void run() {
        out.println("**************************************************************************");
        out.println("*                Hello! I am not nervous this time!                      *");
        out.println("*   ~ Enjoy a more representative display of my programming abilities ~  *");
        out.println("**************************************************************************");

        choose();
    }

    private void choose() {

        String choice = (String) console.getChoiceFromOptions(MAIN_MENU_OPTIONS);
        if (MAIN_MENU_OPTION_1.equals(choice)) {
            showUnaltered();
        } else if (MAIN_MENU_OPTION_2.equals(choice)) {
           showFirst();
        } else if (MAIN_MENU_OPTION_3.equals(choice)) {
            showSecond();
        } else if (MAIN_MENU_OPTION_4.equals(choice)) {
            ty();
        }
        else {
            // the only other option on the login menu is to exit
            exitProgram();
        }
    }




    private void showUnaltered() {
        out.println("public int addingUnique(int [] nums) {\n" +
                "\n" +
                "            int addThemUp = 0;\n" +
                "            for (int i=0; i<=nums.length; i++) {\n" +
                "                int currentValue = nums[i];\n" +
                "                boolean uniqueComparator = true;\n" +
                "\n" +
                "                for(int x=0; x < nums.length; x++) {\n" +
                "                    if(currentValue == nums[x]) {\n" +
                "                        uniqueComparator = false;\n" +
                "                    }\n" +
                "                }\n" +
                "                if (uniqueComparator){\n" +
                "                    addThemUp = addThemUp + nums[i];\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "            return addThemUp;\n" +
                "        }\n" +
                "\n" +
                "    }");
        out.println("                                                                         ");
        out.println("*************************************************************************");
        out.println("Unedited from the interview, and decided the reason this approach isnt");
        out.println("great is due to the nested for loops with nested conditionals.  ");
        choose();
    }

    private void showFirst() {
        out.println("public int sumOfUnique(int[] nums) {\n" +
                "         " +
                "            int uniqueValues = 0;    \n" +
                "            Map<Integer, Integer> mp = new HashMap<>();\n" +
                "\n" +
                "            // Traverse array elements \n" +
                "            // use the hashmap to keep count of the elements \n" +
                "                                               \n" +
                "            for(int i = 0; i < nums.length; i++)\n" +
                "                if(mp.containsKey(nums[i]))\n" +
                "                    mp.put(nums[i],mp.get(nums[i]) + 1);\n" +
                "                else\n" +
                "                    mp.put(nums[i],1);\n" +
                "            }\n" +
                "\n" +
                "            for(Map.Entry<Integer,Integer> entry : mp.entrySet())\n" +
                "            {\n" +
                "                    \n" +
                "                      // add only the ones that occur once  \n" +
                "                    if(entry.getValue() == 1)\n" +
                "                    uniqueValues += entry.getKey();\n" +
                "            }\n" +
                "\n" +
                "            return uniqueValues;\n" +
                "        }\n" +
                "}");
        out.println("                                                                         ");
        out.println("*************************************************************************");
        out.println("Chose Hashmap over sorted array as my best approach since a sorted array \n" +
                "counts duplicates, while in a Hashmap, the values of the dictionary are \n " +
                "the number of times we have seen each number.  Going from O(nlogn) to 0(n). \n" +
                " We can ignore the indexes since the keys are the values!  \n ");


        choose();

    }


    private void showSecond() {
        out.println("class Solution {\n" +
                "    public int sumOfUnique(int[] nums) {\n" +
                "        //use this array as a hashmap to keep count track of occurrence \n" +
                "           int[] map = new int[nums.length+1];\n" +
                "        for(int x : nums){\n" +
                "            map[x]++;  //this is how many times an int appeared as we iterate  \n" +
                "        }\n" +
                "        \n" +
                "        int sum = 0;\n" +
                "          //just goes through and adds integers with one occurrence by comparing the   \n" +
                "        for(int i = 0; i <= nums.length; i++){\n" +
                "            if(map[i] == 1)\n" +
                "                sum += i;\n" +
                "        }\n" +
                "        \n" +
                "        return sum;\n" +
                "    }\n" +
                "}");
        out.println("uses an array that is one longer in length than \n" +
                "the one provided in the args as \n" +
                "a hashmap. the new array length can be hardcoded if \n" +
                "\nthe constraints are given, but my code here is dynamic! ");
        choose();


    }
    private void ty() {
        out.println("Thank you for using this program. Please feel free to look through it,\n" +
                "as I built this from scratch to compromise ");
        out.println("for what was honestly just nerves.  I am a very capable and passionate programmer, \n" +
                "and I hope my hard work shows sincerity for my desire to work at Citi, \n" +
                "work ethic, and clear understanding of things.  I honestly was SO");
        out.println("nervous as I had never done a live whiteboarding session before.  \n" +
                "Thank you for the extra chance, and I hope to be working at Citi very soon!  \n" +
                "Just press 5 to exit, an enjoy your day!");
        choose();
    }








        private void exitProgram () {

            out.println("------------------------------------------------------------");
            out.println("                   TY so much.  //TODO run the app so you dont't forgt something silly, gotta  look really profesional at the end end double check to make sure nothing slipped under the radar, like a super obvious mistake because my attentsion to datia is my pride hahha...i couldve just sent an email...oh also remember to pick up non=alcoholic everclear for Saki.  Dont tell me you are actually reading this! Thank you again, I mean it. ~Ryan                        ");
            out.println("------------------------------------------------------------");

            System.exit(0);
        }


    }

