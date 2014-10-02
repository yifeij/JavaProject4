/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaidecruiseline;

import java.util.*;

/**
 * Create main class
 *
 * @author Yifei
 * @version 1.0.0
 * @since 02/10/2014
 */
public class AdelaideCruiseLine {

    /**
     * Input the number of cruises and passengers, the reports will be
     * generated.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cruises do you want to create?");
        /**
         * This variable stands for the number of cruises
         */
        int No1 = input.nextInt();
        System.out.println("How many passengers do you want to create for each cruise?");
        /**
         * This variable stands for the number of passengers per cruise
         */
        int No2 = input.nextInt();
        System.out.println();
        /**
         * Create an Array of names
         */
        String[] name = {"Jeff", "Preston", "Jennifer", "Mia"};
        /**
         * Create an Array of nations
         */
        String[] nationality = {"USA", "China", "Japan", "UK"};
        /**
         * Create an Array of moneys
         */
        int[] money = {100, 200, 300, 400};
        /**
         * Create an Array of ages
         */
        String[] age = {"20-30", "31-40", "41-50", "51-60"};
        /**
         * Create an ArrayList of Group1
         */
        ArrayList<Group1> group1s = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            /**
             * Create an object of Group1
             */
            Group1 g1 = new Group1(0, "", "", 0);
            group1s.add(g1);
        }
        /**
         * Create an ArrayList of Group2
         */
        ArrayList<Group2> group2s = new ArrayList<>();
        for (int i = 0; i < 2 * No1; i++) {
            /**
             * Create an object of Group2
             */
            Group2 g2 = new Group2(null, null);
            group2s.add(g2);
        }
        /**
         * Create an ArrayList of Group3
         */
        ArrayList<Group3> group3s = new ArrayList<>();
        for (int i = 0; i < No1 * No2; i++) {
            /**
             * Create an object of Group3
             */
            Group3 g3 = new Group3(null, null);
            group3s.add(g3);
        }
        /**
         * Create a two dimension Array for counting the ratings
         */
        double[][] prating = new double[10][6];
        /**
         * Create an ArrayList of cruises
         */
        ArrayList<Cruise> cruises = new ArrayList<>();
        for (int i = 0; i < No1; i++) {
            /**
             * Create an object of cruise
             */
            Cruise c = new Cruise(i + 1);
            /**
             * Create an ArrayList of passengers
             */
            ArrayList<Passenger> passengers = new ArrayList<>();
            for (int j = 0; j < No2; j++) {
                /**
                 * Create a random integer number ranging from 0 to 3
                 */
                int random = (int) (Math.random() * 4);
                /**
                 * Create a random integer number ranging from 54 to 94
                 */
                int year = (int) (Math.random() * 41 + 54);
                /**
                 * Create a random integer number ranging from 1 to 12
                 */
                int month = (int) (Math.random() * 12 + 1);
                /**
                 * Create a random integer number ranging from 1 to 31
                 */
                int day = (int) (Math.random() * 31 + 1);
                /**
                 * Create an array of random integers ranging from 1 to 5
                 */
                int[] ratings = {(int) (Math.random() * 5 + 1),
                    (int) (Math.random() * 5 + 1),
                    (int) (Math.random() * 5 + 1),
                    (int) (Math.random() * 5 + 1),
                    (int) (Math.random() * 5 + 1),
                    (int) (Math.random() * 5 + 1)};
                /**
                 * Create an object of passenger
                 */
                Passenger p = new Passenger(j + 1, name[random], nationality[random],
                        new Date(year, month, day), money[random]);
                p.getEvaluationReport().setRatings(ratings);
                for (int t = 0; t < 6; t++) {
                    prating[i][t] += p.getEvaluationReport().getRatings()[t];
                }
                /**
                 * Calculate the passenger's age
                 */
                int ageOfPassenger = 2014 - (year + 1900);
                if (20 <= ageOfPassenger && ageOfPassenger <= 30) {
                    p.setAge(age[0]);
                } else if (30 < ageOfPassenger && ageOfPassenger <= 40) {
                    p.setAge(age[1]);
                } else if (40 < ageOfPassenger && ageOfPassenger <= 50) {
                    p.setAge(age[2]);
                } else if (50 < ageOfPassenger && ageOfPassenger <= 60) {
                    p.setAge(age[3]);
                }
                passengers.add(p);
                for (int z = 0; z < 4; z++) {
                    if (p.getNationality().equals(nationality[z])) {
                        for (int x = 0; x < 4; x++) {
                            if (p.getAge().equals(age[x])) {
                                group1s.get(z * 4 + x).setNationality(nationality[z]);
                                group1s.get(z * 4 + x).setAge(age[x]);
                                group1s.get(z * 4 + x).setNumber(group1s.get(z * 4 + x).getNumber() + 1);
                                group1s.get(z * 4 + x).setMoney((group1s.get(z * 4 + x).getMoney()
                                        + p.getMoneySpendOnCruise()));
                            }
                        }
                    }
                }
                group3s.get(i * No2 + j).setCruise(c);
                group3s.get(i * No2 + j).setPassenger(p);
            }
            c.setPassengers(passengers);
            /**
             * Create an ArrayList of sailors
             */
            ArrayList<Sailor> sailors = new ArrayList<>();
            for (int m = 0; m < 2; m++) {
                /**
                 * Create an object of sailor
                 */
                Sailor s = new Sailor(i * 2 + m + 1);
                group2s.get(i * 2 + m).setSailor(s);
                group2s.get(i * 2 + m).setCruise(c);
                if (m == 1) {
                    s.setSupervisor(sailors.get(0));
                    group2s.get(i * 2 + m).getSailor().setSupervisor(s);
                }
                sailors.add(s);

            }
            c.setSailors(sailors);
            /**
             * Create an ArrayList of ports
             */
            ArrayList<Port> ports = new ArrayList<>();
            /**
             * Create an object of port
             */
            Port p1 = new Port("Adelaide");
            /**
             * Create an object of port
             */
            Port p2 = new Port("Melbourne");
            /**
             * Create an object of port
             */
            Port p3 = new Port("Sydney");
            /**
             * Create an object of port
             */
            Port p4 = new Port("Perth");
            ports.add(p1);
            ports.add(p2);
            ports.add(p3);
            ports.add(p4);
            c.setPorts(ports);
            cruises.add(c);
        }
        // Sort Group1 by money
        Collections.sort(group1s, new Group1Comparator1());
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Money", "Nationality", "Age",
                "No of Passenger");
        for (int t = 0; t < 16; t++) {
            if (group1s.get(t).getMoney() == 0) {
                continue;
            } else {
                System.out.printf("%-20s%-20s%-20s%-20s\n", group1s.get(t).getMoney(),
                        group1s.get(t).getNationality(), group1s.get(t).getAge(),
                        group1s.get(t).getNumber());
            }

        }
        System.out.println();
        //  Sort Group1 by nationality
        Collections.sort(group1s, new Group1Comparator2());
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Money", "Nationality", "Age",
                "No of Passenger");
        for (int t = 0; t < 16; t++) {
            if (group1s.get(t).getNationality().equals("")) {
                continue;
            } else {
                System.out.printf("%-20s%-20s%-20s%-20s\n", group1s.get(t).getMoney(),
                        group1s.get(t).getNationality(), group1s.get(t).getAge(),
                        group1s.get(t).getNumber());
            }

        }
        System.out.println();
        // Sort Group1 by age
        Collections.sort(group1s, new Group1Comparator3());
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Money", "Nationality", "Age",
                "No of Passenger");
        for (int t = 0; t < 16; t++) {
            if (group1s.get(t).getAge().equals("")) {
                continue;
            } else {
                System.out.printf("%-20s%-20s%-20s%-20s\n", group1s.get(t).getMoney(),
                        group1s.get(t).getNationality(), group1s.get(t).getAge(),
                        group1s.get(t).getNumber());
            }
        }
        System.out.println();
        // Sort Group2 by hierarchy
        Collections.sort(group2s, new Group2Comparator());
        System.out.printf("%-20s%-20s%-20s\n", "Sailor Name", "Cruise Name", "Supervisor");
        for (int t = 0; t < 2 * No1; t++) {
            if (group2s.get(t).getSailor().getSupervisor() != null) {
                System.out.printf("%-20s%-20s%-20s\n",
                        "Sailor" + group2s.get(t).getSailor().getNumber(),
                        "Cruise" + group2s.get(t).getCruise().getNumber(),
                        "Sailor" + group2s.get(t).getSailor().getSupervisor().getNumber());
            } else {
                System.out.printf("%-20s%-20s%-20s\n",
                        "Sailor" + group2s.get(t).getSailor().getNumber(),
                        "Cruise" + group2s.get(t).getCruise().getNumber(), "");
            }
        }
        System.out.println();
        // Sort Group3 by money
        Collections.sort(group3s, new Group3Comparator());
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Money Spend", "Cruise Name");
        for (int t = 0; t < No1 * No2; t++) {
            System.out.printf("%-20s%-20s%-20s\n",
                    "Passenger" + group3s.get(t).getPassenger().getNumber(),
                    group3s.get(t).getPassenger().getMoneySpendOnCruise(),
                    "Cruise" + group3s.get(t).getCruise().getNumber());
        }
        System.out.println();
        // Average rating for each cruise
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Cruise Name",
                "Survey1", "Survey2", "Survey3", "Survey4", "Survey5", "Survey6");
        for (int t = 0; t < No1; t++) {
            System.out.printf("%-20s%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f\n", "Cruise" + (t + 1),
                    prating[t][0] / No2, prating[t][1] / No2, prating[t][2] / No2, prating[t][3] / No2,
                    prating[t][4] / No2, prating[t][5] / No2);
        }
    }
}
