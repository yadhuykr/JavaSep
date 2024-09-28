package calc;

import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press\n1 for English \n2 for French");
        if (sc.nextInt() == 1) {
            System.out.println("Press\n1 for Internet \n2 for Mobile \n3 to go back to main menu");
            int input1 = sc.nextInt();

            switch (input1) {
                case 1:
                    System.out.println("You selected Internet \nPress\n1 for Billingc\n2 for Account infoc\n3 for Payment arrangement \n" +
                            "4 for technical Support");
                    int inputi2 = sc.nextInt();
                    switch (inputi2) {
                        case 1:
                            System.out.println("Here are your billing details");
                            break;
                        case 2:
                            System.out.println("Here is your account info");
                            break;
                        case 3:
                            System.out.println("Here are your payment methods");
                            break;
                        case 4:
                            System.out.println("Press\n1 to talk to an agent \n2 to talk to our automated chatbot");
                            int inputi3 = sc.nextInt();
                            if (inputi3 == 1) {
                                System.out.println("Your wait time is 200 mins");
                            } else if (inputi3 == 2) {
                                System.out.println("Please type your message");
                            } else {
                                System.out.println("Invalid option");
                            }
                            break;
                        case 5:
                            System.out.println("Going back to main menu");
                            break;
                        default:
                            System.out.println("Invalid option exiting");
                    }
                    break;
                    case 2:
                           System.out.println("You selected Mobile \nPress\n1 for Billing\n2 for Account infoc\n3 for Payment arrangement \n" +
                                   "4 for technical Support");
                          int inputm2 = sc.nextInt();
                          switch (inputm2) {
                              case 1:
                                    System.out.println("Here are your billing details");
                                    break;
                                case 2:
                                    System.out.println("Here is your account info");
                                    break;
                                case 3:
                                    System.out.println("Here are your payment methods");
                                    break;
                                case 4:
                                    System.out.println("Press \n1 to talk to an agent \n2 to talk to our automated chatbot");
                                    int inputm3 = sc.nextInt();
                                    if (inputm3 == 1) {
                                        System.out.println("Your wait time is 200 mins");
                                    } else if (inputm3 == 2) {
                                        System.out.println("Please type your message");
                                    } else {
                                        System.out.println("Invalid option");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Going back to main menu");
                                    break;
                                default:
                                    System.out.println("Invalid option exiting");
                            }
                            break;
                default:
                    System.out.println("Invalid option");
                    break;
                    }

            }
        }
    }
